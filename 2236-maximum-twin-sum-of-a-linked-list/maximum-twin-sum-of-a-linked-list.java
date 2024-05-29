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
    public int pairSum(ListNode head) {
        int length=0;
        for(ListNode temp=head;temp!=null;temp=temp.next){
            length++;
            // for(ListNode ptr= head;ptr.next!=null;ptr=ptr.next){
            //     if(ptr.val>ptr.next.val){
            //         int tmp=ptr.val;

            //         ptr.val= ptr.next.val;

            //         ptr.next.val= tmp;

            //     }
            // }
        
        }
        int[] arr= new int[length];

        ListNode temp=head; 
        
        for(int i= 0;i<length;i++){
            arr[i] =temp.val;
            temp= temp.next;
        }
        int max=Integer.MIN_VALUE;
        int left= 0, right= length-1;
        while(left<right){
            int current=arr[left]+arr[right];
            if(current>max){
                max= current;
            }
            left++;
            right--;
        }
        return max;
    }
}