package com.example.beephone.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "account")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "username")
	private String userame;

	@Column(name = "password")
	private String password;

	@Column(name = "fullname")
	private String fullname;

	@Column(name = "email")
	private String email;

	@Column(name = "image")
	private String image;

	@Column(columnDefinition = "int default 1")
	private int status;

	@Column(name = "role", columnDefinition = "boolean default false")
	private Boolean role;

	@OneToMany(mappedBy = "accountEntity")
	private List<NewEntity> news;

	@OneToMany(mappedBy = "accountOrder")
	private List<OrderEntity> orders;

}
