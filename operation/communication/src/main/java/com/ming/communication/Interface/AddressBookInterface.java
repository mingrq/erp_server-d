package com.ming.communication.Interface;

import com.google.gson.Gson;
import com.ming.company.user.service.AddressBookService;
import com.ming.utils.json.JsonFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

import static com.ming.utils.statuscode.StatusCode.DATABASEERROR;
import static com.ming.utils.statuscode.StatusCode.PARAMETERERROR;
import static com.ming.utils.statuscode.StatusCode.SUCCESS;

/**
 * 通讯录接口
 */
@Controller
@RequestMapping("/addressBook")
public class AddressBookInterface {
    @Autowired
    AddressBookService addressBookService;
    @Autowired
    JsonFrame jsonFrame;

    /**
     * 获取所有人员通讯录信息
     *
     * @return
     */
    @RequestMapping("/every")
    @ResponseBody
    public String getAddressBook() {
        //判断数据是否为空
        List userEntityList = addressBookService.getAddressBookList();
        if (userEntityList == null) {
            //空数据返回
            jsonFrame.setStatusCode(DATABASEERROR);
            jsonFrame.setMessage("没有用户");
        } else {
            //获取数据成功
            jsonFrame.setEntity(userEntityList);
            jsonFrame.setStatusCode(SUCCESS);
        }
        //将用户信息类集转为json字符串
        Gson gson = new Gson();
        return gson.toJson(userEntityList);
    }

    /**
     * 获取用户通讯信息详情
     *
     * @param userId 用户Id
     * @return
     */
    @RequestMapping(value = "/userComInfo", method = RequestMethod.POST)
    @ResponseBody
    public String getAddressBookDetail(@RequestParam(value = "userId", defaultValue = "-1") int userId) {
        Gson gson = new Gson();
        if (userId == -1) {
            jsonFrame.setStatusCode(PARAMETERERROR);
            jsonFrame.setMessage("userId为空，限制访问");
            return gson.toJson(jsonFrame);
        } else {
            //将用户信息类集转为json字符串
            Map<String, Object> userCommunicationInfo = addressBookService.getAddressBookDetail(userId);
            return gson.toJson(userCommunicationInfo);
        }
    }
}
