package com.andrewsavich.springripper.quoters;

import javax.annotation.PostConstruct;

@Profiling
@DeprecetedClass(newImpl = T1000.class)
public class TerminatorQuoter implements Quoter {
    private String message;
    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    public TerminatorQuoter() {
        System.out.println("phase 1");
        System.out.println(repeat);
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
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
    @PostProxy
    public void sayQuote() {
        System.out.println("phase 3");
        for (int i = 0; i < repeat; i++) {
            System.out.println("message: " + message);
        }

    }
}
