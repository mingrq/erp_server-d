package com.ming.company.user.service;

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
    void addUserLimit(UserLimitEntity entity){}
    /**
     * 删除个人权限
     */
    void deleteUserLimit(UserLimitEntity entity){}
    /**
     * 修改个人权限
     */
    void alterUserLimit(UserLimitEntity entity){}
    /**
     * 查询个人权限
     */
    List selectUserLimit(int userId){
        return null;
    }
}
