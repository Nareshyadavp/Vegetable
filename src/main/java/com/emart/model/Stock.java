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

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "stock_details")
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long stkId;

	@Column(name = "skt_num", nullable = false)
	private String stkName;

	@Column(name = "skt_type", nullable = false)
	private String sktType;

	@Column(name = "skt_des", nullable = false)
	private String stkDescription;

	@Column(name = "address", nullable = false)
	private String address;
//	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	private List<Vegetable> vegetables;

}
