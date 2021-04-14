package com.huang.bishe.service;

import com.huang.bishe.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
      List<UserEntity> listAll();
      UserEntity findById(String id);
      int save(UserEntity userEntity);
      int update(UserEntity userEntity);
      int delete(UserEntity userEntity);
      Optional<UserEntity> findById(int id);
//    SysUserEntity addUser(SysUserEntity sysUserEntity);
//    SysUserEntity updateUser(SysUserEntity sysUserEntity);
//    void deleteUser(SysUserEntity sysUserEntity);
//    void deleteById(Integer id);
}
