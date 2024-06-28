package com.bricktobrick.B2BConnect.builders;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bricktobrick.B2BConnect.dtos.LeadDto;
import com.bricktobrick.B2BConnect.entity.Lead;

@Component
public class LeadBuilder {

	public Lead convertToLeadModel(LeadDto leadDto) {

		Lead lead = new Lead();
		lead.setAddress(leadDto.getAddress());
		lead.setAnnualIncome(leadDto.getAnnualIncome());
		lead.setEmail(leadDto.getEmail());
		lead.setFirstName(leadDto.getFirstName());
		lead.setId(leadDto.getId());
		lead.setIndustry(leadDto.getIndustry());
		lead.setLastName(leadDto.getLastName());
		lead.setLeadSource(leadDto.getLeadSource());
		lead.setLeadStatus(leadDto.getLeadStatus());
		lead.setMiddleName(leadDto.getMiddleName());
		lead.setMobile(leadDto.getMobile());
		lead.setOccupation(leadDto.getOccupation());
		return lead;
	}

	public LeadDto convertToLeadDto(Lead lead) {

		LeadDto leadDto = new LeadDto();
		leadDto.setAddress(lead.getAddress());
		leadDto.setAnnualIncome(lead.getAnnualIncome());
		leadDto.setEmail(lead.getEmail());
		leadDto.setFirstName(lead.getFirstName());
		leadDto.setId(lead.getId());
		leadDto.setIndustry(lead.getIndustry());
		leadDto.setLastName(lead.getLastName());
		leadDto.setLeadSource(lead.getLeadSource());
		leadDto.setLeadStatus(lead.getLeadStatus());
		leadDto.setMiddleName(lead.getMiddleName());
		leadDto.setMobile(lead.getMobile());
		leadDto.setOccupation(lead.getOccupation());

		return leadDto;
	}

	public List<LeadDto> convertToListModel(List<Lead> leads) {

		List<LeadDto> leadDtos = new ArrayList<>();
		if (leads != null && leads.size() > 0) {
			leads.forEach(lead -> {
				leadDtos.add(convertToLeadDto(lead));
			});
		}
		return leadDtos;

	}

	public LeadDto convertModelToDto(Lead lead, LeadDto leadDto) {

		leadDto.setAddress(lead.getAddress());
		leadDto.setAnnualIncome(lead.getAnnualIncome());
		leadDto.setEmail(lead.getEmail());
		leadDto.setFirstName(lead.getFirstName());
		leadDto.setId(lead.getId());
		leadDto.setIndustry(lead.getIndustry());
		leadDto.setLastName(lead.getLastName());
		leadDto.setLeadSource(lead.getLeadSource());
		leadDto.setLeadStatus(lead.getLeadStatus());
		leadDto.setMiddleName(lead.getMiddleName());
		leadDto.setMobile(lead.getMobile());
		leadDto.setOccupation(lead.getOccupation());

		return leadDto;
	}

	public Lead convertDtoToModel(Lead lead, LeadDto leadDto) {

		lead.setAddress(leadDto.getAddress());
		lead.setAnnualIncome(leadDto.getAnnualIncome());
		lead.setEmail(leadDto.getEmail());
		lead.setFirstName(leadDto.getFirstName());
		lead.setId(leadDto.getId());
		lead.setIndustry(leadDto.getIndustry());
		lead.setLastName(leadDto.getLastName());
		lead.setLeadSource(leadDto.getLeadSource());
		lead.setLeadStatus(leadDto.getLeadStatus());
		lead.setMiddleName(leadDto.getMiddleName());
		lead.setMobile(leadDto.getMobile());
		lead.setOccupation(leadDto.getOccupation());

		return lead;
	}
}
