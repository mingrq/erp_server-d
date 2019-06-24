package com.usertest;

import com.ming.userinfo.entity.UserInfoEntity;
import com.ming.userinfo.service.UserInfoService;
import com.sql.Exceptions.SqlAddDataFailureException;
import com.sql.Exceptions.SqlDataUniqueException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.enterprise.inject.New;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserInfoTest {

    @Autowired
    UserInfoService userInfoService;
    @Autowired
    UserInfoEntity userInfoEntity;
    /**
     * 添加用户
     */
    @Test
    public void addUser() {
        userInfoEntity.setUserName("慢羊羊");
        userInfoEntity.setUserMobile("16630821566");
        userInfoEntity.setUserLoginName("manyangyang");
        //userInfoEntity.setUserPhone("565655");
        userInfoEntity.setUserLoginPw("testpassword");
        //userInfoEntity.setUserNumber("1212353454643231");
        //userInfoEntity.setUserSite("广泛的撒");
        //userInfoEntity.setUserBank("455454546546556");
        //userInfoEntity.setUserEmail("sdafasd@qq.com");
       // userInfoEntity.setUserPortrait("afasd/asfsa");
        userInfoEntity.setUserOrganization(1);
       // userInfoEntity.setUserState(0);
        try {
           UserInfoEntity entity = userInfoService.addUser(userInfoEntity);
            System.out.println(entity.toString());
        } catch (SqlDataUniqueException e) {
            e.printStackTrace();
        } catch (SqlAddDataFailureException e) {
            e.printStackTrace();
        }
    }
}
