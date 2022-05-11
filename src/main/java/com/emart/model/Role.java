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
@Table(name="Role_details")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long roleId;
	
	@Column(name="role_name",nullable = false)
	private String roleName;
	
	@Column(name="role_des",nullable = false)
	private String roleDescription;
	

}
