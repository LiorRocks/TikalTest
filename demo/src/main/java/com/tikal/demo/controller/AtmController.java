package com.tikal.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tikal.demo.service.AtmService;
import com.tikal.demo.model.MoneyInstance;
import java.util.List;

@RestController
public class AtmController {

    @Autowired
    private AtmService atmService;

    @PostMapping("/atm/withdrawal")
    public List<MoneyInstance> withdrawal(@RequestBody double amount) {
        return atmService.withdrawal(amount);
    }

    @PostMapping("/atm/refill")
    public void refill(@RequestBody List<MoneyInstance> money) {
        money.stream().forEach(atmService::addMoney);
    }
}
