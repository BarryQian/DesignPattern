package com.example.designpattern.chapterone.strategy;


public class CashRebate extends Strategy {
    private float bate = 1;

    public CashRebate(float bate) {
        this.bate = bate;
    }

    @Override
    public Double acceptCash(double money) {
        return money*bate;
    }
}
