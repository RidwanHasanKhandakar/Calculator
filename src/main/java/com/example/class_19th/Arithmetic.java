package com.example.class_19th;

public class Arithmetic {
    private int firstNum;
    private int secondNUm;

    public Arithmetic(int firstNum, int secondNUm) {
        this.firstNum = firstNum;
        this.secondNUm = secondNUm;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNUm() {
        return secondNUm;
    }

    public void setSecondNUm(int secondNUm) {
        this.secondNUm = secondNUm;
    }

    @Override
    public String toString() {
        return "Arithmetic{" +
                "firstNum=" + firstNum +
                ", secondNUm=" + secondNUm +
                '}';
    }
}
