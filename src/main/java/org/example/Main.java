package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s1 = new String("A");
        String s2 = new String("A");

        System.out.println(s1 == s2);

    }

    class Point {
        int x;
        int y;

        String getLocation() {
            return "x :" + x + ", Y :" + y;
        }
    }

    class Point3D extends Point {
        int z;

        @Override
        String getLocation() {
            return "x :" + x + ", Y :" + y + ", z :" + z;
        }
        }


}