package com.tikal.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MoneyInstance {
    private MoneyTypeEnum moneyTypeEnum;
    private double value;
    private double numInstances;
    private double leftValue;

    public MoneyInstance collectAmount(double amount) {
        return new MoneyInstance(moneyTypeEnum, value, Math.max(amount / value, numInstances * value), amount - Math.max(amount / value , numInstances * value));

    }

    public void addNumInstances(double numInstances) {
        this.numInstances += numInstances;
    }
}
