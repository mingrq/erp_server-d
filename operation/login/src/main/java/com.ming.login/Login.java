package com.ming.login;

import com.google.gson.Gson;
import com.ming.user.userinfo.entity.UserInfoEntity;
import com.ming.user.userinfo.service.UserInfoService;
import com.utils.json.JsonFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.sql.Exceptions.StatusCode.*;

/**
 * 登录接口
 */
@Controller
@RequestMapping("/login")
public class Login {

    @Autowired
    UserInfoService userInfoService;

    /**
     * 登录接口
     *
     * @param username
     * @param password
     * @return
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
         * 判空
         */
        if (username == null || password == null || source == -1 || version == -1) {
            //参数错误
            jsonFrame.setStatusCode(PARAMETERERROR);
            jsonFrame.setMessage("参数错误");
        } else {
            //参数都存在
            jsonFrame = getUserInfo(username, password, source, version, jsonFrame);
        }
        Gson gson = new Gson();
        String json  = gson.toJson(jsonFrame);
        return json;
    }

    private JsonFrame getUserInfo(String userLoginName, String password, int source, int version, JsonFrame jsonFrame) {
        /**
         * 2、使用用户名获取数据库用户信息
         */
        UserInfoEntity entity = userInfoService.getUserUseLoginName(userLoginName);
        if (entity == null) {
            jsonFrame.setStatusCode(DATABASEERROR);
            jsonFrame.setMessage("没有该用户");
        } else {
            jsonFrame = getUserState(entity, password, source, version, jsonFrame);
        }
        return jsonFrame;
    }

    private JsonFrame getUserState(UserInfoEntity entity, String password, int source, int version, JsonFrame jsonFrame) {
        /**
         * 3、判断用户是否在职--在职继续对比
         * --不在职返回离职提醒
         */
        if (entity.getUserState() == 0) {
            //在职
            jsonFrame = getIdentificationState(entity, password, source, version, jsonFrame);
        } else {
            //离职
            jsonFrame.setStatusCode(DIMISSION);
            jsonFrame.setMessage("用户已离职");
        }
        return jsonFrame;
    }

    private JsonFrame getIdentificationState(UserInfoEntity entity, String password, int source, int version, JsonFrame jsonFrame) {
        /**
         * 4、判断用户账号是否冻结--冻结返回账号冻结信息的json
         *                        --账号正常继续对比
         */
        if (entity.getIdentificationState() == 0) {
            //正常
            jsonFrame = judgeUserIsLogin(entity, password, source, version, jsonFrame);
        } else {
            //冻结
            jsonFrame.setStatusCode(IDFREEZE);
            jsonFrame.setMessage("账号冻结");
        }
        return jsonFrame;
    }

    private JsonFrame judgeUserIsLogin(UserInfoEntity entity, String password, int source, int version, JsonFrame jsonFrame) {
        /**
         * 5、对比密码--正确返回用户信息的json
         * --不正确返回登录失败信息的json
         */
        if (password.equals(entity.getUserLoginPw())) {
            //密码正确
            entity.setUserLoginPw(null);
            jsonFrame.setEntity(entity);

            //记录登录记录
            setLoginRecord(source, version);
        } else {
            //密码错误
            jsonFrame.setStatusCode(PWERROR);
            jsonFrame.setMessage("密码错误");
        }
        return jsonFrame;
    }

    private void setLoginRecord(int source, int version) {
        /**
         * 6、将登录信息保存到数据库
         */
    }
}
