package com.ming.company.user.dao;

import com.ming.company.user.entity.UserLimitEntity;

/**
 * 用户个人权限
 */
public interface UserLimits {
    /**
     * 添加个人权限
     */
    void addUserLimit(UserLimitEntity entity);
    /**
     * 删除个人权限
     */
    void deleteUserLimit(UserLimitEntity entity);
    /**
     * 修改个人权限
     */
    void alterUserLimit(UserLimitEntity entity);
    /**
     * 查询个人权限
     */
    void selectUserLimit(int userId);
}
