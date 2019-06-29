package com.ming.company.user.service;

import com.ming.company.user.dao.UserTemporaryLimit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户临时权限服务
 */
@Service
public class UserTemporaryLimitService {
    @Autowired
    UserTemporaryLimit userTemporaryLimit;

    /**
     * 添加临时权限
     */

    public void addTemporaryLimit() {
    }

    /**
     * 批量添加临时权限
     */

    public void addBatchTemporaryLimit() {
    }

    /**
     * 修改临时权限
     */

    public void alterTemporaryLimit() {
    }

    /**
     * 批量修改临时权限
     */

    public void alterBatchTemporaryLimit() {
    }

    /**
     * 查询临时权限？根据用户id
     *
     * @param userId 用户id
     * @return 临时权限集
     */

    public List selectTemporaryLimit(int userId) {
        return userTemporaryLimit.selectTemporaryLimit(userId);
    }
}
