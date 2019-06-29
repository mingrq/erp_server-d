package com.ming.company.role.service;

import com.ming.company.role.dao.Role;
import com.ming.company.role.entity.RoleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 角色服务
 */
@Service
public class RoleService {

    @Autowired
    Role role;

    /**
     * 添加角色
     */
    public int addRole(RoleEntity entity) {
        return 0;
    }

    /**
     * 删除角色
     */
    public int deleteRole(RoleEntity entity) {
        return 0;
    }

    /**
     * 修改角色
     */
    public void alterRole(RoleEntity entity) {
    }

    /**
     * 查询角色
     *
     * @param userId 用户id
     * @return 用户角色集
     */
    public List selectRoleByUserId(int userId) {
        return role.selectRoleByUserId(userId);
    }
}
