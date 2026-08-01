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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode temp = head;
        int n=1;
        while(temp.next!=null){
            n++;
            temp = temp.next;
        }
        k=k%n;
        if(k==0){
            return head;
        }
        ListNode first = head;
        ListNode second = first.next;
        for(int i=0;i<n-k-1;i++){
            first = first.next;
            second = first.next;
        }
        temp.next = head;
        first.next = null;
        return second;
    }
}