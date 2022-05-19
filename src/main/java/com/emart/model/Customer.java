package com.emart.model;

 

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	@Pattern(regexp = "^[a-zA-z ]*$")
	private String customerName;
	@Column(name = "cus_age", nullable = false)
	@Min(value=2, message="Invalid")
	@Max(value=99, message="Invalid")
	private int age;

	@Column(name = "cus_mobile", nullable = false)
    
	@Pattern(regexp="^[7-9]{1}[0-9]{9}[a-zA-Z0-9\s]*$")
	private String customerMobileNo;

	@Column(name = "cus_add", nullable = false)
	private String customerAddress;

	@Column(name = "cus_email", nullable = false)
	@Email
	@NotEmpty
	private String customerEmail;
 

//	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	//@JoinColumn(name = "customer_Id")
//	private List<StoreCard> storeCards = new ArrayList<>();

	
//	@OneToMany(mappedBy = "customer", orphanRemoval = true, cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
//	@JsonIgnore
//	private List<StoreCard> storeCards;

}
