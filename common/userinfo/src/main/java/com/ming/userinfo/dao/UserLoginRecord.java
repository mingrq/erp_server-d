package com.ming.userinfo.dao;

import com.ming.userinfo.entity.UserLoginRecordEntity;

import java.util.List;

/**
 * 用户登录信息
 */
public interface UserLoginRecord {
    /**
     * 添加登录记录
     */
    void addLoginRecord(UserLoginRecordEntity userLoginRecordEntity);

    /**
     * 查询登录记录
     */
    List<UserLoginRecordEntity> getLoginRecord(int userId);
}
