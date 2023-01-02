package com.company;

import java.util.HashSet;
import java.util.Set;

public class Sudoku2 {

    boolean solution(char[][] board) {
        boolean sodoku = true;

        for (int i = 0; board.length > i; i++) {
            Set<String> rowSet = new HashSet<>();
            Set<String> colSet = new HashSet<>();
            for (int j = 0; board[i].length > j; j++) {
                if('.' != (board[j][i]) && colSet.contains(String.valueOf(board[j][i]))){
                    return false;
                }else {
                    colSet.add(String.valueOf(board[j][i]));
                }
                if ('.' != (board[i][j]) && rowSet.contains(String.valueOf(board[i][j]))) {
                    return false;
                } else {
                    rowSet.add(String.valueOf(board[i][j]));
                }
            }
        }


        return sodoku;
    }
}
