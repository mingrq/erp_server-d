package com.ming.company.user.entity;

/**
 * 用户权限
 */
public class UserLimitEntity {
    //用户id
    int UserId;
    //权限id
    int LimitId;

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int getLimitId() {
        return LimitId;
    }

    public void setLimitId(int limitId) {
        LimitId = limitId;
    }
}
