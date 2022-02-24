package main;

import java.util.List;

/**
 * @Author linbo
 * @Description:
 */
public class L2AddTwoNumbers2 {


    public static void main(String[] args) {

    }

    public  static  ListNode addTwoNumbers(ListNode l1,ListNode l2){
        int catory = 0;
        ListNode head = null;
        ListNode tail = null;
        while(l1!=null || l2!=null ){
            int val1 = l1!=null ? l1.val:0;
            int val2 = l2!=null ? l2.val:0;

            int result = val1+val2+catory;
            if (head==null) {
                head = tail = new ListNode(result % 10);
            }else {
                tail.next = new ListNode(result%10);
                tail = tail.next;
            }
            catory = result/10;

            if (l1!=null){
                l1 = l1.next;
            }
            if(l2 !=null){
                l2 = l2.next;
            }

        }

        if (catory>0){
            tail.next = new ListNode(catory);
        }
        return head;

    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
        ListNode(int val){
            this.val = val;
        }

    }

}
