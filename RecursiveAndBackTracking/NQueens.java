package RecursiveAndBackTracking;

import java.util.*;

public class NQueens {
    public boolean isSafe(int row,int col,char[][] board){
        //horizontally
        for(int i=0;i<board.length;i++){
            if(board[row][i]=='Q'){
                return false;
            }
        }

        //vertically
        for(int j=0;j<board.length;j++){
            if(board[j][col]=='Q'){
                return false;
            }
        }

        // upperLeft
        int r=row;
        for(int c=col;c>=0 && r>=0;c--,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //upperRight
        r=row;
        for(int c=col;c<board.length && r>=0;c++,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //lowerLeft
        r=row;
        for(int c=col;c>=0 && r<board.length;c--,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //lowerRight
        r=row;
        for(int c=col;c<board.length && r<board.length;c++,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        return true;

    }
    
    public void saveBoard(char[][] board,List<List<String>> allboards){
        String row="";
        List<String> newBoard = new ArrayList<>();

        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q'){
                    row+='Q';
                }
                else{
                    row+='.';
                }
            }
            newBoard.add(row);
        }

        allboards.add(newBoard);
    }

    public void helper(char[][] board,List<List<String>> allboards, int col){
        if(col==board.length){
            saveBoard(board,allboards);
            return;
        }

        for(int row=0;row<board.length;row++){
            if (isSafe(row,col, board)){
                board[row][col] = 'Q';
                helper(board, allboards, col+1);
                board[row][col]='.';
            }
        }
 


    }
    
    public List<List<String>> solNQueens (int n){
        List<List<String>> allboards = new ArrayList<>();
        char[][] board = new char[n][n];

        for(int i=0;i<board.length;i++){
            Arrays.fill(board[i], '.');
        }
        helper(board, allboards, 0);

        return allboards;
    }  


    public static void main(String[] args) {
        int n=4;

        NQueens sol = new NQueens();
        List<List<String>> result=sol.solNQueens(n);

        System.out.println(result);
    }
}


// Time Complexity O(n^n).
