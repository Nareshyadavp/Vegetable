package com.emart.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.dto.VegetableDTO;
import com.emart.exception.BadRequestException;
import com.emart.model.Vegetable;
import com.emart.repository.VegetableRepository;
import com.emart.service.VegetableService;

@Service
public class VegetableServiceImpl implements VegetableService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private VegetableRepository vegetableRepository;

	@Override
	public VegetableDTO saveVegetable(VegetableDTO vegetableDTO) {
		Vegetable vegetable = modelMapper.map(vegetableDTO, Vegetable.class);
		vegetable = vegetableRepository.save(vegetable);
		System.out.println(vegetable);
		return modelMapper.map(vegetable, VegetableDTO.class);
	}

//	@Override
//	public VegetableDTO getVegId(int vegId) throws BadRequestException {
//	Vegetable	vegetable=modelMapper.map(vegetable, VegetableDTO.class);
//
//		  vegetable = vegetableRepository.findByVegId(vegId);
//		
// 	}
 	@Override
	public VegetableDTO getVegId(int vegId) {
 		VegetableDTO vegetableDTO=null;

		Vegetable vegetable = vegetableRepository.findByVegId(vegId);
		if(vegetable!=null) {

		 vegetableDTO =modelMapper.map(vegetable, VegetableDTO.class);
		
		}
		return vegetableDTO;
	}

	 
	@Override
	public List<VegetableDTO> getAll() {
		List<VegetableDTO> vegetableDTOs = new ArrayList<>();
		List<Vegetable> vegetables = vegetableRepository.findAll();
		for (Vegetable vegetable : vegetables) {
			VegetableDTO vegetableDTO = modelMapper.map(vegetable, VegetableDTO.class);
			vegetableDTOs.add(vegetableDTO);
		}
		return vegetableDTOs;
	}

}
