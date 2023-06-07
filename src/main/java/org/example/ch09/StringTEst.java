package org.example.ch09;

import java.util.StringJoiner;

public class StringTEst {
    public static void main(String[] args) {
        String animals = "dog, car, bear";
        String[] arr = animals.split(",");

        // join() 사용
        System.out.println(String.join(" - ", arr));

        // StringJoiner 클래스 사용
        StringJoiner sj = new StringJoiner("/", "[", "]");

        for (String s : arr) {
            sj.add(s);
        }

        System.out.println(sj.toString());
    }
}
