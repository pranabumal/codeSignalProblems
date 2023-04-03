package com.company.LinkListTopics;

import java.util.Stack;

public class AddTwoNumberInLinklist {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while (l1 != null) {
            s1.push((Integer) l1.value);
            l1 = l1.next;
        }

        while (l2 != null) {
            s2.push((Integer) l2.value);
            l2 = l2.next;
        }

        ListNode result = null;
        int carry = 0;

        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
            int sum = carry;

            if (!s1.isEmpty()) {
                sum += s1.pop();
            }

            if (!s2.isEmpty()) {
                sum += s2.pop();
            }

            ListNode node = new ListNode(sum % 10);
            node.next = result;
            result = node;

            carry = sum / 10;
        }

        return result;
    }
}
