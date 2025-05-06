package com.contactregistry.models;

import java.util.Date;

public class Contact {
    private int id;
    private String fullName;
    private String phoneNumber;
    private String email;
    private String idNumber;
    private Date dateOfBirth;
    private String gender;
    private String county;
    private Date createdAt;
    private Date updatedAt;

    // Constructors
    public Contact() {}
    
    public Contact(String fullName, String phoneNumber, String email, 
                  String idNumber, Date dateOfBirth, String gender, String county) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.idNumber = idNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.county = county;
    }

    // Getters and Setters (generate these in your IDE)
    // Example:
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    // ... (add for all fields)
}