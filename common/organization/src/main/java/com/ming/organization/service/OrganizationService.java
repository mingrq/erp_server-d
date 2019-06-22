package com.ming.organization.service;

import com.ming.organization.dao.Organization;
import com.ming.organization.entity.OrganizationEntity;
import com.sql.Exceptions.SqlAddDataFailureException;
import com.sql.Exceptions.SqlAlterFailureException;
import com.sql.Exceptions.SqlDataUniqueException;
import org.apache.ibatis.type.Alias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLIntegrityConstraintViolationException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class OrganizationService {

    @Autowired
    private Organization organization;


    /**
     * 添加组织
     *
     * @param entity 组织实体
     */
    public OrganizationEntity addOrganization(OrganizationEntity entity) throws SqlDataUniqueException, SqlAddDataFailureException {
        //获取当前时间转化格式
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String gentime = dateFormat.format(date);
        entity.setOrganizationGenTime(gentime);
        //添加组织
        try {
            int addResult = organization.addOrganization(entity);
            //添加数据失败时报错
            if (addResult < 1) {
                throw new SqlAddDataFailureException();
            }
        } catch (Exception e) {
            if (e.getCause() instanceof SQLIntegrityConstraintViolationException) {
                throw new SqlDataUniqueException(e.getCause());
            }
        }
        return entity;
    }

    /**
     * 批量添加组织
     *
     * @param organizationEntities 组织实体集合
     * @return
     */
    public List<OrganizationEntity> addBatchOrganization(List<OrganizationEntity> organizationEntities) throws SqlDataUniqueException, SqlAddDataFailureException {
        //获取当前时间转化格式
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String gentime = dateFormat.format(date);
        for (OrganizationEntity entity :
                organizationEntities) {
            entity.setOrganizationGenTime(gentime);
        }
        try {
            int addBatchResult = organization.addBatchOrganization(organizationEntities);
            //添加数据失败时报错
            if (addBatchResult < organizationEntities.size()) {
                throw new SqlAddDataFailureException();
            }
        } catch (Exception e) {
            if (e.getCause() instanceof SQLIntegrityConstraintViolationException) {
                throw new SqlDataUniqueException(e.getCause());
            }
        }
        return organizationEntities;
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
    public int alertOrganization(OrganizationEntity entity) throws SqlAlterFailureException {
        int alterResult = organization.alertOrganization(entity);
        if (alterResult<1){
            throw new SqlAlterFailureException();
        }
        return alterResult;
    }


    /**
     * 批量修改组织
     *
     * @param organizationEntities 组织实体集合
     */
    public int alertBatchOrganization(List<OrganizationEntity> organizationEntities) {

        int alterBatchResult =organization.alertBatchOrganization(organizationEntities);
        return alterBatchResult;
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
    public OrganizationEntity getOrganizationSuperior(int organizationId) {
        return organization.getOrganizationSuperior(organizationId);
    }
}
