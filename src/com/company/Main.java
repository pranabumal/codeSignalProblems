package com.company;

import com.company.LinkListTopics.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String string = "ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof";
        int[] array = new int[]{
                2, 3, 2, 5, 3, 2, 4, 6, 6
        };

        int[][] multiDimensionArray = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        String[] crypt = new String[]{
                "cba","daf","ghi"
        };

        char[][] solution = new char[][]{
                {'O', '0'},
                {'M', '1'},
                {'Y', '2'},
                {'E', '5'},
                {'N', '6'},
                {'D', '7'},
                {'R', '8'},
                {'S', '9'}
            };
        char[][] grid = new char[][]{
                {'.', '.', '.', '1', '4', '.', '.', '2', '.'},
                {'.', '.', '6', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '1', '.', '.', '.', '.', '.', '.'},
                {'.', '6', '7', '.', '.', '.', '.', '.', '9'},
                {'.', '.', '.', '.', '.', '.', '8', '1', '.'},
                {'.', '3', '.', '.', '.', '.', '.', '.', '6'},
                {'.', '.', '.', '.', '.', '7', '.', '.', '.'},
                {'.', '.', '.', '5', '.', '.', '.', '7', '.'}};

//        System.out.println(12/10);
//
//        int[] array1 = {0, 5, 6, 0, 0, 2, 5};
//
//        int[] filteredArray = Arrays.stream(array1).filter(num -> num != 0).toArray();
//        System.out.println(Arrays.toString(filteredArray));
////        System.out.println(removeKFromList.solution(crypt,solution));
//
//        MinimumDelation minimumDelation = new MinimumDelation();
//        System.out.println(minimumDelation.minDeletionSize(crypt));

//        RemoveKFromList removeKFromList = new RemoveKFromList(); 9876, 5432, 1999
//        IsListPalindrome isListPalindrome = new IsListPalindrome();
        RearrangeLastN rearrangeLastN = new RearrangeLastN();
        ListNode<Integer> listNode_1 = new ListNode<>(1);
        listNode_1.next = new ListNode<>(2);
        listNode_1.next.next = new ListNode<>(3);
        listNode_1.next.next.next = new ListNode<>(4);
        listNode_1.next.next.next.next = new ListNode<>(5);
//        listNode_1.next.next.next.next.next = new ListNode<>(6);
//        listNode_1.next.next.next.next.next.next = new ListNode<>(7);
//        listNode_1.next.next.next.next.next.next.next = new ListNode<>(8);

        ListNode<Integer> listNode_2 = new ListNode<>(2);
        listNode_2.next = new ListNode<>(3);
        listNode_2.next.next = new ListNode<>(20);
//        listNode_2.next.next.next = new ListNode<>(9999);
//        listNode_2.next.next.next.next = new ListNode<>(9999);
//        listNode_2.next.next.next.next.next = new ListNode<>(9999);

        ListNode<Integer> result = rearrangeLastN.solution(listNode_1,2);
        while (result !=null){
            System.out.println(result.value);
            result=result.next;
        }

//        removeKFromList.removekFromList(listNode,4);
//        System.out.println(addTwoHugeNumbers.solution(listNode_1,listNode_2));
    }

}
