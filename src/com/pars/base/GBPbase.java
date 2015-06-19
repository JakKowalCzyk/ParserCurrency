package com.pars.base;

import java.util.Date;

/**
 * Created by DK on 2015-06-19.
 */
public class GBPbase {
    public GBPbase() {
    }
    public GBPbase(Date date, double value, int id) {
        this.date = date;
        this.value = value;
        this.id = id;
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
        return "GBPbase {[" +
                + id +
                "] - " + date +
                " " + value +
                '}';
    }

    private int id;
    private double value;
    private Date date;
}
