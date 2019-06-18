package com.ming.organizationtest;

import com.ming.organization.dao.Organization;
import com.ming.organization.entity.OrganizationEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

public class OrganizationTest {

    @Autowired
    OrganizationEntity organization;

    @Test
    public void getOrganizationNameTest(){

        System.out.println(organization.toString());
    }
}
