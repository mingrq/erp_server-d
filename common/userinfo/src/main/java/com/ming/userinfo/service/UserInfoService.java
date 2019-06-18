package com.ming.userinfo.service;

import com.ming.userinfo.entity.UserInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class UserInfoService {

    @Autowired
    UserInfoService userInfo;

    public UserInfoService() {
    }

    /**
     * 添加用户
     */
    public void addUser(UserInfoEntity userInfoEntity) {
        //获取当前时间转化格式
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String gentime = dateFormat.format(date);
        userInfoEntity.setUserGenTime(gentime);
        //添加用户
        userInfo.addUser(userInfoEntity);
    }

    /**
     * 修改用户姓名
     */
    public void alterUserName(String userName) {
        userInfo.alterUserName(userName);
    }

    /**
     * 修改用户性别
     */
    public void alterUserSex(int sex) {

    }

    /**
     * 修改用户身份证号
     */
    public void alterUserNumber(String number) {
    }

    /**
     * 修改用户电话号码
     */
    public void alterUserPhone(String phone) {
    }

    /**
     * 修改用户手机号码
     */
    public void alterUserMobile(String mobile) {
    }

    /**
     * 修改用户住址
     */
    public void alterUserSite(String site) {
    }

    /**
     * 修改用户银行卡号
     */
    public void alterUserBank(String bank) {
    }

    /**
     * 修改用户邮箱
     */
    public void alterUserEmail(String email) {
    }

    /**
     * 修改用户头像地址
     */
    public void alterUserPortrait(String portrait) {
    }

    /**
     * 修改用户状态--在职&离职
     */
    public void alterUserState(int state) {
    }

    /**
     * 修改用户登录密码
     */
    public void alterUserLoginPw(String pw) {
    }

    /**
     * 修改用户账号状态
     */
    public void alterUserIdentificationState(int identificationState) {

    }

    /**
     * 修改用户所在组织
     */
    public void alterUserOrganization(int organizationId) {

    }

    /**
     * 查询用户姓名
     */
    public String getUserName(int userId) {
        return userInfo.getUserName(userId);
    }

    /**
     * 查询用户性别
     */
    public int getUserSex(int userId) {
        return userInfo.getUserSex(userId);
    }

    /**
     * 查询用户身份证号
     */
    public String getUserNumber(int userId) {
        return userInfo.getUserNumber(userId);
    }

    /**
     * 查询用户电话号码
     */
    public String getUserPhone(int userId) {
        return userInfo.getUserPhone(userId);
    }

    /**
     * 查询用户手机号码
     */
    public String getUserMobile(int userId) {
        return userInfo.getUserMobile(userId);
    }

    /**
     * 查询用户住址
     */
    public String getUserSite(int userId) {
        return userInfo.getUserSite(userId);
    }

    /**
     * 查询用户银行卡号
     */
    public String getUserBank(int userId) {
        return userInfo.getUserBank(userId);
    }

    /**
     * 查询用户邮箱
     */
    public String getUserEmail(int userId) {
        return userInfo.getUserEmail(userId);
    }

    /**
     * 查询用户头像地址
     */
    public String getUserPortrait(int userId) {
        return userInfo.getUserPortrait(userId);
    }

    /**
     * 查询用户状态--在职&离职
     */
    public int getUserState(int userId) {
        return userInfo.getUserState(userId);
    }

    /**
     * 查询用户登录密码
     */
    public String getUserLoginPw(int userId) {
        return userInfo.getUserLoginPw(userId);
    }

    /**
     * 查询用户账号状态
     */
    public int getUserIdentificationState(int userId) {
        return userInfo.getUserIdentificationState(userId);
    }

    /**
     * 查询用户所在组织
     */
    public int getUserOrganization(int userId) {
        return userInfo.getUserOrganization(userId);
    }

    /**
     * 查询用户信息
     */
    public UserInfoEntity getUser(int id) {
        return userInfo.getUser(id);
    }
}
