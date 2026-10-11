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
    public boolean hasCycle(ListNode head) {
        //start together,
        //1,2
        // one is fatser than the other
        //the fatser will overtake (equal teh slower one at some point)
        ListNode slow = head;
        ListNode fast = head;
        while(slow != null && fast!= null&& fast.next!=null){
            fast=fast.next.next;
            slow = slow.next;
            if(slow== fast){
                return true;
            }
        }
        return false;
    }
}
