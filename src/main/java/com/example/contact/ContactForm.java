package com.example.contact;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class ContactForm {
    private Integer id;
    private String fullName;
    private String phoneNumber;
    private String emailAddress;
    private String idNumber;
    private Date dateOfBirth;
    private String gender;
    private String countryOfResidence;

    public ContactForm() {
    }

    public ContactForm(Integer id, String countryOfResidence, String fullName, String phoneNumber, String emailAddress, String idNumber, Date dateOfBirth, String gender) {
        this.id = id;
        this.countryOfResidence = countryOfResidence;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.idNumber = idNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactForm that = (ContactForm) o;
        return Objects.equals(id, that.id) && Objects.equals(fullName, that.fullName) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(emailAddress, that.emailAddress) && Objects.equals(idNumber, that.idNumber) && Objects.equals(dateOfBirth, that.dateOfBirth) && Objects.equals(gender, that.gender) && Objects.equals(countryOfResidence, that.countryOfResidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, phoneNumber, emailAddress, idNumber, dateOfBirth, gender, countryOfResidence);
    }
}
