package com.ming.company.user.service;

import com.ming.company.limits.entity.LimitEntity;
import com.ming.company.user.dao.UserLimits;
import com.ming.company.user.entity.UserLimitEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户个人权限服务
 */
@Service
public class UserLimitsService {
    @Autowired
    UserLimits userLimits;

    /**
     * 添加个人权限
     */
    void addUserLimit(UserLimitEntity entity) {
    }

    /**
     * 删除个人权限
     */
    void deleteUserLimit(UserLimitEntity entity) {
    }

    /**
     * 修改个人权限
     */
    void alterUserLimit(UserLimitEntity entity) {
    }

    /**
     * 查询个人权限
     */
    List selectUserLimit(int userId) {
        return null;
    }

    /**
     * 查询用户在组织内除临时权限的所有权限
     * 查询权限包括 组织权限 角色权限 个人权限
     *
     * @param userId 用户id
     * @return 用户权限集
     */
    public List<LimitEntity> selectAllUserLimits(int userId) {
        return userLimits.selectAllUserLimits(userId);
    }
}
