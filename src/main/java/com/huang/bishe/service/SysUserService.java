package com.huang.bishe.service;

import com.huang.bishe.entity.SysUserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SysUserService {
    SysUserEntity findById(Integer id);
    SysUserEntity addUser(SysUserEntity sysUserEntity);
    SysUserEntity updateUser(SysUserEntity sysUserEntity);
    void deleteUser(SysUserEntity sysUserEntity);
    void deleteById(Integer id);
}
