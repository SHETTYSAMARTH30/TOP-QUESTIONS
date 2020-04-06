/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class RandomPtrClone {
    
    public Node copyRandomList(Node head) {
        
        if(head == null)
            return null;
        
        Node ptr = head;
        
        while(ptr != null){
            
            Node newptr = new Node(ptr.val);
            newptr.next = ptr.next;
            ptr.next = newptr;
            ptr = newptr.next;
        }
        
        ptr = head;
        
        while(ptr != null){
            
            ptr.next.random = (ptr.random != null)? ptr.random.next:null;
            ptr = ptr.next.next;
            
        }
        
        Node oldPtr = head;
        Node newPtr = oldPtr.next;
        Node newHead = newPtr;
        
        while(oldPtr != null){
            
            oldPtr.next = newPtr.next;
            newPtr.next = (oldPtr.next!=null)?oldPtr.next.next:null;
            oldPtr = oldPtr.next;
            newPtr = newPtr.next;
        }
        
        return newHead;

    }
}
