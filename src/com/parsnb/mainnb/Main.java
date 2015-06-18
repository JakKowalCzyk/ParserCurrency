package com.parsnb.mainnb;

import com.pars.base.MakeBase;
import com.parsenb.pars.Parser;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Parser parser = new Parser();
        ArrayList<Double> courses;
        courses = parser.setCourses();
        MakeBase base = new MakeBase(courses);

    }
}
