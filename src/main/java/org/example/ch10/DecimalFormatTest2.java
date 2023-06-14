package org.example.ch10;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatTest2 {
    public static void main (String[] args)   {
        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#.###E0");

        try {
            Number num = df.parse("1,234,567.89");  // 기호와 문자가 포함된 문자열이 숫자로 변환
            System.out.println(num);  // 1234567.89

            double d = num.doubleValue();  // double 타입으로 변환
            System.out.println(d);  // 1234567.89

            System.out.println(df2.format(num));  // 1.235E6


        } catch (ParseException e) {}

    }
}
