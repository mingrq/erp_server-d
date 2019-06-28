package com.ming.company.organization.dao;

import com.ming.company.organization.entity.OrganizationLimitEntity;

/**
 * 组织权限
 */
public interface OrganizationLimits {
    /**
     * 添加组织权限
     */
    void addOrganizationLimit(OrganizationLimitEntity entity);
    /**
     * 删除组织权限
     */
    void deleteOrganizationLimit(OrganizationLimitEntity entity);
    /**
     * 修改组织权限
     */
    void alterOrganizationLimit(OrganizationLimitEntity entity);
    /**
     * 查询组织权限
     */
    void selectOrganizationLimit(int organizationId);
}
