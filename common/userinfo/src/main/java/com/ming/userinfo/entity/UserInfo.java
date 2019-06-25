package com.ming.userinfo.entity;

public class UserInfo extends UserInfoEntity {

    //用户个人权限
    UserPersonalPermissionsEntity userPersonalPermissionsEntity;

    public UserPersonalPermissionsEntity getUserPersonalPermissionsEntity() {
        return userPersonalPermissionsEntity;
    }

    public void setUserPersonalPermissionsEntity(UserPersonalPermissionsEntity userPersonalPermissionsEntity) {
        this.userPersonalPermissionsEntity = userPersonalPermissionsEntity;
    }
}
