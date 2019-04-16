package com.azuki.login.service.impl;

import com.azuki.login.mapper.LoginMapper;
import com.azuki.login.pojo.UserInfo;
import com.azuki.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lew1sss
 * @Date: 2019/4/16 0016 10:29
 */

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginMapper loginMapper;

    public boolean LoginCheck(UserInfo userInfo) {
        UserInfo userInfo1 = this.loginMapper.LoginCheck(userInfo);
        if (userInfo==null){
            return false;
        }
        if (userInfo1.getStatus()!=2){
            return false;
        }
        return true;
    }


}
