package com.company.LinkListTopics;


public class AddTwoHugeNumbers {
    public ListNode<Integer> head;
    public ListNode<Integer> solution(ListNode<Integer> a, ListNode<Integer> b) {

        ListNode<Integer> list_Index = a;
        ListNode<Integer> list_Index2 = b;
        ListNode<Integer> list_A = a;
        ListNode<Integer> list_B = b;
        int index=0;
        int index1=0;
        int index2=0;
        while (list_Index !=null){
            index1++;
            list_Index=list_Index.next;
        }
        while (list_Index2 !=null){
            index2++;
            list_Index2=list_Index2.next;
        }
        index= Math.max(index1, index2);
        int[] array_1 = new int[index];
        int[] array_2 = new int[index];
        int in=index-1;

        list_A= reversSinglyLinkList(list_A);
        list_B= reversSinglyLinkList(list_B);

        while (in>=0){

            if(list_A !=null){
                array_1[in]=list_A.value;
                list_A=list_A.next;
            }

            if(list_B !=null){
                array_2[in]=list_B.value;
                list_B=list_B.next;
            }

            in--;
        }

        int inHand=0;
        for(int i=index-1;i>=0;i--){
            if(inHand>0){
                int data = (array_1[i] + array_2[i] + inHand);
                this.insertNode(data%10000);
                inHand=data/10000;
            }else {
                int data = (array_1[i] + array_2[i]);
                this.insertNode(data%10000);
                inHand=data/10000;
            }
            if(i==0 && inHand>0){
                this.insertNode(inHand);
            }
        }

        return reversSinglyLinkList(head);
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

//    public ListNode<Integer> solution(ListNode<Integer> a, ListNode<Integer> b) {
//
//        ListNode<Integer> list_A = a;
//        ListNode<Integer> list_B = b;
//        double firstInt=0;
//        double secondInt=0;
//        while (list_A !=null){
//            int data=list_A.value;
//            if(firstInt==0){
//                firstInt=data;
//            }else {
//                firstInt=(firstInt*10000) + data;
//            }
//            list_A=list_A.next;
//        }
//        while (list_B !=null){
//            int data=list_B.value;
//            if(secondInt==0){
//                secondInt=data;
//            }else {
//                secondInt=(secondInt*10000) + data;
//            }
//            list_B=list_B.next;
//        }
//
//        double sum = firstInt + secondInt;
//        System.out.println(sum);
//        return a;
//    }
}
