package jianZhiOffer;

import java.util.Deque;
import java.util.LinkedList;

public class Solution_59_1 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.offerLast(1);
        deque.offerLast(2);
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);
    }

}
