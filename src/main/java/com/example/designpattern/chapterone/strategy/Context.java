package com.example.designpattern.chapterone.strategy;

public class Context {
    private Strategy strategy;
    public Context(String type) {
        switch (type) {
            case "正常":
                this.strategy = new CashNormal();
                break;
            case "满减":
                this.strategy = new CashReturn(300,50);
                break;
            case  "打折":
                this.strategy = new CashRebate(0.75f);
                break;
            default:
                this.strategy = new CashNormal();
                break;
        }
    }
    public double getResult(float money) {
        return strategy.acceptCash(money);
    }
}
