package com.ming.company.role.entity;

/**
 * 角色权限
 */
public class RoleLimitEntity {
    //角色id
    int roleId;
    //权限id
    int limitId;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getLimitId() {
        return limitId;
    }

    public void setLimitId(int limitId) {
        this.limitId = limitId;
    }
}
