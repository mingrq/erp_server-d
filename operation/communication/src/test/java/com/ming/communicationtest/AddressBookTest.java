package com.ming.communicationtest;

import com.google.gson.Gson;
import com.ming.communication.service.AddressBookService;
import com.utils.json.JsonFrame;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AddressBookTest {

    @Autowired
    AddressBookService addressBookService;

    /**
     * 获取所有人员通讯录信息
     *
     * @return
     */
    @Test
    public void getAddressBook() {
        //将用户信息类集转为json字符串
        Gson gson = new Gson();
        JsonFrame jsonFrame = addressBookService.getAddressBookList();
        String json = gson.toJson(jsonFrame);
        System.out.println(json);
    }
}
