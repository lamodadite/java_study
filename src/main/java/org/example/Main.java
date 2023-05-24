package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("야호");

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