package com.company.LinkListTopics;


import com.company.DataStructure.Stack;

public class IsListPalindrome {
    public boolean solution(ListNode<Integer> l) {
        ListNode<Integer> cf = l;
        ListNode<Integer> current = l;

        int size=0;
        while(current != null) {
            current = current.next;
            size++;
        }
        Stack stack = new Stack(size);

        while(cf != null) {
            stack.push(cf.value);
            cf = cf.next;
        }
        stack.printStack();
        ListNode<Integer> data = l;
        while(data != null) {
            if(!data.value.equals(stack.pop()))
                return false;
            data = data.next;
        }
        return true;
    }
    boolean areIdenticalRecur(ListNode<Integer> a, ListNode<Integer> b)
    {
        // If both lists are empty
        if (a == null && b == null)
            return true;

        // If both lists are not empty, then data of
        // current nodes must match, and same should
        // be recursively true for rest of the nodes.
        if (a != null && b != null)
            return (a.value.equals(b.value))
                    && areIdenticalRecur(a.next, b.next);

        // If we reach here, then one of the lists
        // is empty and other is not
        return false;
    }


    public ListNode<Integer> reversSinglyLinkList(ListNode<Integer> l) {

        ListNode<Integer> prev = null;
        ListNode<Integer> current = l;

        while(current != null) {
            ListNode<Integer> next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;

    }

}
