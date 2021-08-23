package jianZhiOffer;
/*
*寻找两个链表的的第一个公共节点
* */
public class Solution26 {
    public ListNode FindFirstCommonNodeMy(ListNode pHead1, ListNode pHead2) {
        //两层循环，一个一个比较
        ListNode test1 = pHead1;
        ListNode test2 = pHead2;
        while (test1.next!=null){
            while (test2.next!=null){
                if (test1.val==test2.val){
                    return pHead1;
                }
                test2 = test2.next;
            }
            test1 = test1.next;
            test2 = pHead2;
        }
        return null;
    }

    /**
     * 思路1：如果有公共节点，1）若两个链表长度相等，那么遍历一遍后，在某个时刻，p1 == p2
     * 				     2)若两个链表长度不相等，那么短的那个链表的指针pn（也就是p1或p2）
     *					   必先为null，那么这时再另pn = 链表头节点。经过一段时间后，
     *					   则一定会出现p1 == p2。
     *		如果没有公共节点：这种情况可以看成是公共节点为null，顾不用再考虑。
     *
     * 思路2：看下面的链表例子：
     * 0-1-2-3-4-5-null
     * a-b-4-5-null
     * 代码的ifelse语句，对于某个指针p1来说，其实就是让它跑了连接好的的链表，长度就变成一样了。
     * 如果有公共结点，那么指针一起走到末尾的部分，也就一定会重叠。看看下面指针的路径吧。
     * p1： 0-1-2-3-4-5-null(此时遇到ifelse)-a-b-4-5-null
     * p2: a-b-4-5-null(此时遇到ifelse)0-1-2-3-4-5-null
     * 因此，两个指针所要遍历的链表就长度一样了！
     * 如果两个链表存在公共结点，那么p1就是该结点，如果不存在那么p1将会是null。
     */


    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while(p1 != p2) {
            if(p1 != null) p1 = p1.next;	//防止空指针异常
            if(p2 != null) p2 = p2.next;
            if(p1 != p2) {					//当两个链表长度不想等
                if(p1 == null) p1 = pHead1;
                if(p2 == null) p2 = pHead2;
            }
        }
        return p1;
    }

}
