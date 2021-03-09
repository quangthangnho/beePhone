package com.example.beephone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beephone.entity.AccountEntity;
import com.example.beephone.model.AccountModel;
import com.example.beephone.repository.IAccountRepository;
import com.example.beephone.service.IAccountService;
@Service
public class AccountService implements IAccountService{
	
	@Autowired
	private final IAccountRepository accountRepository;
	
	public AccountService(IAccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public List<AccountModel> findAll() {
		// TODO Auto-generated method stub
		return accountRepository.findAll().stream().map();
	}

}
