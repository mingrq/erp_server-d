package com.ming.company.user.service;

import com.ming.company.user.dao.User;
import com.ming.company.user.entity.UserEntity;
import com.sql.Exceptions.SqlAddDataFailureException;
import com.sql.Exceptions.SqlDataUniqueException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class UserService {

    @Autowired
    User user;

    public UserService() {
    }

    /**
     * 添加用户
     */
    public UserEntity addUser(UserEntity userEntity) throws SqlDataUniqueException, SqlAddDataFailureException {
        //获取当前时间转化格式
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String gentime = dateFormat.format(date);
        userEntity.setUserGenTime(gentime);
        try {
            //添加用户
            int addResult = user.addUser(userEntity);
            if (addResult<1){
                throw new SqlAddDataFailureException();
            }
        }catch (Exception e){
            if( e.getCause() instanceof SQLIntegrityConstraintViolationException){
                throw new SqlDataUniqueException(e.getCause());
            }
        }
       return userEntity;
    }

    /**
     * 修改用户
     */
    public void alterUser(UserEntity userEntity) {
        user.alterUser(userEntity);
    }

    /**
     * 查询用户姓名
     */
    public String getUserName(int userId) {
        return user.getUserName(userId);
    }

    /**
     * 查询用户性别
     */
    public int getUserSex(int userId) {
        return user.getUserSex(userId);
    }

    /**
     * 查询用户身份证号
     */
    public String getUserNumber(int userId) {
        return user.getUserNumber(userId);
    }

    /**
     * 查询用户电话号码
     */
    public String getUserPhone(int userId) {
        return user.getUserPhone(userId);
    }

    /**
     * 查询用户手机号码
     */
    public String getUserMobile(int userId) {
        return user.getUserMobile(userId);
    }

    /**
     * 查询用户住址
     */
    public String getUserSite(int userId) {
        return user.getUserSite(userId);
    }

    /**
     * 查询用户银行卡号
     */
    public String getUserBank(int userId) {
        return user.getUserBank(userId);
    }

    /**
     * 查询用户邮箱
     */
    public String getUserEmail(int userId) {
        return user.getUserEmail(userId);
    }

    /**
     * 查询用户头像地址
     */
    public String getUserPortrait(int userId) {
        return user.getUserPortrait(userId);
    }

    /**
     * 查询用户状态--在职&离职
     */
    public int getUserState(int userId) {
        return user.getUserState(userId);
    }

    /**
     * 查询用户登录密码
     */
    public String getUserLoginPw(int userId) {
        return user.getUserLoginPw(userId);
    }

    /**
     * 查询用户账号状态
     */
    public int getUserIdentificationState(int userId) {
        return user.getUserIdentificationState(userId);
    }

    /**
     * 查询用户所在组织
     */
    public int getUserOrganization(int userId) {
        return user.getUserOrganization(userId);
    }

    /**
     * 查询用户信息
     */
    public UserEntity getUserUseId(int id) {
        return user.getUserUseId(id);
    }

    /**
     * 查询用户信息-根据登录用户名
     */
    public UserEntity getUserUseLoginName(String userLoginName){
        return user.getUserUseLoginName(userLoginName);
    }
}
