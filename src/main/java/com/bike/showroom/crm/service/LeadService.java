package com.bike.showroom.crm.service;

import com.bike.showroom.crm.payload.LeadDto;

import java.util.List;

public interface LeadService {

    LeadDto saveOneLead(LeadDto leadDto);

    List<LeadDto> fetchAllLeads();

    List<LeadDto> searchLeadByName(String name);

    void deleteLeadById(long id);
}
