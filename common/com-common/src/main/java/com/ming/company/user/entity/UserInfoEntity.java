package com.ming.company.user.entity;


import com.ming.company.organization.entity.OrganizationLimitEntity;
import com.ming.company.role.entity.RoleLimitEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户信息
 */
@Component
public class UserInfoEntity extends UserEntity{
    //用户所在组织集合
    //用户个人权限集
    List<UserLimitEntity> userLimitList;
    //组织权限集
    List<OrganizationLimitEntity> organizationLimitList;
    //临时权限集
    List<UserTemporaryLimitEntity> userTemporaryLimitList;
    //角色权限集
    List<RoleLimitEntity> roleLimitList;

    public List<UserLimitEntity> getUserLimitList() {
        return userLimitList;
    }

    public void setUserLimitList(List<UserLimitEntity> userLimitList) {
        this.userLimitList = userLimitList;
    }

    public List<OrganizationLimitEntity> getOrganizationLimitList() {
        return organizationLimitList;
    }

    public void setOrganizationLimitList(List<OrganizationLimitEntity> organizationLimitList) {
        this.organizationLimitList = organizationLimitList;
    }

    public List<UserTemporaryLimitEntity> getUserTemporaryLimitList() {
        return userTemporaryLimitList;
    }

    public void setUserTemporaryLimitList(List<UserTemporaryLimitEntity> userTemporaryLimitList) {
        this.userTemporaryLimitList = userTemporaryLimitList;
    }

    public List<RoleLimitEntity> getRoleLimitList() {
        return roleLimitList;
    }

    public void setRoleLimitList(List<RoleLimitEntity> roleLimitList) {
        this.roleLimitList = roleLimitList;
    }
}
