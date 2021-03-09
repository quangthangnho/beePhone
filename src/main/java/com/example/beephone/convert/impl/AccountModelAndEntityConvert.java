package com.example.beephone.convert.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.beephone.convert.ICovertModelAndEntity;
import com.example.beephone.entity.AccountEntity;
import com.example.beephone.model.AccountModel;

public class AccountModelAndEntityConvert implements ICovertModelAndEntity<AccountEntity, AccountModel> {

	private final ModelMapper modelMapper;

	@Autowired
    public AccountModelAndEntityConvert() {
        modelMapper = new ModelMapper();
    }

	

}
