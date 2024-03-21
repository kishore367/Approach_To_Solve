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
        //take a third variable
        ListNode start=null;
        //keep a condition to traverse through end point
        while(head!=null){
            //now temp is head
            ListNode temp=head;
            //move the head ttill end
            head=head.next;
            //now the first head pointer get null
            temp.next=start;
            //and the end becomes head now call it
            start=temp;
        }

        return start;
        
    }
}