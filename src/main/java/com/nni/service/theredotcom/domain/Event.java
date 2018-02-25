package com.nni.service.theredotcom.domain;

import java.sql.Date;

import javax.persistence.*;

@Entity
public class Event {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne(cascade= CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="id")
    private Address address;

    private Date startDate;

    private Date endDate;

    private double minCost;

    private double maxCost;

    private String type;

    public Event() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getMinCost() {
        return minCost;
    }

    public void setMinCost(double minCost) {
        this.minCost = minCost;
    }

    public double getMaxCost() {
        return maxCost;
    }

    public void setMaxCost(double maxCost) {
        this.maxCost = maxCost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", minCost=" + minCost +
                ", maxCost=" + maxCost +
                ", type='" + type + '\'' +
                '}';
    }
}
