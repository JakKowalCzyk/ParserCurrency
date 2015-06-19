package com.pars.base;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by DK on 2015-06-18.
 */
public class MakeBase {
    public MakeBase(ArrayList<Double> values) {
        this.values = values;
        MainBase mainBase = new MainBase();
        date = new Date();
        if (mainBase.isExists() == true) {
            java.sql.Date checkDate = new java.sql.Date(date.getTime());
            Calendar calBase = Calendar.getInstance();
            calBase.setTime(mainBase.getDate());
            Calendar calNow = Calendar.getInstance();
            calNow.setTime(checkDate);
            if (calBase.get(Calendar.YEAR) == calNow.get(Calendar.YEAR) && calBase.get(Calendar.DAY_OF_YEAR) == calNow.get(Calendar.DAY_OF_YEAR)) System.out.println();
            else {
                mainBase.insertEUR(values.get(0), date);
            }
        }
        else mainBase.insertEUR(values.get(0), date);
        List<EURbase> euRbases = mainBase.selectEUR();
        for (EURbase es : euRbases) System.out.println(es);

        mainBase.closeConnection();
    }
    private ArrayList<Double> values;
    private Date date;
}
