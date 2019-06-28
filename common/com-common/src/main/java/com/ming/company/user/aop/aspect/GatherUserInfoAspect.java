package com.ming.company.user.aop.aspect;


import com.google.gson.Gson;
import com.ming.company.role.entity.RoleEntity;
import com.ming.company.user.entity.UserEntity;
import com.ming.company.user.entity.UserInfoEntity;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 收集用户信息AOP
 */

@Aspect
@Component
public class GatherUserInfoAspect {


    @Pointcut("execution(* com.ming.company.user.service.UserService.getUserUseLoginName(..))")
    public void performance() {}

    @Around("performance()")
    public Object gatherUserInfo(ProceedingJoinPoint joinPoint) {
        try {
            UserEntity userEntity = (UserEntity) joinPoint.proceed();
            userEntity.getUserId();
            RoleEntity entity = new RoleEntity();
            entity.setRoleId(1);
            entity.setRoleName("fdsf");
            List<RoleEntity> roleEntityList = new ArrayList<>();
            UserInfoEntity userInfoEntity = new UserInfoEntity();
            userInfoEntity.setUserEntity(userEntity);
            roleEntityList.add(entity);
            userInfoEntity.setRoleList(roleEntityList);
            Gson gson = new Gson();
            System.out.println("MyTestAOP:  " + gson.toJson(userInfoEntity));
            return userInfoEntity;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
     return null;
    }
}
