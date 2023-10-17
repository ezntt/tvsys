package com.tvsys.controller;

import com.tvsys.entity.Card;
import com.tvsys.entity.CardUsage;
import com.tvsys.entity.Line;
import com.tvsys.repository.CardRepository;
import com.tvsys.repository.CardUsageRepository;
import com.tvsys.repository.LineRepository;
import com.tvsys.request.CardUsageRequest;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CardUsageController {

    @Autowired
    private CardUsageRepository cardUsageRepository;

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private LineRepository lineRepository;

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/cardUsages", method = RequestMethod.POST)
    public void create(@RequestBody CardUsageRequest cardUsageRequest) {

        Card card = cardRepository.findById(cardUsageRequest.getCardId()).get();
        Line line = lineRepository.findById(cardUsageRequest.getLineId()).get();

        CardUsage cardUsage = new CardUsage();
        cardUsage.setCard(card);
        cardUsage.setLine(line);
        cardUsage.setDate(cardUsageRequest.getDate());
        cardUsage.setHour(cardUsageRequest.getHour());

        cardUsageRepository.save(cardUsage);

    }

    @ResponseBody
    @GetMapping("/cardUsages")
    public List<CardUsage> read() {

        return cardUsageRepository.findAll();

    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/cardUsages", method = RequestMethod.PUT)
    public void update(@RequestBody CardUsage cardUsage) {

        cardUsageRepository.save(cardUsage);

    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/cardUsages/{cardUsageId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long cardUsageId){

        cardUsageRepository.deleteById(cardUsageId);

    }

}
