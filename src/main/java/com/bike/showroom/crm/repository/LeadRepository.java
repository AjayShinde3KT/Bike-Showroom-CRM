package com.bike.showroom.crm.repository;

import com.bike.showroom.crm.model.Lead;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LeadRepository extends JpaRepository<Lead,Long> {
    List<Lead> findByNameContainingIgnoreCase(String name);
}
