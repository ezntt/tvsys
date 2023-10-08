package com.tvsys.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor // constructor without arguments
public class CardUsage {

    @Id
    private Long cardUsageId;

    @OneToOne
    private Card card;
    @OneToOne
    private Line line;

    private Date date;
    private Timestamp hour;

}
