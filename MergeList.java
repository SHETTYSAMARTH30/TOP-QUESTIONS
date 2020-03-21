/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeList {
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null)
            return head;
        
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        
        while(fast != null && fast.next !=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        prev.next=null;
        
        ListNode l1=sortList(head);
        ListNode l2=sortList(slow);
        
        return merge(l1,l2);
    }
    
    public ListNode merge(ListNode l1,ListNode l2){
        
        ListNode output=new ListNode(0);
        ListNode dummy=output;
        
        while(l1!=null && l2!=null){
            
            if(l1.val <= l2.val){
                output.next=l1;
                l1=l1.next;
            }
            else{
                output.next=l2;
                l2=l2.next;
            }
            output=output.next;
        }
        
        if(l1 != null)
            output.next=l1;
        
        
         if(l2 != null)
            output.next=l2;
        
        return dummy.next;
    }
}
