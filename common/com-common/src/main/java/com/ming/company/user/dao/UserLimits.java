package com.ming.company.user.dao;

import com.ming.company.limits.entity.LimitEntity;
import com.ming.company.user.entity.UserLimitEntity;
import org.springframework.stereotype.Component;

import java.util.List;

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

    /**
     * 查询用户在组织内除临时权限的所有权限
     * 查询权限包括 组织权限 角色权限 个人权限
     *
     * @param userId 用户id
     * @return 用户权限集
     */
    List<LimitEntity> selectAllUserLimits(int userId);
}
