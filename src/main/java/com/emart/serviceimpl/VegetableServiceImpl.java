package com.emart.serviceimpl;

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
		return modelMapper.map(vegetable, VegetableDTO.class);
	}

	@Override
	public VegetableDTO findByVegId(long id) throws BadRequestException {
		VegetableDTO vegetableDTO = null;

		Vegetable vegetable = vegetableRepository.findByVegId(id);
		if (vegetable != null) {
			modelMapper.map(vegetable, VegetableDTO.class);

		}
		return vegetableDTO;
	}

}
