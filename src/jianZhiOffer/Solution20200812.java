package jianZhiOffer;

import java.util.ArrayList;
import java.util.List;

/*
* 链表获取倒数第K个元素
* */
public class Solution20200812 {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (k<=0 || head==null){
            return null;
        }
        return myFunction(head,k);
    }
    public static ListNode myFunction(ListNode head,int k){
        List<ListNode> list = new ArrayList<>();
        while (head.next!=null){
            list.add(head);
            head = head.next;
        }
        if (k>list.size())
            return null;
        return list.get(list.size()-k);





















    /*    ArrayList<ListNode>  list = new ArrayList<>();
        while (head.next!=null){
            list.add(head);
            head = head.next;
    }
        if (list.size()<k){
        return null;
    }
        return list.get(list.size()-k);*/
    }
}










    /*public ListNode FindKthToTail(ListNode head,int k) {
        if (k<=0 || head==null){
            return null;
        }
        return sol2(head,k);
    }
    private ListNode sol2(ListNode head, int k) {
        ListNode p = head;
        ArrayList<ListNode> list = new ArrayList<>();
        while (p != null) {
            list.add(p);
            p = p.next;
        }
        if (list.size() < k) {
            return null;
        }
        return list.get(list.size() - k);

    }*/

