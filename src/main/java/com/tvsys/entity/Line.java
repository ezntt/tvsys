package com.tvsys.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Line {

    @Id
    private Long lineId;

    private String name;
    private int counter;
    private float price;

    // TODO see if "hour" is the best option to use
    private Timestamp first_hour;
    private Timestamp last_hour;

}