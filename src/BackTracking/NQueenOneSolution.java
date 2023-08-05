package BackTracking;

public class NQueenOneSolution {
    static int count =0 ;
    public static boolean nQueen(char[][] board, int row) {
        // base case
        if (row == board.length){
           // printQueen(board);
            count++;
            return true;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueen(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'X';
            }
        }
        return false;
    }

    private static void printQueen(char[][] board) {
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j < board.length ; j++) {
                System.out.print(board[i][j] + " ");

            }
            System.out.println();

        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        //verically Up
        for (int i = row-1; i >= 0 ; i--) {
           if( board[i][col] =='Q')
            return false;
        }
        // diogonal left
        for (int i = row-1,j = col-1;  i>=0 && j >= 0 ; i--, j--) {
            if(board[i][j] =='Q')
            return false;

        }
        // diogonal right
        for (int i = row-1,j =col+1; i >= 0 && j < board.length; i--,j++) {
            if(board[i][j] =='Q')
                return false;
        }


        return true;
    }


    public static void main(String[] args) {
        int n = 4;
        // initialize
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }
       if(nQueen(board, 0)){
           System.out.println("Solution is possible");
           printQueen(board);
       }
       else {
           System.out.println("Solution is not possible");
       }
        System.out.println(count);


    }


}
