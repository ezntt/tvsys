package com.tvsys.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor // constructor without arguments
public class Employee {

    @Id
    private Long employeeId;

    private String name;
    private Date birthday;
    private float salary;

}
