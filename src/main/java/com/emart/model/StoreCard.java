package com.emart.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "storeCard_details")
public class StoreCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cartId")
	private long storeCardId;

	private Date createdDate;

	private boolean isActive;
	
//	@OneToMany(mappedBy = "storeCart", orphanRemoval = true, fetch = FetchType.LAZY)
//	private List<StoreCartVegetables> storeCartVegetables;

//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "customer_id")
//	@JsonIgnore
//	private Customer customer;
// 
}
