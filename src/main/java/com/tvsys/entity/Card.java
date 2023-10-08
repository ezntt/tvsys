package com.tvsys.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
public class Card {

    @Id
    private Long cardId;

    @OneToOne
    private User user;

    private float balance;
    private boolean status;
    private Date expirationDate;
    private Date lastRecharge;

}
