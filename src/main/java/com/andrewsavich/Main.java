package com.andrewsavich;

import com.andrewsavich.springripper.quoters.Quoter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        while (true) {
            Thread.sleep(1500);
            context.getBean(Quoter.class).sayQuote();
        }

    }
}