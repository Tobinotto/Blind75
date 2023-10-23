// Definition for singly-linked list.
//  public class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

import java.util.Objects;

class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode curr = head;
        while(!Objects.isNull(curr)) {
            stack.push(curr.val);
            curr = curr.next;
        }

        curr = head;

        while(!stack.empty()) {
            curr.val = stack.pop();
            curr = curr.next;
        }

        return head;
    }
}
