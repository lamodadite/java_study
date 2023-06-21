package org.example.ch11;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
    public static void main (String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));
        System.out.println(list1);  // [5, 4, 2, 0, 1, 3]

        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        System.out.println(list2);  // [4, 2, 0]

        // 정렬
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1);  // [0, 1, 2, 3, 4, 5]
        System.out.println(list2);  // [0, 2, 4]

        // list1에 list2가 포함되는지 안되는지 확인
        System.out.println(list1.containsAll(list2));  // true

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        System.out.println(list2);  // [0, 2, 4, A, B, C]

        list2.set(3, "AA");
        System.out.println(list2);  // [0, 2, 4, AA, B, C]

        // list1 요소 중 list2의 공통요소만 남고 나머지 다 삭제
        list1.retainAll(list2);
        System.out.println(list1);  // [0, 2, 4]

        list2.removeAll(list1);
        System.out.println(list2);  // [AA, B, C]

    }
}
