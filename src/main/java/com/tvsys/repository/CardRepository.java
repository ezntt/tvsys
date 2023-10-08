package com.tvsys.repository;

import com.tvsys.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CardRepository extends JpaRepository<Card, Long> {
    // what goes here?
}
