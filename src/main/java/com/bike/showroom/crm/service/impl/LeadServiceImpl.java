package com.bike.showroom.crm.service.impl;

import com.bike.showroom.crm.model.Lead;
import com.bike.showroom.crm.payload.LeadDto;
import com.bike.showroom.crm.repository.LeadRepository;
import com.bike.showroom.crm.service.LeadService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LeadServiceImpl implements LeadService {

    private final LeadRepository leadRepository;
    private final ModelMapper modelMapper;

    @Override
    public LeadDto saveOneLead(LeadDto leadDto) {
        Lead lead = mapToEntity(leadDto);
        Lead savedLead = leadRepository.save(lead);
        return mapToDto(savedLead);
    }

    @Override
    public List<LeadDto> fetchAllLeads() {
        List<Lead> leads = leadRepository.findAll();
        return leads.stream().map(lead -> mapToDto(lead)).collect(Collectors.toList());
    }

    @Override
    public List<LeadDto> searchLeadByName(String name) {
        List<Lead> leadByName = leadRepository.findByNameContainingIgnoreCase(name);
        return leadByName.stream().map(lead -> mapToDto(lead)).collect(Collectors.toList());
    }

    @Override
    public void deleteLeadById(long id) {
        leadRepository.deleteById(id);
    }

    Lead mapToEntity(LeadDto leadDto) {
        return modelMapper.map(leadDto, Lead.class);
    }

    LeadDto mapToDto(Lead lead) {
        return modelMapper.map(lead, LeadDto.class);
    }


}
