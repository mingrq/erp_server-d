package com.ming.company.role.entity;

/**
 * 角色权限
 */
public class RoleLimitEntity {
    //角色id
    int RoleId;
    //权限id
    int LimitId;

    public int getRoleId() {
        return RoleId;
    }

    public void setRoleId(int roleId) {
        RoleId = roleId;
    }

    public int getLimitId() {
        return LimitId;
    }

    public void setLimitId(int limitId) {
        LimitId = limitId;
    }
}
