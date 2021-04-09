package com.huang.bishe.service;

import com.huang.bishe.entity.SysUserEntity;

import java.util.List;

public interface SysUserservice {
    public SysUserEntity findById(Integer id);
    SysUserEntity addUser(SysUserEntity sysUserEntity);
    SysUserEntity updateUser(SysUserEntity sysUserEntity);
    void deleteUser(SysUserEntity sysUserEntity);
    void deleteByid(Integer id);
}
