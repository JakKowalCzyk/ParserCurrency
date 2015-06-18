package com.parsenb.pars;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by DK on 2015-06-18.
 */
public class Parser {
    public Parser() {
        doc = null;
        values = new ArrayList<String>();
        courses = new ArrayList<>();
    }
    public void setTableElements(){
        try {
            doc = Jsoup.connect("http://www.money.pl/pieniadze/nbp/srednie/").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (org.jsoup.nodes.Element table : doc.select("table.tabela")) {
            for (org.jsoup.nodes.Element row : table.select("tr.premium")) {
                tableElements = row.select("td");
                if (tableElements.size() > 4) values.add(tableElements.get(3).text());
            }
        }
    }
    public ArrayList<Double> setCourses(){
        setTableElements();
        for (String v :values) {
            double a = Double.parseDouble(v.replaceAll(",","."));
            courses.add(a);
        }
        return courses;
    }
    private ArrayList<Double> courses;
    private ArrayList<String> values;
    private Document doc;
    private Elements tableElements;
}
