package com.guney.microservices.limitsservice.bean;

public class Limits {
    private int maximum;
    private int minimum;

    public Limits(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    protected Limits() {
    }

    public int getMaximum() {
        return maximum;
    }

    public int getMinimum() {
        return minimum;
    }
}
