package com.company;

import com.company.ArrayTopics.IsCryptSolution;
import com.company.LinkListTopics.ListNode;
import com.company.LinkListTopics.RemoveKFromList;

import java.util.Arrays;
import java.util.HashMap;

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

        System.out.println(12/10);

        int[] array1 = {0, 5, 6, 0, 0, 2, 5};

        int[] filteredArray = Arrays.stream(array1).filter(num -> num != 0).toArray();
        System.out.println(Arrays.toString(filteredArray));
//        System.out.println(removeKFromList.solution(crypt,solution));
    }

}
