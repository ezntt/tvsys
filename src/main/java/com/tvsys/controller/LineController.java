package com.tvsys.controller;

import com.tvsys.entity.Line;
import com.tvsys.repository.LineRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LineController {

    @Autowired
    private LineRepository lineRepository;

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/lines", method = RequestMethod.POST)
    public void create(@RequestBody Line line) {

        lineRepository.save(line);

    }

    @ResponseBody
    @GetMapping("/lines")
    public List<Line> read() {

        return lineRepository.findAll();

    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/lines", method = RequestMethod.PUT)
    public void update(@RequestBody Line line) {

        lineRepository.save(line);

    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/lines/{lineId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long lineId){

        lineRepository.deleteById(lineId);

    }

}
