/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 import java.math.BigInteger;
class Solution {
    public ListNode doubleIt(ListNode head) {
        String num="";

        for(ListNode temp= head;temp!=null;temp=temp.next){
            num+=temp.val;
        }
        BigInteger b1=new BigInteger(num);
        String out= ""+b1.add(b1);
        System.out.println(out);
        ListNode newHead=null;
        for(int i=out.length()-1;i>-1;i--){
           newHead= add(newHead,Integer.parseInt(""+ out.charAt(i)));
        }
        return newHead;

    }

    ListNode add(ListNode head,int val){
        ListNode temp= new ListNode(val);
        if(head==null){
            head= temp;
            return head;
        }

        temp.next= head;
        head= temp;
        return head;
    }
}