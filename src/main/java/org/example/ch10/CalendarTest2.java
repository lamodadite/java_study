package org.example.ch10;

import java.lang.ref.Cleaner;
import java.util.Calendar;

public class CalendarTest2 {
    public static void main(String[] args) {
        final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        // month의 경우 0부터 시작하므로 4월인 경우, 3으로 지정
        date1.set(2019, 3, 29);
        System.out.println("date1은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고,");
        System.out.println("오늘(date2)은 " + toString(date2) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");

        // 두 날짜간의 차이를 얻으려면, getTimeInMillis() 천분의 일초 단위로 변환
        long differance = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
        System.out.println("date1부터 지금(date2)까지 " + differance + "초가 지났습니다.");
        System.out.println("일(day)로 계산하면 " + differance/(24*60*60) + "일입니다.");


    }
    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 "
                + date.get(Calendar.MONTH) + "월 "
                + date.get(Calendar.DATE) + "일 ";
    }
}
