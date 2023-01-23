package com.company.LinkListTopics;

public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode resultNode = head;
        ListNode current = head;
        int count=0;
        while (current!=null){
            count++;
            current=current.next;
        }
        int result= count/2;
        int count1=0;
        while (resultNode!=null){
            if(result==count1){
                return resultNode;
            }
            count1++;
            resultNode=resultNode.next;
        }
        return resultNode;
    }
}
