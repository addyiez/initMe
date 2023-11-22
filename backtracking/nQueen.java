package backtracking;

public class nQueen { //O(n!) - time complexity
    //reccurence relation
    // T(n) = 1Quennplace * T(n-1) + isSafe()

  
    static int count = 0;
/*
    public static void Queens(char board[][], int row){
       //base
       if(row == board.length) {
        printBoard(board);
        count++;
        return;
       }
       //column loop
       for(int j=0; j<board.length; j++){
        if(isSafe(board, row, j))
        {    
        board[row][j] = 'Q';
        Queens(board, row+1); //function call
        board[row][j] ='x'; //backtracking step
        }
        }
    }
    */

    // CHECK IF PROBLEM CAN BE SOLVED & PRINT ONLY 1 SOLUTION
     public static boolean Queens1(char board[][], int row){
       //base
       if(row == board.length) {
        count++;
        return true;
       }
       //column loop
       for(int j=0; j<board.length; j++){
        if(isSafe(board, row, j))
        {    
        board[row][j] = 'Q';
        if(Queens1(board, row+1)){
            return true;
        } 
        board[row][j] ='x'; //backtracking step
        }
        }
        return false;
    }
    
      public static boolean isSafe(char board[][], int row, int col){
        //verticle up
        for(int i=row; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //diagonal left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char board[][]){
        System.out.println("----- chess board -----");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 4;
        char board[][] = new char[n][n];
        //initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'x';
            }
        }
        if(Queens1(board, 0)){
            System.out.println("Solution is possible");
            printBoard(board);
        }else{
            System.out.println("Solution is not possible");
        }
       // Queens(board, 0);
       // System.out.println("total ways to solve n queens = " + count);
    }
    
}
