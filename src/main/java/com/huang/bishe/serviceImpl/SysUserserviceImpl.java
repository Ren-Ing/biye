package com.huang.bishe.serviceImpl;

import com.huang.bishe.jpa.UserRepository;
import com.huang.bishe.service.SysUserservice;
import com.huang.bishe.entity.SysUserEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class SysUserserviceImpl implements SysUserservice {
    @Autowired
    private UserRepository userRepository;
    @Override
    public SysUserEntity findById(Integer id) {
        Optional<SysUserEntity> op = userRepository.findById(id);
        if(op==null){
            return null;
        }
        return op.get();
    }

    @Override
    public SysUserEntity addUser(SysUserEntity sysUserEntity) {
        return userRepository.saveAndFlush(sysUserEntity);
    }

    @Override
    public SysUserEntity updateUser(SysUserEntity sysUserEntity) {
        return userRepository.saveAndFlush(sysUserEntity);
    }

    @Override
    public void deleteUser(SysUserEntity sysUserEntity) {
        userRepository.delete(sysUserEntity);
    }

    @Override
    public void deleteByid(Integer id) {
        userRepository.deleteById(id);
    }
}
