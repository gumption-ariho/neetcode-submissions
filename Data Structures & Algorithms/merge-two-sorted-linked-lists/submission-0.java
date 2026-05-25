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
        if(list1==null&& list2==null){
            return null;
        }
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode listy = new ListNode();
        ListNode listy2 = listy;
        while(list1 != null && list2 != null){
            if(list1.val<list2.val){
               listy.next = list1;
               list1=list1.next;
            }else{
                listy.next = list2;
                list2=list2.next;
            }
            listy=listy.next;
        }
        if(list1!=null){
            listy.next=list1;
        }
        if(list2!=null){
            listy.next=list2;
        }

    return listy2.next;
    }
}