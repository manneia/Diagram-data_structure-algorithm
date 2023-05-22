package com.luo.dataStructure.introduction;

/**
 * @author lkx
 * @version 1.0.0
 */
public class ReversePrint {

    /**
     * 倒序打印链表
     *
     * @param head 链表的头结点
     * @return 返回打印的数组
     */
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        int[] res = new int[count];
        cur = head;
        count--;
        while (cur != null && count >= 0) {
            res[count--] = cur.val;
            cur = cur.next;
        }
        return res;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
