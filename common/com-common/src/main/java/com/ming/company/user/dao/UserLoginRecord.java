package com.ming.company.user.dao;

import com.ming.company.user.entity.UserLoginRecordEntity;

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
