package com.bike.showroom.crm.payload;

import lombok.Data;
import java.time.LocalDate;

@Data
public class LeadDto {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private int age;
    private String gender;
    private String bikeModel;
    private String bikeType;
    private String source;
    private double budgetRange;
    private String financingPreference;
    private String communicationChannel;
    private LocalDate firstContactDate;
    private boolean testRideInterest;
    private LocalDate testRideDate;
}
