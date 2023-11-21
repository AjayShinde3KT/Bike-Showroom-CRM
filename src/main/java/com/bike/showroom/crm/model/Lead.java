package com.bike.showroom.crm.model;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;

@Data
@Table(name = "leads")
@Entity
public class Lead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "email_id",nullable = false)
    private String email;
    @Column(name = "phone_number",nullable = false)
    private String phone;
    @Column(name = "address",nullable = false)
    private String address;
    @Column(name = "age",nullable = false)
    private int age;
    @Column(name = "gender",nullable = false)
    private String gender;
    @Column(name = "bike_model",nullable = false)
    private String bikeModel;
    @Column(name = "bike_type",nullable = false)
    private String bikeType;
    @Column(name = "source",nullable = false)
    private String source;
    @Column(name = "budget_range",nullable = false)
    private double budgetRange;
    @Column(name = "financing_preference",nullable = false)
    private String financingPreference;
    @Column(name = "communication_channel",nullable = false)
    private String communicationChannel;
    @Column(name = "first_contact_date",nullable = false)
    private LocalDate firstContactDate;
    @Column(name = "test_Ride_Interest",nullable = false)
    private boolean testRideInterest;
    @Column(name = "test_ride_date",nullable = false)
    private LocalDate testRideDate;
}
