package com.company;

import com.company.LinkListTopics.LinkedList;
import com.company.LinkListTopics.Node;
import com.company.LinkListTopics.RemoveKFromList;

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
                "SEND", "MORE", "MONEY"
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

        RemoveKFromList removeKFromList = new RemoveKFromList();
        LinkedList linkedList = new LinkedList();

        linkedList.insertNode(4);
        linkedList.insertNode(9);
        linkedList.insertNode(3);
        linkedList.insertNode(7);
        linkedList.insertNode(6);
        linkedList.insertNode(8);
        linkedList.insertNode(7);
        linkedList.insertNode(8);



        Node<Integer> newLinkList = removeKFromList.solution(linkedList,7);

        Node<Integer> current=((LinkedList) newLinkList).head;
        while (current.next!=null){
            System.out.println(current.value);
            current=current.next;
        }
        System.out.println(current.value);

    }

}
