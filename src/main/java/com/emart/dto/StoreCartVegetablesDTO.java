package com.emart.dto;

 
import com.emart.model.StoreCard;

import lombok.Data;

@Data

public class StoreCartVegetablesDTO {

	private long cartVegId;

	private int quantity;
	
	private StoreCard storeCard;

}
