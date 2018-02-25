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


}
