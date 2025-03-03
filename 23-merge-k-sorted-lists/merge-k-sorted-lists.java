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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0 ){
            return null;
        }
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i = 0 ;i< lists.length;i++){
            ListNode ptr = lists[i];
            while(ptr!= null){
                // System.out.println(ptr.val);
                pq.add(ptr.val);
                ptr= ptr.next;
            }
        }

        ListNode head=null;
        while(!pq.isEmpty()){
            Integer  val = pq.poll();
            System.out.println(val);
            head = addNode(head,val );
        }
        return head;

        }
   ListNode addNode(ListNode head , int val){
        if(head==null){
            head = new ListNode(val);
        return head;
        }
        else{
            ListNode temp = new ListNode(val);
            ListNode ptr = head;
            while(ptr.next!= null){
                ptr = ptr.next;
            }
            ptr.next = temp;
            return head;
        }
    }

}