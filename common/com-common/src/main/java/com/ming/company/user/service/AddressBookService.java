package com.ming.company.user.service;

import com.ming.company.organization.service.OrganizationService;
import com.ming.company.role.entity.RoleEntity;
import com.ming.company.role.service.RoleService;
import com.ming.company.user.dao.UserCommunication;
import com.ming.utils.json.JsonFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.ming.utils.statuscode.StatusCode.DATABASEERROR;
import static com.ming.utils.statuscode.StatusCode.SUCCESS;

@Service
public class AddressBookService {

    @Autowired
    UserCommunication communication;
    @Autowired
    RoleService roleService;
    @Autowired
    OrganizationService organizationService;

    /**
     * 获取通讯录
     * <p>
     * 获取数据库中所有用户信息类集合
     * 判断集合是否为空
     * 根据判断返回结果
     *
     * @return
     */
    public List getAddressBookList() {
        return communication.getAddressBookList();
    }

    /**
     * 获取通讯录详情
     *
     * @param userId 用户id
     * @return
     */
    public Map<String, Object> getAddressBookDetail(int userId) {
        //新建用户通讯详情Map
        Map<String, Object> userCommunicationInfo = new HashMap<>();
        //获取用户通讯信息
        Map userAddressBookInfo = communication.getAddressBookDetail(userId);
        //获取用户角色集
        List<RoleEntity> roleList = roleService.selectRoleByUserId(userId);
        //获取用户所在公司与子公司集
        List companyInfoList  = organizationService.getCompanyAndSon((Integer) userAddressBookInfo.get("organizationId"));
        //整合用户通讯详情
        userCommunicationInfo.put("roleList",roleList);
        userCommunicationInfo.put("userAddressBookInfo",userAddressBookInfo);
        userCommunicationInfo.put("companyInfoList",companyInfoList);
        return userCommunicationInfo;
    }
}
