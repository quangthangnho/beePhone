package com.example.beephone.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beephone.convert.AccountModelAndEntityConvert;
import com.example.beephone.convert.ModelAndEntityConvert;
import com.example.beephone.entity.AccountEntity;
import com.example.beephone.model.AccountModel;
import com.example.beephone.repository.AccountRepository;
import com.example.beephone.service.IAccountService;

@Service
public class AccountService implements IAccountService{

	private final AccountRepository accountRepository;
	
	@Autowired
	public AccountService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}


	@Override
	public List<AccountModel> findAll() {
		return accountRepository.findAll().stream().
				map(elemen -> new AccountModelAndEntityConvert().convertToModel(elemen))
				.collect(Collectors.toList());
	}


	@Override
	public AccountModel save(AccountModel accountModel) {
		
		ModelAndEntityConvert<AccountEntity, AccountModel> ma = new AccountModelAndEntityConvert();
		AccountEntity accountEntity = ma.convertToEntity(accountModel);
		
		AccountEntity accountEntity2 = accountRepository.save(accountEntity);
		AccountModel accModel = ma.convertToModel(accountEntity2);
		return accModel;
	}

}
