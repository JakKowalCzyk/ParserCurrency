package com.parsnb.mainnb;

import com.pars.base.EURbase;
import com.pars.base.MakeBase;
import com.parsenb.pars.Parser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

/**
 * Created by DK on 2015-06-19.
 */
class CurrencyGui extends JFrame {
    public CurrencyGui()  {
        Parser parser = new Parser();
        ArrayList<Double> courses;
        courses = parser.setCourses();
        MakeBase base = new MakeBase(courses);
        MakeButtons buttons = new MakeButtons(EURButton, base, list1, USDButton, CHFButton, GBPButton);
        buttons.setEURbutton(base.getEur());
        buttons.getEURbutton();
        buttons.setUSDbutton(base.getUSD());
        buttons.getUSDbutton();
        buttons.setCHFbutton(base.getChFbases());
        buttons.getCHFbutton();
        buttons.setGBPbutton(base.getGbPbases());
        buttons.getGBPbutton();
        buttons.getList1();


        setContentPane(panel);
        pack();
    }

    private JPanel panel;
    private JButton USDButton;
    private JButton EURButton;
    private JButton CHFButton;
    private JButton GBPButton;
    private JList list1;
    private List<EURbase> euRbases;
}
