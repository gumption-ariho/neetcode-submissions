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
    public ListNode reverseList(ListNode head) {
        /*0 1 2 3
        -0-null
        */
        if(head==null){
            return null;
        }      
        boolean first = true;
        ListNode prev = new ListNode();
        ListNode nextNode = new ListNode();
        while(head!=null){
            if(first){
                nextNode = head.next;
                head.next= null;
                prev=head;
                head=nextNode;
                first=false;
            }else{
                nextNode = head.next;
                head.next = prev;
                prev = head;
                head= nextNode;
            }
        }
        return prev;
    }
}
