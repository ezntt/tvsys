package com.tvsys.entity;

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
@NoArgsConstructor // constructor without arguments
public class RechargeOrder {

    @Id
    private Long orderId;

    // one order can only have one card and one employee associated with it (one-to-one)

    @OneToOne
    private Card card;
    @OneToOne
    private Employee employee;

    private float value;
    private Date orderDate;

}