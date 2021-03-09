package com.example.beephone.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountModel {

	private Long id;
	private String userame;
	private String password;
	private String fullname;
	private String email;
	private String image;
	private int status;
	private Boolean role;
}
