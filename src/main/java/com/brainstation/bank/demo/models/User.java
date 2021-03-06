package com.brainstation.bank.demo.models;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private static final long serialVersionUID = -6986746375915710855L;
    private int id;
    private String userId;
    private String name;
    private String lastName;
    private Date birthDate;
    private int age;
    private String email;
    private String address;
    private String phoneNumber;
    private String password;
    private String gender;

    public User(int id, String userId, String name, String lastName, Date birthDate, int age, String email, String address, String phoneNumber, String password, String gender) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.age = age;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.gender = gender;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getGender() {
        return gender;
    }

    public void setId(String userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
