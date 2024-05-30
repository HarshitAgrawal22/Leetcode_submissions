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
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode even=null, odd=null;
        int count=1;
        for(ListNode ptr= head; ptr!=null;ptr= ptr.next){
            if(count%2==0){
                even=add(even,ptr.val);

            }

            else{
                odd=add(odd,ptr.val);
            }
            count++;
        }


        ListNode ptr=odd;
        while(ptr.next!=null){
            ptr=ptr.next;

        }
        
        ptr.next= even;
        return odd;
    }

    ListNode add(ListNode node,int val){
        ListNode temp= new ListNode(val);
        if(node== null){
            node= temp;
            return node;
        }
        else{
            ListNode pre= node;
            while(pre.next!=null){
                pre=pre.next;

            }
            
            pre.next= temp;
            return node;
        }
    }
}