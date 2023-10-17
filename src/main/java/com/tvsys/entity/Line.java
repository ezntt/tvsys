package com.tvsys.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    private float price;

    // TODO see if "hour" is the best option to use
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "hh:mm")
    private Timestamp firstHour;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "hh:mm")
    private Timestamp lastHour;

}