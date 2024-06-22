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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1= new Stack<>();
        Stack<Integer> s2= new Stack<>();
        
        while(l1!=null){
            s1.push(l1.val);
            l1=l1.next;
        }
        
        while(l2!=null){
            s2.push(l2.val);
            l2=l2.next;
        }

        int carry =0;
        ListNode newList =null;
        while(!s1.isEmpty() || !s2.isEmpty() || carry !=0){
            int v1 = s1.isEmpty() ? 0:s1.pop();
            int v2 = s2.isEmpty() ? 0:s2.pop();

            int total = v1 +v2 + carry ;
            carry= total / 10;
            ListNode newNode = new ListNode(total %10);
            newNode.next = newList;
            newList = newNode;
        }

        return newList;

    }


}