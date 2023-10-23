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

import java.util.Objects;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head;
        if (!Objects.isNull(list1) && !Objects.isNull(list2)) {
            if (list1.val < list2.val) {
                head = list1;
                list1 = list1.next;
            } else {
                head = list2;
                list2 = list2.next;
            }
        } else if (Objects.isNull(list2) && !Objects.isNull(list1)) {
            head = list1;
            list1 = list1.next;
        } else if (Objects.isNull(list1) && !Objects.isNull(list2)) {
            head = list2;
            list2 = list2.next;
        } else {
            return null;
        }

        ListNode curr = head;
        while(!Objects.isNull(list1) || !Objects.isNull(list2)) {
            if (Objects.isNull(list1)) {
                curr.next = list2;
                list2 = list2.next;
                curr = curr.next;
            } else if (Objects.isNull(list2)) {
                curr.next = list1;
                list1 = list1.next;
                curr = curr.next;
            } else {
                if (list1.val < list2.val) {
                    curr.next = list1;
                    list1 = list1.next;
                    curr = curr.next;
                } else {
                    curr.next = list2;
                    list2 = list2.next;
                    curr = curr.next;
                }   
            }
        }

        return head;
    }
}
