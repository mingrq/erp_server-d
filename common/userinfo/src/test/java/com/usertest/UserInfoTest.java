package com.usertest;

import com.ming.userinfo.service.UserInfoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserInfoTest {
    @Autowired
    UserInfoService userInfo;

    @Test
    public void getuser() {
        System.out.println(userInfo.getUserOrganization(2));
    }
}
