package com.huang.bishe.serviceImpl;

import com.huang.bishe.jpa.UserRepository;
import com.huang.bishe.service.SysUserService;
import com.huang.bishe.entity.SysUserEntity;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.Optional;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
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
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }
}
