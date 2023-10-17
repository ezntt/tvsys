package com.tvsys.controller;

import com.tvsys.entity.CardUsage;
import com.tvsys.repository.CardUsageRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CardUsageController {

    @Autowired
    private CardUsageRepository cardUsageRepository;

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/cardUsages", method = RequestMethod.POST)
    public void create(@RequestBody CardUsage cardUsage) {

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
