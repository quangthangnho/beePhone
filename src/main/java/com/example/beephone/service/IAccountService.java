package com.example.beephone.service;

import java.util.List;

import com.example.beephone.model.AccountModel;

public interface IAccountService {

	List<AccountModel> findAll();
	
	AccountModel save(AccountModel accountModel);
}
