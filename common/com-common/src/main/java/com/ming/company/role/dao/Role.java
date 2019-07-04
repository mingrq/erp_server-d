package com.ming.company.role.dao;


import com.ming.company.role.entity.RoleEntity;

import java.util.List;
import java.util.Map;

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
    List<RoleEntity> selectRole(int roleId);

    /**
     * 查询角色
     * @param userId 用户id
     * @return 用户角色集
     */
    List<Map> selectRoleByUserId(int userId);
}
