package com.company.LinkListTopics;

public class AddTwoHugeNumbers {
    public ListNode<Integer> solution(ListNode<Integer> a, ListNode<Integer> b) {

        ListNode<Integer> list_A = a;
        ListNode<Integer> list_B = b;
        double firstInt=0;
        double secondInt=0;
        while (list_A !=null){
            int data=list_A.value;
            if(firstInt==0){
                firstInt=data;
            }else {
                firstInt=(firstInt*10000) + data;
            }
            list_A=list_A.next;
        }
        while (list_B !=null){
            int data=list_B.value;
            if(secondInt==0){
                secondInt=data;
            }else {
                secondInt=(secondInt*10000) + data;
            }
            list_B=list_B.next;
        }

        double sum = firstInt + secondInt;
        System.out.println(sum);
        return a;
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
