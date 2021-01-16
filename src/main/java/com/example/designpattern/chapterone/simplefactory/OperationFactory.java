package com.example.designpattern.chapterone.simplefactory;

public class OperationFactory {
    public static Operation createOperation(String operate) {
        Operation rst = null;
        switch (operate) {
            case "+" :
                rst = new OperationAdd();
                break;
            case "-":
                rst = new OperationSub();
                break;
            default:
                rst = new OperationAdd();
                break;
        }
        return rst;
    }
}
