package com.emart.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "customer_details") 
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerId;

	@Column(name = "cus_pass", nullable = false)
	private String customerPassword;

	@Column(name = "cus_name", nullable = false)
	private String customerName;

	@Column(name = "cus_mobile", nullable = false)
	private long customerMobileNo;

	@Column(name = "cus_add", nullable = false)
	private String customerAddress;

	@Column(name = "cus_email", nullable = false)
	@Email
	@NotEmpty
 	private String customerEmail;
	
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(name="customer_vegetable",joinColumns = @JoinColumn(name="customerVegId",referencedColumnName = "customerId"),
	inverseJoinColumns=@JoinColumn(name="vegcId",referencedColumnName = "vegId") 	)
	private Set<Vegetable> vegetables;

}
