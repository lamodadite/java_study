package org.example.ch09;

public class wrapperTest {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println("(i1 == i2) = " + (i1 == i2));
        System.out.println("i1.equals(i2) = " + i1.equals(i2));
        System.out.println("i1.compareTo(i2) = " + i1.compareTo(i2));
        System.out.println("i1.toString() = " + i1.toString());
    }
}
