package com.azuki.login.controller;

import com.azuki.login.pojo.UserInfo;
import com.azuki.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


/**
 * @Author: lew1sss
 * @Date: 2019/4/16 0016 10:44
 */

@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @ResponseBody
    @RequestMapping(value = "LoginCheck",method = RequestMethod.POST)
    public String LoginCheck(@RequestBody UserInfo userInfo, HttpSession httpSession){
        Boolean flag = false;
        flag = this.loginService.LoginCheck(userInfo);
        if (flag){
            httpSession.setAttribute("userInfo",userInfo);
        }
        return flag.toString();
    }

    @ResponseBody
    @RequestMapping(value = "Logout",method = RequestMethod.POST)
    public void Logout(HttpSession httpSession){
        httpSession.removeAttribute("userInfo");
    }

    @ResponseBody
    @RequestMapping(value = "getUserInfo",method = RequestMethod.POST)
    public UserInfo getUserInfo(HttpSession httpSession){
        UserInfo userInfo = (UserInfo) httpSession.getAttribute("userInfo");
        return userInfo;
    }
}

