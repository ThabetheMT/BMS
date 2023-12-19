/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbershop.model;

import java.sql.Timestamp;

/**
 *
 * @author Acer
 */
public class Client {
 
    private String name, phoneNumber, haircutType, ageGroup;
    private Timestamp creationDate;

    public Client() {
    }

    public Client(String name, String phoneNumber, String haircutType, String ageGroup, Timestamp creationDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.haircutType = haircutType;
        this.ageGroup = ageGroup;
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHaircutType() {
        return haircutType;
    }

    public void setHaircutType(String haircutType) {
        this.haircutType = haircutType;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }
    
    
}
