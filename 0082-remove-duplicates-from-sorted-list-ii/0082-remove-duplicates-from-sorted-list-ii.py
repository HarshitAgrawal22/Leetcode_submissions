# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:

    def addNode(self,head,val):
        temp:ListNode = ListNode(val)

        if head==None:
            head=temp
            return head
        else:
            temp.next= head
            head= temp
            return head


    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head==None:return head
        else:
            holder=dict()
            temp:ListNode=head
            while temp!= None:
                if holder.get(temp.val)==None:
                    holder[temp.val]=1
                else:
                    holder[temp.val]+=1
                temp=temp.next

            newHead:ListNode=None
            finalList=list()
            for i in holder:
                if holder[i]==1:
                    finalList.insert(0,i)
                    
            for i in finalList:
                newHead=  self.addNode(newHead,i)
            return newHead

    