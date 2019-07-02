package com.ming.company.role.entity;

/**
 * 角色
 */
public class RoleEntity {
    //角色id
    int roleId;
    //角色名称
    String roleName;
    //角色创建时间
    String roleGenTime;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleGenTime() {
        return roleGenTime;
    }

    public void setRoleGenTime(String roleGenTime) {
        this.roleGenTime = roleGenTime;
    }
}
