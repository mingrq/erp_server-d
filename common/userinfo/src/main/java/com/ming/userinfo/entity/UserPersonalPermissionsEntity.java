package com.ming.userinfo.entity;

/**
 * 用户个人权限
 */
public class UserPersonalPermissionsEntity {

    //权限id
    private int PermissionId;
    //权限名称
    private String PermissionName;

    public int getPermissionId() {
        return PermissionId;
    }

    public void setPermissionId(int permissionId) {
        PermissionId = permissionId;
    }

    public String getPermissionName() {
        return PermissionName;
    }

    public void setPermissionName(String permissionName) {
        PermissionName = permissionName;
    }
}
