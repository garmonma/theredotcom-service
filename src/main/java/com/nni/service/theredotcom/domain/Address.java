package com.nni.service.theredotcom.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Marcus Garmon on 2/21/2018.
 */

@Entity
public class Address {
	
	@Id
    @GeneratedValue
	private Long id;

    private String address;

    private String city;

    private String state;
}
