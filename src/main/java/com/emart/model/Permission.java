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

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="permission_detais")
public class Permission {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long perId;
	
	@Column(name="per_name",nullable = false)
	private String perName;
	
	@Column(name="per_role_id",nullable = false)
	private long perRoleId;
	
	@Column(name="per_module",nullable = false)
	private String perModule;
	
	

}
