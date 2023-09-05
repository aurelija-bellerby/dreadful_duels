package com.dreadfulduels.cardsAPI.controllers;

import com.dreadfulduels.cardsAPI.models.Card;
import com.dreadfulduels.cardsAPI.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {
    @Autowired
    CardRepository cardRepository;

    @GetMapping(value = "/cards")
    public ResponseEntity<List<Card>> getAllCards(){
        return new ResponseEntity<>(cardRepository.findAll(), HttpStatus.OK);
    }



}
