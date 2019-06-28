package com.ming.company.role.entity;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 角色信息
 */
@Component
public class RoleInfoEntity {
    //角色信息
    RoleEntity roleEntity;
    //角色权限集
    List<RoleLimitEntity> roleLimitList;

    public RoleEntity getRoleEntity() {
        return roleEntity;
    }

    public void setRoleEntity(RoleEntity roleEntity) {
        this.roleEntity = roleEntity;
    }

    public List<RoleLimitEntity> getRoleLimitList() {
        return roleLimitList;
    }

    public void setRoleLimitList(List<RoleLimitEntity> roleLimitList) {
        this.roleLimitList = roleLimitList;
    }
}
