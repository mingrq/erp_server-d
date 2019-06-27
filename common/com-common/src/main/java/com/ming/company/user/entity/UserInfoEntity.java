package com.ming.company.user.entity;


import com.ming.company.organization.entity.OrganizationEntity;
import com.ming.company.organization.entity.OrganizationLimitEntity;
import com.ming.company.role.entity.RoleEntity;
import com.ming.company.role.entity.RoleLimitEntity;
import org.springframework.stereotype.Component;

import javax.management.relation.Role;
import java.util.List;

/**
 * 用户信息
 */
@Component
public class UserInfoEntity {
    UserEntity userEntity;
    //用户上级组织集
    List<OrganizationEntity> organizationParentList;
    //用户个人权限集
    List<UserLimitEntity> userLimitList;
    //组织权限集
    List<OrganizationLimitEntity> organizationLimitList;
    //临时权限集
    List<UserTemporaryLimitEntity> userTemporaryLimitList;
    //角色权限集
    List<RoleLimitEntity> roleLimitList;
    //用户角色集合
    List<RoleEntity> roleList;

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public List<RoleEntity> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<RoleEntity> roleList) {
        this.roleList = roleList;
    }

    public List<OrganizationEntity> getOrganizationParentList() {
        return organizationParentList;
    }

    public void setOrganizationParentList(List<OrganizationEntity> organizationParentList) {
        this.organizationParentList = organizationParentList;
    }

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
