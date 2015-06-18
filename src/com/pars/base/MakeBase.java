package com.pars.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by DK on 2015-06-18.
 */
public class MakeBase {
    public MakeBase(ArrayList<Double> values) {
        this.values = values;
        date = new Date();
        MainBase mainBase = new MainBase();
        date = new Date();
        mainBase.insertEUR(values.get(0), date);
        List<EURbase> euRbases = mainBase.selectEUR();
        for (EURbase es : euRbases) System.out.println(es);
        mainBase.closeConnection();
    }
    private ArrayList<Double> values;
    private Date date;
}
