package com.pars.base;

import java.util.Date;

/**
 * Created by DK on 2015-06-19.
 */
public class USDbase {
    public USDbase() {
    }
    public USDbase(int id, double value, Date date) {
        this.date = date;
        this.id = id;
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    public String toString() {
        return "USDbase {" +
                "[" + id +
                "]" + date +
                ", " + value +
                '}';
    }

    private int id;
    private double value;
    private Date date;
}
