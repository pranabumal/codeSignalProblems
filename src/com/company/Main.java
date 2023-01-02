package com.company;

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

        Sudoku2 sudoku2 = new Sudoku2();
        System.out.println(sudoku2.solution(grid));
    }

}
