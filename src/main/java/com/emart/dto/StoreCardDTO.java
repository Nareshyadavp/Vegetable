package com.emart.dto;

import java.util.Date;

import lombok.Data;

@Data
public class StoreCardDTO {
	private long storeCardId;

	private Date createdDate;

	private boolean isActive;
}
