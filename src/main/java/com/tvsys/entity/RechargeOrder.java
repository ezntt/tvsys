package com.tvsys.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class RechargeOrder {

    @Id
    private Long orderId;

    // one order can only have one card and one employee associated with it (one-to-one)

    @OneToOne
    private Card card;
    @OneToOne
    private Employee employee;

    private float value;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date orderDate;

}