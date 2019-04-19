package com.azuki.login.mapper;

import com.azuki.login.pojo.UserInfo;

/**
 * @Author: lew1sss
 * @Date: 2019/4/16 0016 10:08
 */
public interface LoginMapper {

    /**
     * 传入账号和密码,从数据库返回相应的账号
     * @param userInfo
     * @return
     */
    public UserInfo LoginCheck(UserInfo userInfo);


}
