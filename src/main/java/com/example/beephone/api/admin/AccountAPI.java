package com.example.beephone.api.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beephone.model.AccountModel;
import com.example.beephone.service.IAccountService;

@RestController
@RequestMapping("/admin/account")
public class AccountAPI {
	
	@Autowired
	private IAccountService accountService;
	
	@GetMapping()
	public List<AccountModel> getAccount() {
		return accountService.findAll();
	}
	
	@PostMapping("/add")
	public AccountModel save(@RequestBody AccountModel accountModel) {
		return accountService.save(accountModel);
	}

}
