package com.ming.company.role.dao;


import com.ming.company.role.entity.RoleLimitEntity;

/**
 * 角色权限
 */
public interface RoleLimits {
    /**
     * 添加角色权限
     */
    void addRoleLimits(RoleLimitEntity entity);
    /**
     * 删除角色权限
     */
    void deleteRoleLimits(RoleLimitEntity entity);
    /**
     * 修改角色权限
     */
    void alterRoleLimits(RoleLimitEntity entity);
    /**
     * 查询角色权限
     */
    void selectRoleLimits(RoleLimitEntity entity);
}
