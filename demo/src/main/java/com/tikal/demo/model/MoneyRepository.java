package com.tikal.demo.model;

import com.tikal.demo.model.MoneyInstance;

import java.util.ArrayList;
import java.util.List;

public class MoneyRepository {
    private List<MoneyInstance> moneyInstanceList;

    public MoneyRepository() {
        moneyInstanceList = new ArrayList<>();
    }

    public MoneyRepository(List<MoneyInstance> moneyInstanceList) {
        this.moneyInstanceList = moneyInstanceList;
    }

    public List<MoneyInstance> getMoneyWithdrawal (double amount) {
        if(amount > 2000) {
            return null;
        }
        List<com.tikal.demo.model.MoneyInstance> result = new ArrayList<>();
        for(int i = 0; i < moneyInstanceList.size() && amount > 0; i++) {
            MoneyInstance currentInstance = moneyInstanceList.get(i).collectAmount(amount);
            moneyInstanceList.get(i).setNumInstances(moneyInstanceList.get(i).getNumInstances() - currentInstance.getNumInstances());
            amount = currentInstance.getLeftValue();
            result.add(currentInstance);
        }
        return result;
    }

    public void addMoney(MoneyInstance moneyInstance) {
        for(int i=0; i < moneyInstanceList.size(); i++) {
            if(moneyInstance.getMoneyTypeEnum().ordinal() > moneyInstanceList.get(i).getMoneyTypeEnum().ordinal() && moneyInstance.getValue() > moneyInstanceList.get(i).getValue()) {
                moneyInstanceList.add(i, moneyInstance);
                break;
            } else if(moneyInstance.getValue() == moneyInstanceList.get(i).getValue()) {
                moneyInstanceList.get(i).addNumInstances(moneyInstance.getNumInstances());
            }
        }
    }
}
