package com.lrn.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TimeTest {
    public static void main( String args[] ) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = "2020-04-30 15:55:26";

        Long timeSta = df.parse(time).getTime();
        System.out.println(timeSta);
    }
}
