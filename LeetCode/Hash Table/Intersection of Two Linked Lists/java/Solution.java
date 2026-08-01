/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int length1=0;
        ListNode temp=headA;
        while(temp!=null){
            length1++;
            temp = temp.next;
        }
        temp=headB;
        int length2=0;
        while(temp!=null){
            length2++;
            temp = temp.next;
        }
        ListNode first;
        ListNode second;
        if(length1<length2){
            int diff = length2-length1;
            first = headA;
            second = get(diff,headB);
        }
        else if(length1>length2){
            int diff = length1-length2;
            first = get(diff,headA);
            second = headB;
        }
        else{
            first = headA;
            second = headB;
        }
        temp = first;
        while(temp!=null){
            if(first==second){
                return first;
            }
            temp = temp.next;
            first = first.next;
            second = second.next;
        }
        return null;
    }
    public ListNode get(int index,ListNode head){
        ListNode node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }
}