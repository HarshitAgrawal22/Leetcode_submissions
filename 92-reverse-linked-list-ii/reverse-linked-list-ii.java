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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode ptr=head;
        int len=0;
        while(ptr!=null){
            len++;
            ptr=ptr.next;

        }
        int[] arr= new int[len];
        ptr=head;
        int i=0;
        while(ptr!=null){
            arr[i]= ptr.val;
            ptr=ptr.next;
            i++;

        }
        left--;right--;
        while(left<right){
            int temp= arr[left];
            arr[left]= arr[ right];

            arr[right]= temp;
            left++;
            right--;
        }
        ListNode newHead=null;
        for( int j= arr.length-1;j>-1;j--){
            newHead= addhead(newHead,arr[j]);
        }

        return newHead;
    }
    ListNode addhead(ListNode head,int val){
        ListNode temp= new ListNode(val);
        if(head==null){
            
                return temp;
        }
        else{
            temp.next= head;
            head= temp;
            return head;
        }

    }
}