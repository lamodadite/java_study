package org.example.ch10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest3 {
    public static void main(String[] args) throws ParseException {

        DateFormat df = new SimpleDateFormat("yyyy년 MMM dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d = df.parse("2015년 11월 23일");
            System.out.println(df2.format(d));
        } catch (ParseException e) {
        }
    }
}
