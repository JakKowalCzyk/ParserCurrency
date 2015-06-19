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
                mainBase.insertUSD(values.get(1), date);
                mainBase.insertCHF(values.get(2), date);
                mainBase.insertGBP(values.get(3), date);
            }
        }
        else {
            mainBase.insertEUR(values.get(0), date);
            mainBase.insertUSD(values.get(1), date);
            mainBase.insertCHF(values.get(2), date);
            mainBase.insertGBP(values.get(3), date);
        }
        euRbases = mainBase.selectEUR();
        for (EURbase es : euRbases) System.out.println(es);
        usDbases = mainBase.selectUSD();
        for (USDbase us : usDbases) System.out.println(us);
        chFbases = mainBase.selectCHF();
        for (CHFbase ch : chFbases) System.out.println(ch);
        gbPbases = mainBase.selectGBP();
        for (GBPbase gb : gbPbases) System.out.println(gb);

        mainBase.closeConnection();
    }
    public List<EURbase> getEur(){
        return euRbases;
    }
    public List<USDbase> getUSD(){
        return usDbases;
    }

    public List<GBPbase> getGbPbases() {
        return gbPbases;
    }

    public List<CHFbase> getChFbases() {
        return chFbases;
    }

    private List<EURbase> euRbases;
    private List<USDbase> usDbases;
    private List<CHFbase> chFbases;
    private List<GBPbase> gbPbases;
    private ArrayList<Double> values;
    private Date date;
}
