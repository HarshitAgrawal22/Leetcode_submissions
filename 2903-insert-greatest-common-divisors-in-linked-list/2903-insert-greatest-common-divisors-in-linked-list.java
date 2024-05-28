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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        

        for(ListNode temp= head;temp.next!=null;temp= temp.next.next){

            ListNode holder= new ListNode(findGcd(temp.val,temp.next.val));

            ListNode next= temp.next;

            
            temp.next= holder;
            holder.next=next;
        }

        return head;
    }

    
    public int findGcd(int num1,int num2){
        int i=0;
        if(num1<num2){
            i=num1;
        }else{
            i=num2;
        }

        for(;i>1;i--){
            if(num1%i==0&&num2%i==0){
                return i;
            }
        }
 
        return 1;
        }
    }
