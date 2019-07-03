package com.ming.communication.service;

import com.ming.communication.dao.Communication;
import com.ming.company.user.entity.UserEntity;
import com.utils.json.JsonFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import static com.utils.statuscode.StatusCode.DATABASEERROR;
import static com.utils.statuscode.StatusCode.SUCCESS;

@Service
public class AddressBookService {

    @Autowired
    Communication communication;


    /**
     * 获取通讯录
     * <p>
     * 获取数据库中所有用户信息类集合
     * 判断集合是否为空
     * 根据判断返回结果
     *
     * @return
     */
    public JsonFrame getAddressBookList() {
        List userEntityList = communication.getAddressBookList();
        JsonFrame jsonFrame = new JsonFrame();
        //判断数据是否为空
        if (userEntityList == null) {
            //空数据返回
            jsonFrame.setStatusCode(DATABASEERROR);
            jsonFrame.setMessage("没有用户");
        } else {
            //获取数据成功
            jsonFrame.setEntity(userEntityList);
            jsonFrame.setStatusCode(SUCCESS);
        }
        return jsonFrame;
    }

    /*获取通讯录详情*/
    public Map getAddressBookDetail(int userId) {
        Map userInfo = communication.getAddressBookDetail(userId);
        userInfo.get("userId");
        return map;
    }
}
