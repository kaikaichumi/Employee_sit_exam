package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @Column(name = "EMP_ID")
    private String id;
    @Column(name = "NAME")
    private String employeeName;
    @Column(name = "EMAIL")
    private String employeeMail;
    @Column(name = "FLOOR_SEAT_SEQ")
    private Long seatID;

    public Employee() {
    }

    public Employee(String id, String name) {
        this.id = id;
        this.employeeName = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeMail() {
        return employeeMail;
    }

    public void setEmployeeMail(String employeeMail) {
        this.employeeMail = employeeMail;
    }

    public Long getSeatID() {
        return seatID;
    }

    public void setSeatID(Long seatID) {
        this.seatID = seatID;
    }
}
