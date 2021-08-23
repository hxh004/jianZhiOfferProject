package jianZhiOffer;

import java.util.List;

public class Solution_15 {
    public ListNode ReverseList(ListNode head) {
        if (head==null)
            return null;
        //初始化pre指针，用于记录当前结点的前一个结点地址
        ListNode pre = null;
        //初始化p指针，用于记录当前结点的下一个结点地址
        ListNode after = null;
        //head指向null时，循环终止。
        while(head != null){
            //先用after指针记录当前结点的下一个结点地址。
            after = head.next;
            //让让当前head链接与链表断开，并指向前一个结点pre
            head.next = pre;
            //pre指针指向当前结点
            pre = head;
            //head指向p(保存着原链表中head的下一个结点地址)
            head = after;
        }
        return pre;//当循环结束时,pre所指的就是反转链表的头结点
    }

    public ListNode My(ListNode head){
        //定一个pre  用来存放
        ListNode pre = null;
        //定义一个next  用来存放
        ListNode next = null;
        //循环操作：当head的next不为空时，一直循环
        while (head.next!=null){
            //用next指向当前节点的下一个节点
            next = head.next;
            //将head.next与链表取消连接，然后指向pre
            head.next = next;
            //pre指向当前节点
            pre = head;
            //head指向next(就是循环内第一行那个保存着下一个节点地址的节点)
            head = next;
        }
        //当循环结束时，pre所指的就是反转链表的头节点
        return pre;
    }

}
