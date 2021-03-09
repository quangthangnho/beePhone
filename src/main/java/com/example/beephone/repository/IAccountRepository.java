package com.example.beephone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.beephone.entity.AccountEntity;

public interface IAccountRepository extends JpaRepository<AccountEntity, Long>{

}
