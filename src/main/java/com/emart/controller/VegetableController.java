package com.emart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emart.dto.VegetableDTO;
import com.emart.exception.BadRequestException;
import com.emart.model.Vegetable;
import com.emart.service.VegetableService;

@RestController
public class VegetableController {

	@Autowired
	private VegetableService vegetableService;

	@PostMapping("/vegcreate")
	public ResponseEntity<VegetableDTO> saveVegaetble(@RequestBody VegetableDTO vegetableDTO) {
		return new ResponseEntity<>(vegetableService.saveVegetable(vegetableDTO), HttpStatus.CREATED);

	}

	@GetMapping("/veg/{vegId}")
	public ResponseEntity<VegetableDTO> getVegId(@PathVariable long vegId) throws BadRequestException {
		VegetableDTO vegetableDTO = null;

		try {

			vegetableDTO = vegetableService.findByVegId(vegId);
			if (vegetableDTO != null) {
				return new ResponseEntity<>(vegetableDTO, HttpStatus.OK);

			} else {
				throw new BadRequestException();

			}

		} catch (BadRequestException e) {
			throw new BadRequestException("vegetable id is not matched please enter correct Id");
		}

	}

}