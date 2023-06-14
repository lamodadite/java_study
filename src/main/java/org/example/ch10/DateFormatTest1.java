package org.example.ch10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest1 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); // 오늘 날짜를 yyyy-MM-dd 형태로 변환

        String result = df.format(today);
        System.out.println(result);  // 2021-11-10
    }
}
