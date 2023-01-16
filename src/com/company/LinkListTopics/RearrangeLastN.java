package com.company.LinkListTopics;

public class RearrangeLastN {
    public ListNode<Integer> head;
    public ListNode<Integer> solution(ListNode<Integer> l, int n) {

        if(n==0){
            return l;
        }
        int count=getCountRec(l);
        ListNode<Integer> node = l;
        while (node!=null){
            node=node.next;
            if(node.next==null){
                node.next=l;
                break;
            }
        }
        int j=0;
        while (node!=null){
            if(j==count){
                node.next=null;
                break;
            }
            insertNode(node.value);
            node=node.next;
            j++;
        }


        return head;
    }
    public int getCountRec(ListNode<Integer> node)
    {
        // Base case
        if (node == null)
            return 0;

        // Count is this node plus rest of the list
        return 1 + getCountRec(node.next);
    }
    public void insertNode(Integer item) {
        ListNode<Integer> node = new ListNode<>(null);
        node.value = item;
        ListNode<Integer> current = this.head;

        if (this.head == null) {
            this.head = node;
            this.head.next = null;
            System.out.println(this.head.toString());
        } else {

            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            node.next = null;
        }
    }
}
