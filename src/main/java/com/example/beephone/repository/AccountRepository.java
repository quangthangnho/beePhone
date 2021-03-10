package com.example.beephone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.beephone.entity.AccountEntity;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long>{

}
