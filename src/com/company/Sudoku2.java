package com.company;

import java.util.HashSet;
import java.util.Set;

public class Sudoku2 {

    boolean solution(char[][] board) {
        boolean sodoku = true;
//        Set<String> boxSet = new HashSet<>();
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
        //now the 3rd condition checking repetitions in 3x3 sub-boxes.
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                if(!check3(i,j,board)) return false;
            }
        }
        
        return sodoku;
    }
    public boolean check3(int i,int j,char[][] board){
        HashSet<Character> set3 = new HashSet<>();
        for(int m=i;m<3+i;m++){
            for(int n=j;n<3+j;n++){
                if(board[m][n]=='.') continue;
                else {
                    if(!set3.add(board[m][n])) return false;
                }
            }
        }
        return true;
    }
}
