package com.andrewsavich.springripper.quoters;

import javax.annotation.PostConstruct;

@Profiling
public class TerminatorQuoter implements Quoter {
    private String message;
    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    public TerminatorQuoter() {
        System.out.println("phase 1");
        System.out.println(repeat);
    }

    @PostConstruct
    public  void init() {
        System.out.println("phase 2");
        System.out.println(repeat);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message: " + message);
        }

    }
}
