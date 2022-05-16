package com.emart.serviceimpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.dto.EnumMasterDataDTO;
import com.emart.model.EnumMasterData;
import com.emart.repository.EnumMasterDataRepository;
import com.emart.service.EnumMasterDataService;

@Service
public class EnumMasterDataServiceImpl implements EnumMasterDataService {
	
	@Autowired
	private EnumMasterDataRepository enumMasterDataRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<EnumMasterDataDTO> getEnumMasterDataApi(String enumType) {
		List<EnumMasterData> datas=enumMasterDataRepository.fetchMasterDataByType(enumType);
		if(! datas.isEmpty()) {
			List<EnumMasterDataDTO> dataDTOs = modelMapper.map(datas, new TypeToken<List<EnumMasterDataDTO>>() {
			}.getType());
			return dataDTOs;
		}
		return null;
 	}
	
	  

}
