package com.bricktobrick.B2BConnect.builders;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bricktobrick.B2BConnect.dtos.PropertyDto;
import com.bricktobrick.B2BConnect.entity.Property;

@Component
public class PropertyBuilder {

	public Property convertToPropertyModel(PropertyDto propertyDto) {
		
		Property newProperty = new Property();
		newProperty.setAddress(propertyDto.getAddress());
		newProperty.setAmenities(propertyDto.getAmenities());
		newProperty.setCompanyName(propertyDto.getCompanyName());
		newProperty.setExtensionDate(propertyDto.getExtensionDate());
		newProperty.setGuidelineValue(propertyDto.getGuidelineValue());
		newProperty.setId(propertyDto.getId());
		newProperty.setMobile(propertyDto.getMobile());
		newProperty.setPoc(propertyDto.getPoc());
		newProperty.setPropertyDescription(propertyDto.getPropertyDescription());
		newProperty.setPropertyMap(propertyDto.getPropertyMap());
		newProperty.setPropertyName(propertyDto.getPropertyName());
		newProperty.setPropertyType(propertyDto.getPropertyType());
		newProperty.setReraNumber(propertyDto.getReraNumber());
		newProperty.setStartDate(propertyDto.getStartDate());
		newProperty.setStatus(propertyDto.getStatus());
		newProperty.setTotalPlots(propertyDto.getTotalPlots());
		
		return newProperty;
	}

	public PropertyDto convertToPropetyDto(Property property) {

		PropertyDto newProperty = new PropertyDto();
		newProperty.setAddress(property.getAddress());
		newProperty.setAmenities(property.getAmenities());
		newProperty.setCompanyName(property.getCompanyName());
		newProperty.setExtensionDate(property.getExtensionDate());
		newProperty.setGuidelineValue(property.getGuidelineValue());
		newProperty.setId(property.getId());
		newProperty.setMobile(property.getMobile());
		newProperty.setPoc(property.getPoc());
		newProperty.setPropertyDescription(property.getPropertyDescription());
		newProperty.setPropertyMap(property.getPropertyMap());
		newProperty.setPropertyName(property.getPropertyName());
		newProperty.setPropertyType(property.getPropertyType());
		newProperty.setReraNumber(property.getReraNumber());
		newProperty.setStartDate(property.getStartDate());
		newProperty.setStatus(property.getStatus());
		newProperty.setTotalPlots(property.getTotalPlots());
		
		return newProperty;
	}

	public List<PropertyDto> convertToListModel(List<Property> properties) {
		
		List<PropertyDto> propertyDtos = new ArrayList<>();
		if (properties != null && properties.size() > 0) {
			properties.forEach(property -> {
				propertyDtos.add(convertToPropetyDto(property));
			});
		}
		return propertyDtos;

	}
	
	public PropertyDto convertModelToDto(Property property, PropertyDto propertyDto) {

		propertyDto.setAddress(property.getAddress());
		propertyDto.setAmenities(property.getAmenities());
		propertyDto.setCompanyName(property.getCompanyName());
		propertyDto.setExtensionDate(property.getExtensionDate());
		propertyDto.setGuidelineValue(property.getGuidelineValue());
		propertyDto.setId(property.getId());
		propertyDto.setMobile(property.getMobile());
		propertyDto.setPoc(property.getPoc());
		propertyDto.setPropertyDescription(property.getPropertyDescription());
		propertyDto.setPropertyMap(property.getPropertyMap());
		propertyDto.setPropertyName(property.getPropertyName());
		propertyDto.setPropertyType(property.getPropertyType());
		propertyDto.setReraNumber(property.getReraNumber());
		propertyDto.setStartDate(property.getStartDate());
		propertyDto.setStatus(property.getStatus());
		propertyDto.setTotalPlots(property.getTotalPlots());
		
		return propertyDto;
	}

	public Property convertDtoToModel(Property property, PropertyDto propertyDto) {

		property.setAddress(propertyDto.getAddress());
		property.setAmenities(propertyDto.getAmenities());
		property.setCompanyName(propertyDto.getCompanyName());
		property.setExtensionDate(propertyDto.getExtensionDate());
		property.setGuidelineValue(propertyDto.getGuidelineValue());
		property.setId(propertyDto.getId());
		property.setMobile(propertyDto.getMobile());
		property.setPoc(propertyDto.getPoc());
		property.setPropertyDescription(propertyDto.getPropertyDescription());
		property.setPropertyMap(propertyDto.getPropertyMap());
		property.setPropertyName(propertyDto.getPropertyName());
		property.setPropertyType(propertyDto.getPropertyType());
		property.setReraNumber(propertyDto.getReraNumber());
		property.setStartDate(propertyDto.getStartDate());
		property.setStatus(propertyDto.getStatus());
		property.setTotalPlots(propertyDto.getTotalPlots());
		
		return property;
	}
}
