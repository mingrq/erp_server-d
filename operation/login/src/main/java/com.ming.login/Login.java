package com.ming.login;

import com.google.gson.Gson;
import com.ming.company.user.entity.UserEntity;
import com.ming.company.user.entity.UserInfoEntity;
import com.ming.company.user.service.UserService;
import com.utils.json.JsonFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.utils.statuscode.StatusCode.*;

/**
 * 登录接口
 */
@Controller
@RequestMapping("/login")
public class Login {

    @Autowired
    UserService userService;

    /**
     * 登录接口
     *
     * @param username 用户名
     * @param password 用户密码
     * @param source   登录来源
     * @param version  客户端程序版本号
     * @return json字符串
     */
    @RequestMapping(value = "/clientlogin", method = RequestMethod.GET)
    @ResponseBody
    public String ClientLogin(@RequestParam(value = "username", required = false) String username, @RequestParam(value = "password", required = false) String password, @RequestParam(value = "source", defaultValue = "-1") int source, @RequestParam(value = "version", defaultValue = "-1") int version) {
        /**
         * 准备实体类
         */
        JsonFrame jsonFrame = new JsonFrame();
        /**
         * 1、获取登录用户（用户名
         * &密码
         * &登录设备---0:app & 1:window & 2:webpage & 3：appleapp（苹果手机）
         * &程序版本号）
         * 判空传参是否完善；完善继续查询用户个人信息判断是否允许登录
         */
        if (username == null || password == null || source == -1 || version == -1) {
            //参数错误
            jsonFrame.setStatusCode(PARAMETERERROR);
            jsonFrame.setMessage("参数错误");
        } else {
            //参数都存在--获取用户个人信息
            jsonFrame = getUserInfo(username, password, source, version, jsonFrame);
        }
        //实体转变为json字符串，将json字符串返回客户端
        Gson gson = new Gson();
        String json = gson.toJson(jsonFrame);
        return json;
    }

    /**
     * 获取用户信息
     *
     * @param userLoginName 用户登录用户名
     * @param password      用户密码
     * @param source        登录来源
     * @param version       客户端程序版本号
     * @param jsonFrame     生成json实体类
     * @return json实体
     */
    private JsonFrame getUserInfo(String userLoginName, String password, int source, int version, JsonFrame jsonFrame) {
        /**
         * 2、使用用户名获取数据库用户信息
         * 判断查询结果是否存在 用户个人信息不存在反馈客户端没有这个用户
         * 用户存在继续判断用户状态：离职&在职
         */
        //用户个人信息
        UserEntity entity = (UserEntity) userService.getUserUseLoginName(userLoginName);
        //判断用户是否存在
        if (entity == null) {
            //用户不存在，反馈客户端用户不存在
            jsonFrame.setStatusCode(DATABASEERROR);
            jsonFrame.setMessage("没有该用户");
        } else {
            //用户存在，继续查询用户状态
            jsonFrame = getUserState(entity, password, source, version, jsonFrame);
        }
        return jsonFrame;
    }

    /**
     * 获取用户状态
     *
     * @param entity    用户个人信息类
     * @param password  登录密码
     * @param source    登录来源
     * @param version   客户端程序版本号
     * @param jsonFrame 生成json实体类
     * @return json实体
     */
    private JsonFrame getUserState(UserEntity entity, String password, int source, int version, JsonFrame jsonFrame) {
        /**
         * 3、判断用户是否在职：在职继续查询用户登录账号状态  正常&冻结
         * --不在职返回离职提醒
         */
        if (entity.getUserState() == 0) {
            //在职；继续查询用户账号状态
            jsonFrame = getIdentificationState(entity, password, source, version, jsonFrame);
        } else {
            //离职
            jsonFrame.setStatusCode(DIMISSION);
            jsonFrame.setMessage("用户已离职");
        }
        return jsonFrame;
    }

    /**
     * 获取用户登录账号状态
     *
     * @param entity    用户个人信息类
     * @param password  登录密码
     * @param source    登录来源
     * @param version   客户端程序版本号
     * @param jsonFrame 生成json实体类
     * @return json实体
     */
    private JsonFrame getIdentificationState(UserEntity entity, String password, int source, int version, JsonFrame jsonFrame) {
        /**
         * 4、判断用户账号是否冻结--冻结返回账号冻结信息的json
         *                        --账号正常继续查询:判断用户密码是否正确
         */
        if (entity.getIdentificationState() == 0) {
            //账号正常，判断用户密码是否正确
            jsonFrame = judgeUserIsLogin(entity, password, source, version, jsonFrame);
        } else {
            //账号已冻结，反馈客户端账号状态
            jsonFrame.setStatusCode(IDFREEZE);
            jsonFrame.setMessage("账号冻结");
        }
        return jsonFrame;
    }

    /**
     * 判断用户密码是否正确
     *
     * @param entity    用户个人信息类
     * @param password  登录密码
     * @param source    登录来源
     * @param version   客户端程序版本号
     * @param jsonFrame 生成json实体类
     * @return json实体
     */
    private JsonFrame judgeUserIsLogin(UserEntity entity, String password, int source, int version, JsonFrame jsonFrame) {
        /**
         * 5、对比密码--密码正确查询用户在组织中的所有信息（包括用户的角色集、权限集）
         * --不正确返回登录失败信息的json
         */
        if (password.equals(entity.getUserLoginPw())) {
            //密码正确
            //获取用户在组织中的所有信息
            jsonFrame = getUserInfo(entity, jsonFrame);
        } else {
            //密码错误
            jsonFrame.setStatusCode(PWERROR);
            jsonFrame.setMessage("密码错误");
        }
        return jsonFrame;
    }

    /**
     * 获取用户在组织中的所有信息（包括用户的角色集、权限集）
     *
     * @param entity    用户个人信息类
     * @param jsonFrame 生成json实体类
     * @return
     */
    private JsonFrame getUserInfo(UserEntity entity, JsonFrame jsonFrame) {
        //获取用户信息
        UserInfoEntity userInfoEntity = userService.getUserInfoUseId(entity);
        //将用户信息装入json实体类中
        jsonFrame.setEntity(userInfoEntity);
        //返回
        return jsonFrame;
    }
}
