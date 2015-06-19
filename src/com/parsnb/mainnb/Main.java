package com.parsnb.mainnb;

import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                CurrencyGui gui = new CurrencyGui();
                gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui.setVisible(true);
            }
        });
    }
}
