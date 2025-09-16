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
        ListNode tail=null;
        while(head!=null){
            ListNode newNode=head.next;
            head.next=tail;
            tail=head;
            head=newNode;
        }
        return tail;
    }
}