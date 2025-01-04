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
    public boolean isPalindrome(ListNode head) {
        ListNode c = head; 
        ListNode cur = head;
        ListNode s = head;
        ListNode h = head ;
        while(h != null && h.next != null){
            s = s.next;
            h = h.next.next;
        }
        ListNode prev = null;
        ListNode next = null;
        while(s != null){
            next = s.next;
            s.next = prev ;
            prev = s;
            s = next ;
        }
         s = prev ;
        while(s!= null){
            if(c.val != s.val){
                return false;
            }
            c = c.next ;
            s = s.next ;
        }
        return true ;
    }
}