package com.tikal.demo;

import com.tikal.demo.model.MoneyInstance;
import com.tikal.demo.model.MoneyRepository;
import com.tikal.demo.model.MoneyTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;

public class Init {
    @Autowired
    private MoneyRepository moneyRepository;

    public void initMoneyRepository() {
        moneyRepository.addMoney(new MoneyInstance(MoneyTypeEnum.BILL, 200, 7, 7));
        moneyRepository.addMoney(new MoneyInstance(MoneyTypeEnum.BILL, 100, 4, 4));
        moneyRepository.addMoney(new MoneyInstance(MoneyTypeEnum.BILL, 20, 15, 15));
        moneyRepository.addMoney(new MoneyInstance(MoneyTypeEnum.COIN, 10, 10, 10));
        moneyRepository.addMoney(new MoneyInstance(MoneyTypeEnum.COIN, 5, 1, 1));
        moneyRepository.addMoney(new MoneyInstance(MoneyTypeEnum.COIN, 10, 12, 12));
        moneyRepository.addMoney(new MoneyInstance(MoneyTypeEnum.COIN, 0.01, 21, 21));
    }
}
