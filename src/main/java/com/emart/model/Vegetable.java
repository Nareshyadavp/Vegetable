package com.emart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="veg")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vegetable {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private long vegId;
	private String vegName;
	private double price;
	 
	
}
