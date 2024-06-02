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
    public ListNode removeNodes(ListNode head) {
        int count=0;
        for(ListNode ptr= head;ptr!=null;ptr= ptr.next){
            count++;
        }

        int[] arr= new int[count];
        int pos=0;
        for(ListNode ptr= head;ptr!=null;ptr= ptr.next){
            arr[pos]= ptr.val;
            pos++;
            System.out.println(ptr.val);
        }
        ListNode head2=null;
        int max= Integer.MIN_VALUE;
        System.out.println(arr.length);
        for(int i=arr.length-1;i>-1;i--){
            if(arr[i]>=max){
                
            head2=add(head2,arr[i]);
            max= arr[i];
            }

        }

        return head2;
    }

    ListNode add(ListNode head,int val){
        ListNode temp= new ListNode(val);

        if(head==null){
            return temp;
        }
        else{

            temp.next=head;
            head=temp;
            return head;
        }
    }
}