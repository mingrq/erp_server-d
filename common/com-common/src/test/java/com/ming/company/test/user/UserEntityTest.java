package com.ming.company.test.user;

import com.ming.company.user.entity.UserEntity;
import com.ming.company.user.service.UserService;
import com.sql.Exceptions.SqlAddDataFailureException;
import com.sql.Exceptions.SqlDataUniqueException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserEntityTest {

    @Autowired
    UserService userService;
    @Autowired
    UserEntity userEntity;

    /**
     * 添加用户
     */
    @Test
    public void addUser() {
        userEntity.setUserName("慢羊羊");
        userEntity.setUserMobile("16630821566");
        userEntity.setUserLoginName("manyangyang");
        //userEntity.setUserPhone("565655");
        userEntity.setUserLoginPw("testpassword");
        //userEntity.setUserNumber("1212353454643231");
        //userEntity.setUserSite("广泛的撒");
        //userEntity.setUserBank("455454546546556");
        //userEntity.setUserEmail("sdafasd@qq.com");
        // userEntity.setUserPortrait("afasd/asfsa");
        userEntity.setUserOrganization(1);
        // userEntity.setUserState(0);
        try {
            UserEntity entity = userService.addUser(userEntity);
            System.out.println(entity.toString());
        } catch (SqlDataUniqueException e) {
            e.printStackTrace();
        } catch (SqlAddDataFailureException e) {
            e.printStackTrace();
        }
    }

    /**
     * 查询用户信息-根据登录用户名
     */
    @Test
    public void getUserUseLoginName() {
        UserEntity entity = userService.getUserUseLoginName("manyangyang");
        System.out.println(entity.toString());
    }
}
