package com.huang.bishe.controller;

import com.huang.bishe.serviceImpl.SysUserserviceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    private SysUserserviceImpl sysUserservice;

    @RequestMapping("login")
    public String login(){
        return "menu";
    }

    @RequestMapping("register")
    public String register(){
        return "login";
    }

}
