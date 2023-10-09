package com.tvsys.controller;

import com.tvsys.entity.RechargeOrder;
import com.tvsys.repository.RechargeOrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RechargeOrderController {

    @Autowired
    private RechargeOrderRepository rechargeOrderRepository;

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/rechargeOrders", method = RequestMethod.POST)
    public void create(@RequestBody RechargeOrder rechargeOrder) {

        rechargeOrderRepository.save(rechargeOrder);

    }

    @ResponseBody
    @GetMapping("/rechargeOrders")
    public List<RechargeOrder> read() {

        List<RechargeOrder> rechargeOrders = rechargeOrderRepository.findAll();

        return rechargeOrders;

    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/rechargeOrders", method = RequestMethod.PUT)
    public void update(@RequestBody RechargeOrder rechargeOrder) {

        rechargeOrderRepository.save(rechargeOrder);

    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/rechargeOrders/{rechargeOrderId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long rechargeOrderId){

        rechargeOrderRepository.deleteById(rechargeOrderId);

    }

}
