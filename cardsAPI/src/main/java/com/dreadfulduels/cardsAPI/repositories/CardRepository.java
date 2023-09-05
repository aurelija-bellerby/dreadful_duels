package com.dreadfulduels.cardsAPI.repositories;

import com.dreadfulduels.cardsAPI.models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
