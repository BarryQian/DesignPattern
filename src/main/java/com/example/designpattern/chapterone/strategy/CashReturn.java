package com.example.designpattern.chapterone.strategy;

public class CashReturn extends Strategy {
    private float moneyReturn = 0;
    private float moneyCondition = 0;
    public CashReturn (float moneyCondition, float moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }
    @Override
    public Double acceptCash(double money) {
        return  money - Math.floor(money/moneyCondition) * moneyReturn;
    }
}
