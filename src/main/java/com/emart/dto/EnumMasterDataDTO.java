package com.emart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnumMasterDataDTO {
	
	private  int enumId;
	private String enumCode;
	private String enumTypeId;
	private String enumDiscription;

}
