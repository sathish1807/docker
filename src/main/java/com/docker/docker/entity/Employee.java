package com.docker.docker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {

    @Id
    private int id;

    @Column(name="name")
    private String name;

    @Column(name = "salary")
    private int salary;


}
