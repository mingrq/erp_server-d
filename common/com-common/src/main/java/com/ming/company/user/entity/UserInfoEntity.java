package com.ming.company.user.entity;


import com.ming.company.limits.entity.LimitEntity;
import com.ming.company.role.entity.RoleEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户信息
 */
@Component
public class UserInfoEntity {
    //用户个人信息
    UserEntity userEntity;
    //用户权限集
    List<LimitEntity> limitList;
    //临时权限集
    List<UserTemporaryLimitEntity> userTemporaryLimitList;
    //用户角色集合
    List<RoleEntity> roleList;

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public List<LimitEntity> getLimitList() {
        return limitList;
    }

    public void setLimitList(List<LimitEntity> limitList) {
        this.limitList = limitList;
    }

    public List<UserTemporaryLimitEntity> getUserTemporaryLimitList() {
        return userTemporaryLimitList;
    }

    public void setUserTemporaryLimitList(List<UserTemporaryLimitEntity> userTemporaryLimitList) {
        this.userTemporaryLimitList = userTemporaryLimitList;
    }

    public List<RoleEntity> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<RoleEntity> roleList) {
        this.roleList = roleList;
    }
}
