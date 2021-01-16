package com.example.designpattern.chapterone.simplefactory;

public class OperationAdd extends Operation {
    @Override
    public Double getResult() {
        return getNumber1() +getNumber2();
    }
}
