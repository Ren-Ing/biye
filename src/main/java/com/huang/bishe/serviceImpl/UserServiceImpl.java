package com.huang.bishe.serviceImpl;

import com.huang.bishe.entity.UserEntity;
import com.huang.bishe.jpa.UserRepository;
import com.huang.bishe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    @Override
    public List<UserEntity> listAll() {
        return null;
    }

    @Override
    public UserEntity findById(String id) {
        Optional<UserEntity> op = userRepository.findById(id);
        if(op==null){
            return null;
        }
        return op.get();
    }

    @Override
    public int save(UserEntity userEntity) {
        return 0;
    }

    @Override
    public int update(UserEntity userEntity) {
        return 0;
    }

    @Override
    public int delete(UserEntity userEntity) {
        return 0;
    }

    @Override
    public Optional<UserEntity> findById(int id) {
        return Optional.empty();
    }

//    @Override
//    public SysUserEntity addUser(SysUserEntity sysUserEntity) {
//        return userRepository.saveAndFlush(sysUserEntity);
//    }
//
//    @Override
//    public SysUserEntity updateUser(SysUserEntity sysUserEntity) {
//        return userRepository.saveAndFlush(sysUserEntity);
//    }
//
//    @Override
//    public void deleteUser(SysUserEntity sysUserEntity) {
//        userRepository.delete(sysUserEntity);
//    }
//
//    @Override
//    public void deleteById(Integer id) {
//        userRepository.deleteById(id);
//    }
}
