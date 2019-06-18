package com.usertest;

import com.ming.userinfo.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(BlockJUnit4ClassRunner.class)
public class UserInfoTest {
    @Autowired
    UserInfoService userInfo;

    @Test
    public void getuser() {
        System.out.println(userInfo.getUserOrganization(2));
    }
}
