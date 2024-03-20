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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
//Intilize start and end node
        ListNode start=null;
        //both are in same point
        ListNode end=list1;
        //iterate the loop till b ,where the index to be removed 

        for(int i=0;i<b;i++){
            //place the start point on A to be remove
            if(i==a-1){

                //place start
                start=end;
            }
            //now,it comes out from the loop so the send can traverse to b point
            end=end.next;

        }

        start.next=list2;
        //now connect list1 to list2
        while(list2.next!=null){
            //now traverse till list2 end point
          list2=list2.next;
        }
        //after reachedd list 2 end should connect list 1 
        list2.next=end.next;
        end.next=null;
        return list1;

        
    }
}