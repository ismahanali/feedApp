package com.bptn.feedApp.jpa;

import java.io.Serializable;
import java.sql.Timestamp;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="\"User\"")
public class User implements Serializable {  
	
	private static final long serialVersionUID = 1L;
	
	private Integer userId;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String phone;
	private String emailId;
	private Boolean emailVerified;
	private Timestamp createdOn;
}