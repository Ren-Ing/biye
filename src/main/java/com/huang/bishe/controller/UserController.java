package com.huang.bishe.controller;

import com.huang.bishe.entity.UserEntity;
import com.huang.bishe.serviceImpl.UserServiceImpl;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserServiceImpl sysUserServiceimpl;

    @RequestMapping(value="/login",method={RequestMethod.GET})
    public String login(@RequestParam("id") Integer id,@RequestParam("password") String password){
        UserEntity sysUserEntity = sysUserServiceimpl.findById(id).get();
        String name = sysUserEntity.getUsername();
        System.out.println(name);
        if(sysUserEntity==null){
            return "failed";
        }
        if(password.equals(sysUserEntity.getPassword()))
        {
            return "success";
        }
        return "menu";
    }

    @RequestMapping(value = "/register",method = {RequestMethod.POST})
    public String register(@RequestParam("id") String id,@RequestParam("password") String password){
        UserEntity user = new UserEntity();
        user.setUsername("");
        user.setPassword("");
//        sysUserservice.addUser(user);
        return "login";
    }

}
