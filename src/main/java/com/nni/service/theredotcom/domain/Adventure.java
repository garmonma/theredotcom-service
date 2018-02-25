package com.nni.service.theredotcom.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Adventure {

    @Id
    @GeneratedValue
    private Long id;
    
    @OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="id")
    private Account account;

    private String name;

    @OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="id")
    private Event event;

    @OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="id")
    private Address startAddress;

    private int groupSize;

    private double foodBudget;

    private List<String> transportationMethods = new ArrayList<String>();

    private double flightCost;

    private double drivingCost;

    private double trainCost;

    private double railBudget;

    private double taxiBudget;

    // The name of the place
    private String lodging;

    @OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="id")
    private Address lodgingAddress;

    private double lodgingPerNight;

    private int lodgingNights;

    private String rentalCar;

    private double rentalCarBudget;

    private double funMoney;

    private double emergencyBudget;
    
    public Adventure(){
    	
    }

}
