package com.ming.company.user.dao;

/**
 * 用户临时权限
 */
public interface UserTemporaryLimit {
    /**
     * 添加临时权限
     */

    void addTemporaryLimit();

    /**
     * 批量添加临时权限
     */

    void addBatchTemporaryLimit();

    /**
     * 修改临时权限
     */

    void alterTemporaryLimit();

    /**
     * 批量修改临时权限
     */

    void alterBatchTemporaryLimit();

    /**
     * 查询临时权限
     */

    void selectTemporaryLimit();

}
