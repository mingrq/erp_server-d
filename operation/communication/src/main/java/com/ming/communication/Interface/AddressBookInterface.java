package com.ming.communication.Interface;

import com.google.gson.Gson;
import com.ming.communication.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 通讯录接口
 */
@Controller
@RequestMapping("/addressBook")
public class AddressBookInterface {
    @Autowired
    AddressBookService addressBookService;

    /**
     * 获取所有人员通讯录信息
     *
     * @return*/
    @RequestMapping("/every")
    @ResponseBody
    public String getAddressBook() {
        //将用户信息类集转为json字符串
        Gson gson = new Gson();
        return gson.toJson(addressBookService.getAddressBookList());
    }
}
