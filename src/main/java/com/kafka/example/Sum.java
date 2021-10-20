package com.kafka.example;

public class Sum {

    private int a = 0;
    private int b = 0;
    private int sum = a + b;

    public int getB() {
        return b;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getA() {
        return a;
    }


    public void setA(int a) {
        this.a = a;
    }

    public int getB(int b) {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Sum{" +
                "a=" + a +
                ", b=" + b +
                ", sum=" + sum +
                '}';
    }

}
