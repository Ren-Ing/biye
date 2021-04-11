package com.huang.bishe.jpa;

import com.huang.bishe.entity.SysUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<SysUserEntity,Integer> {
      public Optional<SysUserEntity> findById(Integer id);
//    List<SysUserEntity> findAll();
//    void flush();
//    SysUserEntity saveAndFlush(SysUserEntity user);
 }
