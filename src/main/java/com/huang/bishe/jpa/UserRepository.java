package com.huang.bishe.jpa;

import com.huang.bishe.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,String> {

      Optional<UserEntity> findById(String id);
      List<UserEntity> findAll();
//      UserEntity findById(int id);
      Object saveAndFlush(UserEntity userEntity);
      Object update(UserEntity userEntity);
      void delete(UserEntity userEntity);

 }
