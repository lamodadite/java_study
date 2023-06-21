package org.example.ch11;


import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    public static void main (String[] args) {
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.x - o2.x);
        pq.offer(new Node(2, 3));
        pq.offer(new Node(6, 2));
        pq.offer(new Node(1, 4));
        pq.offer(new Node(9, 3));
        System.out.println(pq);

        Object obj = null;
        while((obj = pq.poll())!= null) {
            System.out.println(obj);
        }
    }
}
