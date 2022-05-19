package com.emart.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "storecart_vegs_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StoreCartVegetables {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cartVegId")
	private long cartVegId;

	@Column(name = "quantity")
	private int quantity;
//
////	@ManyToOne(fetch = FetchType.EAGER)
//	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//
//	@JoinColumn(name = "storecard_Id")
// 	private StoreCard storeCard;
	
	


}
