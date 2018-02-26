package com.nni.service.theredotcom.domain;

import javax.persistence.*;

@Entity
public class Account {

	@Id
	@GeneratedValue
	private Long id;

	@OneToOne(cascade= CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="id")
	private User user;

	private String email;

	public Account(){

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", user=" + user +
                ", email='" + email + '\'' +
                '}';
    }
}
