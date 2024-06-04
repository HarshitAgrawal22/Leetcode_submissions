class Node{
    int val;
    Node next;
    public Node(int val){
        this.val=val;
        this.next=null;
    }
}

class MyLinkedList {
    Node head;
    int length;


    public MyLinkedList() {
        this.head=null;
        this.length=0;
        
    }
    
    public int get(int index) {
        if(index>=length || head==null){
            return -1;
        }
        Node curr=head;
        while(index>0){
            curr=curr.next;
            index--;
        }
        return curr.val;
        
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
        
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        }else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
        length++;
        
    }
    
    public void addAtIndex(int index, int val) {
         if (index < 0 || index > length) {
            return;
        } else if (index == 0) {
            addAtHead(val);
        } else if (index == length) {
            addAtTail(val);
        } else {
            Node newNode = new Node(val);
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
            length++;
        }
        
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= length || head == null) {
            return;
        } else if (index == 0) {
            head = head.next;
        } else if (index == length - 1) {
            Node curr = head;
            while (curr.next.next != null) {
                curr = curr.next;
            }
            curr.next = null;
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        length--;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */