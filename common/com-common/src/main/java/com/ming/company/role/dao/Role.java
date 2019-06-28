package com.ming.company.role.dao;


import com.ming.company.role.entity.RoleEntity;

/**
 * 角色权限
 */
public interface Role {
    /**
     * 添加角色
     */
    int addRole(RoleEntity entity);

    /**
     * 删除角色
     */
    int deleteRole(RoleEntity entity);

    /**
     * 修改角色
     */
    void alterRole(RoleEntity entity);

    /**
     * 查询角色
     */
    RoleEntity selectRole(int roleId);
}
