package com.bike.showroom.crm.controller;

import com.bike.showroom.crm.payload.ApiResponse;
import com.bike.showroom.crm.payload.LeadDto;
import com.bike.showroom.crm.service.LeadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lead")
@RequiredArgsConstructor
public class LeadController {

    private final LeadService leadService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public LeadDto saveLead(@RequestBody LeadDto leadDto) {
        return leadService.saveOneLead(leadDto);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<LeadDto> getAllLead() {
        return leadService.fetchAllLeads();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/search")
    public List<LeadDto> searchByName(@RequestParam("name") String name) {
        return leadService.searchLeadByName(name);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping
    public ApiResponse deleteLead(@RequestParam("id") long id) {
        leadService.deleteLeadById(id);
        ApiResponse response = new ApiResponse();
        response.setMessage("Deleted Successfully");
        response.setStatus(false);
        return response;
    }
}
