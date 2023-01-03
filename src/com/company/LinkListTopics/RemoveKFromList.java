package com.company.LinkListTopics;

public class RemoveKFromList {
    public Node<Integer> solution(Node<Integer> l, int k) {
        Node<Integer> currentNode = ((LinkedList) l).head;
        Node<Integer> prevNode = null;

        for (int i = 0; i < ((LinkedList) l).size; i++) {
            if(currentNode.value!=k){
                prevNode = currentNode;
                currentNode = currentNode.next;
            }else {
                currentNode=currentNode.next;
                if (prevNode != null) {
                    prevNode.next=currentNode;
                }
            }
        }
        ((LinkedList) l).size--;
        return l;
    }
}
