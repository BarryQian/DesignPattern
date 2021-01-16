package com.example.designpattern.chapterone.strategy;


public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context("满减");
        double result = context.getResult(1020);
        System.out.println(result);
    }
}
