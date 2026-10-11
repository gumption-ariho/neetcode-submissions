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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //1,2,4    and //1,3,5
        ListNode runner = new ListNode();
        ListNode prev = runner;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                runner.next=list1;
                runner = runner.next;
                list1=list1.next;
            }else{
                runner.next=list2;
                runner = runner.next;
                list2=list2.next;
            }
        }
        if(list1!=null){
            runner.next=list1;
        }
        if(list2!=null){
            runner.next=list2;
        }
        return prev.next;
    }
}