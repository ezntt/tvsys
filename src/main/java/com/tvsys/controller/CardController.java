package com.tvsys.controller;

import com.tvsys.entity.Card;
import com.tvsys.repository.CardRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CardController {

    @Autowired
    private CardRepository cardRepository;

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/cards", method = RequestMethod.POST)
    public void create(@RequestBody Card card) {

        cardRepository.save(card);

    }

    @ResponseBody
    @GetMapping("/cards")
    public List<Card> read() {

        List<Card> cards = cardRepository.findAll(); // Busca todos os cards no banco de dados

        return cards;

    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/cards", method = RequestMethod.PUT)
    public void update(@RequestBody Card card) {

        cardRepository.save(card);

    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/cards/{cardId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long cardId){

        cardRepository.deleteById(cardId);

    }

}
