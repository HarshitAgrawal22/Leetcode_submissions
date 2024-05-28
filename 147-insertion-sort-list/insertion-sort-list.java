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
    public ListNode insertionSortList(ListNode head) {
        if(head==null){
            return head;
        }
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next){
            for(ListNode pointer=head;pointer.next!=null;pointer=pointer.next){
                if(pointer.val>pointer.next.val){
                    int temp= pointer.next.val;
                    pointer.next.val=pointer.val;
                    pointer.val= temp;
                }
            }
        }
        return head;
    }
}