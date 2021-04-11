package com.huang.bishe.controller;

import com.huang.bishe.entity.SysUserEntity;
import com.huang.bishe.service.SysUserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private SysUserService sysUserservice;
    private SysUserEntity sysUserEntity;


    @RequestMapping(value="login",method={RequestMethod.POST})
    public String login(@RequestParam("id") Integer id,@RequestParam("password") String password){
//          sysUserEntity = sysUserservice.findById(id);
//          System.out.println(sysUserEntity.getUsername());
//        if(user==null){
//            return "failed";
//        }
//        if(password.equals(user.getPassword()))
//        {
//            return "success";
//        }
        return "menu";
    }

    @RequestMapping("register")
    public String register(){
        SysUserEntity user = new SysUserEntity();
        user.setUsername("");
        user.setPassword("");
        sysUserservice.addUser(user);
        return "login";
    }

}
