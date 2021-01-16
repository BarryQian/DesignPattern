package com.example.designpattern;

import com.example.designpattern.chapterone.strategy.Context;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;
import java.util.stream.IntStream;

@SpringBootTest
class DesignpatternApplicationTests {


    @Test
    void strategyTest() {
        Context context = new Context("满减");
        double result = context.getResult(1020);
        System.out.println(result);
    }

    @Test
    public void rand(){
        Random random = new Random(System.currentTimeMillis());
        System.out.println(random.nextInt(2) + 2);
    }

}
