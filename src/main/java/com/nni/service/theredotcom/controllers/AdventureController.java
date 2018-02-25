package com.nni.service.theredotcom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nni.service.theredotcom.domain.Adventure;
import com.nni.service.theredotcom.repositories.AdventureRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AdventureController {
	
	private final AdventureRepository adventureRepository;
	
	@Autowired
	public AdventureController(AdventureRepository adventureRepository) {
		this.adventureRepository = adventureRepository;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/adventure")
	Adventure getAdventure(@PathVariable Long adventureId){
		Adventure adventure = adventureRepository.findOne(adventureId);
		return adventure;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/adventures")
	List<Adventure> getAdventures(@PathVariable Long accountId){
		List<Adventure> adventures = adventureRepository.findAllByAccountId(accountId);
		return adventures;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/adventure")
	ResponseEntity<Adventure> createAdventure(@RequestBody Adventure adventure){
		System.out.println(adventure);
		adventureRepository.save(adventure);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}