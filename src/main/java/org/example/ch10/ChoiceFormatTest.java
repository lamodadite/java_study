package org.example.ch10;

import java.text.ChoiceFormat;

public class ChoiceFormatTest {
    public static void main(String[] args) {
        double[] limits = {60, 70, 80, 90};  // 낮은순으로 적을 것
        String[] grades = {"D", "C", "B", "A"};

        int[] scores = {100, 95, 88, 70, 52, 60, 70};

        ChoiceFormat form = new ChoiceFormat(limits, grades);

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + " : " + form.format(scores[i]));
        }

    }
}
