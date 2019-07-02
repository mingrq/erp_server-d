package com.ming.company.user.entity;

/**
 * 用户权限
 */
public class UserLimitEntity {
    //用户id
    int userId;
    //权限id
    int limitId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getLimitId() {
        return limitId;
    }

    public void setLimitId(int limitId) {
        this.limitId = limitId;
    }
}
