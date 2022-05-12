package com.emart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
 @NoArgsConstructor
 @AllArgsConstructor
public class VegetableDTO {

	private int vegId;
	private String vegName;
	private double vegPrice;

}
