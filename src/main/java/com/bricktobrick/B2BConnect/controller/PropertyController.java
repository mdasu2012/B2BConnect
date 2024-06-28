package com.bricktobrick.B2BConnect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bricktobrick.B2BConnect.dtos.PropertyDto;
import com.bricktobrick.B2BConnect.services.PropertyService;

@RestController
@RequestMapping(value = "/property")
public class PropertyController {
	
	@Autowired
	private PropertyService propertyService;
	
	@PostMapping(value = "/add")
	public void addProperty(@RequestBody PropertyDto propertyDto) {
		propertyService.addProperty(propertyDto);
	}
	
	@GetMapping(value = "/all")
	public List<PropertyDto> findAllProperties() {
		return propertyService.findAllProperties();
	}
	
	@GetMapping(value = "/{id}")
	public PropertyDto findProperty(@PathVariable(value = "id") Long id) {
		return propertyService.findProperty(id);
	}

	@PutMapping(value = "/{id}")
	public void updateProperty(@PathVariable(value = "id") Long id, @RequestBody PropertyDto propertyDto) {
		propertyService.updateProperty(id, propertyDto);
	}
	
}
