package com.lrn.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTest {
    public static void main( String args[] ) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = "2020-04-30 15:55:26";

        Long timeSta = df.parse(time).getTime();
        System.out.println(timeSta);

        long time1 = System.currentTimeMillis();
        long time2 = time1/1000/60;
        System.out.println(new Date(time1));

        System.out.println(new Date(time2*60*1000));
    }
}
