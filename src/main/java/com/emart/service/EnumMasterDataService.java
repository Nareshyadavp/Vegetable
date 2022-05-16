package com.emart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emart.dto.EnumMasterDataDTO;

 
@Service
public interface EnumMasterDataService {
	
	List<EnumMasterDataDTO> getEnumMasterDataApi(String enumType);

}
