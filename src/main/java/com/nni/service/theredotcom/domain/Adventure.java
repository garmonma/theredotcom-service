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

    private String transportationMethod;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Address getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(Address startAddress) {
        this.startAddress = startAddress;
    }

    public int getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }

    public double getFoodBudget() {
        return foodBudget;
    }

    public void setFoodBudget(double foodBudget) {
        this.foodBudget = foodBudget;
    }

    public String getTransportationMethod() {
        return transportationMethod;
    }

    public void setTransportationMethod(String transportationMethod) {
        this.transportationMethod = transportationMethod;
    }

    public double getFlightCost() {
        return flightCost;
    }

    public void setFlightCost(double flightCost) {
        this.flightCost = flightCost;
    }

    public double getDrivingCost() {
        return drivingCost;
    }

    public void setDrivingCost(double drivingCost) {
        this.drivingCost = drivingCost;
    }

    public double getTrainCost() {
        return trainCost;
    }

    public void setTrainCost(double trainCost) {
        this.trainCost = trainCost;
    }

    public double getRailBudget() {
        return railBudget;
    }

    public void setRailBudget(double railBudget) {
        this.railBudget = railBudget;
    }

    public double getTaxiBudget() {
        return taxiBudget;
    }

    public void setTaxiBudget(double taxiBudget) {
        this.taxiBudget = taxiBudget;
    }

    public String getLodging() {
        return lodging;
    }

    public void setLodging(String lodging) {
        this.lodging = lodging;
    }

    public Address getLodgingAddress() {
        return lodgingAddress;
    }

    public void setLodgingAddress(Address lodgingAddress) {
        this.lodgingAddress = lodgingAddress;
    }

    public double getLodgingPerNight() {
        return lodgingPerNight;
    }

    public void setLodgingPerNight(double lodgingPerNight) {
        this.lodgingPerNight = lodgingPerNight;
    }

    public int getLodgingNights() {
        return lodgingNights;
    }

    public void setLodgingNights(int lodgingNights) {
        this.lodgingNights = lodgingNights;
    }

    public String getRentalCar() {
        return rentalCar;
    }

    public void setRentalCar(String rentalCar) {
        this.rentalCar = rentalCar;
    }

    public double getRentalCarBudget() {
        return rentalCarBudget;
    }

    public void setRentalCarBudget(double rentalCarBudget) {
        this.rentalCarBudget = rentalCarBudget;
    }

    public double getFunMoney() {
        return funMoney;
    }

    public void setFunMoney(double funMoney) {
        this.funMoney = funMoney;
    }

    public double getEmergencyBudget() {
        return emergencyBudget;
    }

    public void setEmergencyBudget(double emergencyBudget) {
        this.emergencyBudget = emergencyBudget;
    }

    @Override
    public String toString() {
        return "Adventure{" +
                "id=" + id +
                ", account=" + account +
                ", name='" + name + '\'' +
                ", event=" + event +
                ", startAddress=" + startAddress +
                ", groupSize=" + groupSize +
                ", foodBudget=" + foodBudget +
                ", transportationMethod='" + transportationMethod + '\'' +
                ", flightCost=" + flightCost +
                ", drivingCost=" + drivingCost +
                ", trainCost=" + trainCost +
                ", railBudget=" + railBudget +
                ", taxiBudget=" + taxiBudget +
                ", lodging='" + lodging + '\'' +
                ", lodgingAddress=" + lodgingAddress +
                ", lodgingPerNight=" + lodgingPerNight +
                ", lodgingNights=" + lodgingNights +
                ", rentalCar='" + rentalCar + '\'' +
                ", rentalCarBudget=" + rentalCarBudget +
                ", funMoney=" + funMoney +
                ", emergencyBudget=" + emergencyBudget +
                '}';
    }

    public Adventure(){
    	
    }

}
