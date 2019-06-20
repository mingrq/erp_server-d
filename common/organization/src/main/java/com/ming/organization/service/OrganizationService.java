package com.ming.organization.service;

import com.ming.organization.dao.Organization;
import com.ming.organization.entity.OrganizationEntity;
import com.sql.Exceptions.SqlDataUniqueException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.sql.SQLIntegrityConstraintViolationException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

@Component
public class OrganizationService {

    @Autowired
    private Organization organization;


    /**
     * 添加组织
     *
     * @param entity 组织实体
     */
    public int addOrganization(OrganizationEntity entity) throws SqlDataUniqueException {
        //获取当前时间转化格式
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String gentime = dateFormat.format(date);
        entity.setOrganizationGenTime(gentime);
        //添加组织
        int addResult = 0;
        try {
            addResult = organization.addOrganization(entity);
        } catch (Exception e) {
            if (e.getCause() instanceof SQLIntegrityConstraintViolationException) {
                throw new SqlDataUniqueException(e.getCause());
            }
        }
        return addResult;
    }

    /**
     * 批量添加组织
     *
     * @param organizationEntities 组织实体集合
     * @return
     */
    public int addBatchOrganization(List<OrganizationEntity> organizationEntities) throws SqlDataUniqueException {
        //获取当前时间转化格式
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String gentime = dateFormat.format(date);
        for (OrganizationEntity entity :
                organizationEntities) {
            entity.setOrganizationGenTime(gentime);
        }
        int addResult = 0;
        try {
            addResult = organization.addBatchOrganization(organizationEntities);
        } catch (Exception e) {
            if (e.getCause() instanceof SQLIntegrityConstraintViolationException) {
                throw new SqlDataUniqueException(e.getCause());
            }
        }
        return addResult;
    }

    /**
     * 删除组织
     *
     * @param organizationId 组织id
     */
    public int delectOrganization(int organizationId) {
        return organization.delectOrganization(organizationId);
    }

    /**
     * 批量删除组织
     *
     * @param organizationIds 组织id集合
     */
    public int delectBatchOrganization(List<Integer> organizationIds) {
        return organization.delectBatchOrganization(organizationIds);
    }

    /**
     * 修改组织
     *
     * @param entity 组织实体
     */
    public int alertOrganization(OrganizationEntity entity) {
        return organization.alertOrganization(entity);
    }


    /**
     * 批量修改组织
     *
     * @param organizationEntities 组织实体集合
     */
    public int alertBatchOrganization(List<OrganizationEntity> organizationEntities) {
        return organization.alertBatchOrganization(organizationEntities);
    }

    /**
     * 查询组织
     *
     * @param organizationId 组织id
     */
    public OrganizationEntity getOrganization(int organizationId) {
        return organization.getOrganization(organizationId);
    }

    /**
     * 查询所有组织
     *
     * @return List<OrganizationEntity>集合
     */
    public List<OrganizationEntity> getOrganizationList() {
        return organization.getOrganizationList();
    }

    /**
     * 查询组织名称
     *
     * @param organizationId 组织id
     * @return 组织名称
     */
    public String getOrganizationName(int organizationId) {
        return organization.getOrganizationName(organizationId);
    }

    /**
     * 查询组织创建时间
     *
     * @param organizationId 组织id
     * @return 创建时间
     */
    public String getOrganizationGenTime(int organizationId) {
        return organization.getOrganizationGenTime(organizationId);
    }

    /**
     * 查询上级组织id
     *
     * @param organizationId 组织id
     * @return 上级组织id
     */
    public int getOrganizationSuperiorId(int organizationId) {
        return organization.getOrganizationSuperiorId(organizationId);
    }
}
