package com.ming.company.role.entity;

/**
 * 角色
 */
public class RoleEntity {
    //角色id
    int RoleId;
    //角色名称
    String RoleName;
    //角色创建时间
    String RoleGenTime;

    public int getRoleId() {
        return RoleId;
    }

    public void setRoleId(int roleId) {
        RoleId = roleId;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String roleName) {
        RoleName = roleName;
    }

    public String getRoleGenTime() {
        return RoleGenTime;
    }

    public void setRoleGenTime(String roleGenTime) {
        RoleGenTime = roleGenTime;
    }
}
