package com.stvjbz.sampleapp03;

/**
 * Created by stvjbz on 16/05/06.
 */
public class AnbayashiData {
    private int number;
    private int addition;
    private String comment;
    //Constructor
    public AnbayashiData(int number, int addition, String comment) {
        this.number = number;
        this.addition = addition;
        this.comment = comment;
    }

    public int getNumber() {
        return number;
    }

    public int getAddition() {
        return addition;
    }

    public String getComment() {
        return comment;
    }
}
