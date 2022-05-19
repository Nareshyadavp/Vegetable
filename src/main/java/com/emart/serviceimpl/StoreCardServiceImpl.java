package com.emart.serviceimpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.emart.dto.StoreCardDTO;
import com.emart.model.StoreCard;
import com.emart.repository.StoreCardRepository;
import com.emart.service.StoreCardService;

@Service
public class StoreCardServiceImpl implements StoreCardService{
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private StoreCardRepository storeCardRepository;  

	@Override
	public StoreCardDTO save(StoreCardDTO storeCardDTO) {
		StoreCard storeCard=modelMapper.map(storeCardDTO, StoreCard.class);
	//	storeCard =sto
 		return null;
	}

	@Override
	public List<StoreCardDTO> getAll() {
 		return null;
	}

}
