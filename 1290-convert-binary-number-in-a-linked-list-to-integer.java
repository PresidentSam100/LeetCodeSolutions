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
    public int getDecimalValue(ListNode head) {
        if (head == null) {
            throw new IllegalArgumentException("invalid");
        }
        int ans = 0;
        while (head != null) {
            if (head.val != 0 && head.val != 1) {
                throw new IllegalArgumentException("invalid");
            }
            ans *= 2;
            ans += head.val;
            head = head.next;
        }
        return ans;
    }
}
