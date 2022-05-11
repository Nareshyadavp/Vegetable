package com.emart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Login_details")
public class Login {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long longinId;
	
	@Column(name="login_role_id",nullable = false)
	private long longinIdRoleId;
	
	@Column(name="login_username",nullable = false)
	private String loginUserName;
	
	@Column(name="login_password",nullable = false)
	private String userPassword;
	

}
