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
    public ListNode mergeNodes(ListNode head) {
        
        if(head==null){
        return head;}

        ListNode ptr1=head;
        ListNode ptr2=head.next;
        int sum=0;
        while(ptr2!=null){
            if(ptr2.val!=0){
                sum+=ptr2.val;
            }
            else{
                ptr1.next=ptr2;
                ptr2.val=sum;
                ptr1=ptr2;
                sum=0;
            }
            ptr2=ptr2.next;
        }        

            
        
        return head.next;
    }
    
}