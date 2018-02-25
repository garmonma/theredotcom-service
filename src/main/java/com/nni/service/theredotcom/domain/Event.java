package com.nni.service.theredotcom.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Event {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Address address;

    private Date startDate;

    private Date endDate;

    private double minCost;

    private double maxCost;

    private String type;


}
