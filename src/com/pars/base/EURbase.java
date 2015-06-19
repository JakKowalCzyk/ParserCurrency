package com.pars.base;

import java.util.Date;

/**
 * Created by DK on 2015-06-18.
 */
public class EURbase {
    public EURbase() {}
    public EURbase(int id, Double value, Date date) {
        this.date = date;
        this.value = value;
        this.id = id;
    }
    public Date getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public Double getValue() {
        return value;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    public String toString(){
        return date + "   " + value;
    }

    private Date date;
    private int id;
    private Double value;
}
