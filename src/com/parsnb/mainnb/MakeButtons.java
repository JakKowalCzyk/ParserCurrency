package com.parsnb.mainnb;

import com.pars.base.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by DK on 2015-06-19.
 */
class MakeButtons extends JFrame {
    public MakeButtons(JButton EURbutton, MakeBase base, JList list1, JButton USDbutton, JButton CHFbutton, JButton GBPbutton){
        this.base = base;
        this.USDbutton = USDbutton;
        this.CHFbutton = CHFbutton;
        this.GBPbutton = GBPbutton;
        this.list1 = list1;
        this.EURbutton = EURbutton;
    }

    public JButton getEURbutton() {
        return EURbutton;
    }

    public JList getList1() {
        return list1;
    }

    public JButton getGBPbutton() {
        return GBPbutton;
    }

    public JButton getCHFbutton() {
        return CHFbutton;
    }

    public JButton getUSDbutton() {
        return USDbutton;
    }

    public void setEURbutton(List<EURbase> euRbases){
        EURbutton.addActionListener(e -> {
            DefaultListModel<EURbase> model = new DefaultListModel<>();
            for (EURbase bp : euRbases){
                model.addElement(bp);
            }
            list1.setModel(model);
        });
    }
    public void setUSDbutton(List<USDbase> usDbases){
        USDbutton.addActionListener(e -> {
            DefaultListModel<USDbase> model = new DefaultListModel<USDbase>();
            for (USDbase us : usDbases) model.addElement(us);
            list1.setModel(model);
        });
    }
    public void setCHFbutton(List<CHFbase> chFbases){
        CHFbutton.addActionListener(e -> {
            DefaultListModel<CHFbase> model = new DefaultListModel<>();
            for (CHFbase ch : chFbases) model.addElement(ch);
            list1.setModel(model);
        });
    }
    public void setGBPbutton(List<GBPbase> gbPbases){
        GBPbutton.addActionListener(e -> {
            DefaultListModel<GBPbase> model = new DefaultListModel<>();
            for (GBPbase gb : gbPbases) model.addElement(gb);
            list1.setModel(model);
        });
    }
    private JList list1;
    private MakeBase base;
    private List<EURbase> euRbases;
    private JButton EURbutton;
    private JButton USDbutton;
    private JButton CHFbutton;
    private JButton GBPbutton;
}
