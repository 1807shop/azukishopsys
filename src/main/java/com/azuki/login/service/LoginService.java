package com.azuki.login.service;

import com.azuki.login.pojo.UserInfo;

/**
 * @Author: lew1sss
 * @Date: 2019/4/16 0016 10:22
 */
public interface LoginService {

    /**
     * 检验返回的账号是否合服后台系统的登录规则
     * @param userInfo
     * @return
     */
    public boolean LoginCheck(UserInfo userInfo);


}
