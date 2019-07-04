package com.ming.company.test.role;

import com.google.gson.Gson;
import com.ming.company.role.service.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class RoleTest {
    @Autowired
    RoleService roleService;
    @Test
    public void getRoleNameList(){
        List d = roleService.selectRoleByUserId(1);
        Gson gson = new Gson();

        System.out.println(gson.toJson(d));
    }
}
