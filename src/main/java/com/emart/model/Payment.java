package com.emart.model;

import java.util.Date;

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
@Table(name="payment_details")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long payId;
	
	@Column(name="pay_amt",nullable = false)
	private long payAmount;
	
	@Column(name="pay_date",nullable = false)
	private Date date;
	
	@Column(name="pay_des",nullable = false)
	private String payDescription;
	
	@Column(name="pay_cus_id",nullable = false)
	private long payCusId;
	

}
