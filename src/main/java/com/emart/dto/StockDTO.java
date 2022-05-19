package com.emart.dto;

import java.util.List;

import com.emart.model.Vegetable;

import lombok.Data;

@Data
public class StockDTO {
	
	  
	private long stkId;

 	private String stkName;

 	private String sktType;

 	private String stkDescription;

 	private String address;
	private List<Vegetable> vegetables;

}
