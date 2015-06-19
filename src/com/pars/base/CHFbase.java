package com.pars.base;

import java.util.Date;

/**
 * Created by DK on 2015-06-19.
 */
public class CHFbase {
    public CHFbase() {
    }
    public CHFbase(int id, Double value, Date date) {
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

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    public String toString() {
        return date +
                "   " + value;
    }
    private int id;
    private Date date;
    private Double value;
}
