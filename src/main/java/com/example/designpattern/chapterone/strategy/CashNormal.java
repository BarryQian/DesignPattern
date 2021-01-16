package com.example.designpattern.chapterone.strategy;

public class CashNormal extends Strategy {
    @Override
    public Double acceptCash(double money) {
        return money;
    }
}
