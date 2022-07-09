package com.tikal.demo.service;
import com.tikal.demo.model.MoneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tikal.demo.model.MoneyInstance;
import java.util.List;

@Service
public class AtmService {

    @Autowired
    private MoneyRepository moneyRepository;

    public List<MoneyInstance> withdrawal(double amount) {
        return moneyRepository.getMoneyWithdrawal(amount);
    }

    public void addMoney(MoneyInstance moneyInstance) {
        moneyRepository.addMoney(moneyInstance);
    }
}
