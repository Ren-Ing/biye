package com.huang.bishe.jpa;

import com.huang.bishe.entity.SysUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository {
    public Optional<SysUserEntity> findById(Integer id);
    List<SysUserEntity> findAll();
    void flush();
    SysUserEntity saveAndFlush(SysUserEntity user);
 }
