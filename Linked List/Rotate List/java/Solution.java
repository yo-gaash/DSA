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
        rev(head)
    }
    public static ListNode rev(ListNode head,int start, int end){
        ListNode prev;
        ListNode curr = get(head,start);
        ListNode next = curr.next;
        while(curr!=null&&k!=0){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(curr.next!=null){
                next = curr.next;
            }
            k--;
        }
        return prev;
    }
    public static ListNode get(ListNode head,int start){
        ListNode temp = head;
        for(int i=1;i<start;i++){
            temp = temp.next;
        }
        return temp;
    }
}