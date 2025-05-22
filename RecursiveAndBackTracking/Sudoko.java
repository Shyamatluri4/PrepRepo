package RecursiveAndBackTracking;


public class Sudoko {
    public static boolean isValid(int[][] board,int row,int col,int num){

        //row
        for(int i=0;i<9;i++){
            if(board[row][i] == num){
                return false;
            }
        }

        //coloumn
        for(int i=0;i<9;i++){
            if(board[i][col] == num){
                return false;
            }
        }

        //for 3x3 box
        int sr=(row/3)*3 , sc=(col/3)*3;

        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean helper(int[][] board, int row,int col){

        if(row==9){
            return true;
        }
        
        int nrow=0, ncol=0;
        if(col != 8){
            nrow=row;
            ncol=col+1;
        }
        else{
            ncol=0;
            nrow=row+1;
        }


        if(board[row][col] != 0){
            return helper(board, nrow, ncol);
            }

        for(int i=1;i<=9;i++){
            if(isValid(board, row, col,i)){
                board[row][col] = i;
                if(helper(board, nrow, ncol)){
                    return true;
                }
                else{
                    board[row][col] = 0; //backTracking
                }
            }
        }
        
        return false;
    }
    
    public static void printBoard(int[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if(helper(board, 0, 0)){
            System.out.println("Solved Sudoko : ");
            printBoard(board);
        }
        else{
            System.out.println("No solution exists.");
        }
    }
}
