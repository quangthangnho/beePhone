package com.example.beephone.convert;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.beephone.entity.AccountEntity;
import com.example.beephone.model.AccountModel;

public class AccountModelAndEntityConvert implements ModelAndEntityConvert<AccountEntity, AccountModel> {

	private final ModelMapper modelMapper;

	@Autowired
    public AccountModelAndEntityConvert() {
        modelMapper = new ModelMapper();
    }

	@Override
	public AccountModel apply(AccountEntity t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountModel convertToModel(AccountEntity tObject) {
		AccountModel accountModel = modelMapper.map(tObject, AccountModel.class);
		return accountModel;
	}

	@Override
	public AccountEntity convertToEntity(AccountModel tObject) {
		AccountEntity accountEntity = modelMapper.map(tObject, AccountEntity.class);
		return accountEntity;
	}

}
