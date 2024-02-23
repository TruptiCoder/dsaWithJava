public class Sudoku {

    public static boolean isSafe(int sudoku[][], int row, int col ,int digit){
        //check column
        for(int i=0; i<=8; i++){   // we start counting from 0 hence 9 elements 0 to 8
            if(sudoku[i][col] == digit){
                return false;
            }
        }
        //check row
        for(int j=0; j<=8; j++){
        if(sudoku[row][j] == digit){
            return false;
        }
    }
    //check grid
    int sr = (row/3)*3;  //by this formula we get starting row and col and hence we find its grid 
    int sc = (col/3)*3;  //and by adding 3 to row and col we can visit the whole grid

    for(int i=sr; i<sr+3; i++){
        for(int j=sc; j<sc+3; j++){
            if(sudoku[i][j] == digit){
                return false;
            }
        }
    }
  return true;  //if it is not false then it is safe place for digit
}
    public static boolean sudokuSolver(int sudoku[][],int row, int col){
        //base case
        if(row == 9 && col == 0){
            return true;
        }
        //recursion
        int nextRow = row , nextCol = col+1; //we will first see all cols in a row and then next row
        if(col+1 == 9){
            nextRow = row+1;
            nextCol = 0;
        } 
        if(sudoku[row][col] != 0){ //if it is 0 then only we can place new digit but we can't update already existing digit
          return sudokuSolver(sudoku, nextRow, nextCol);
        }
        for(int digit=1; digit<=9; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)) //if solution exist
                {
                    return true;
                }
                sudoku[row][col] = 0;  //if condition false then we don't place the digit here
            }
        }
        return false;
    }
    public static void printSudoku(int sudoku[][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int sudoku[][] = { {0,0,8,0,0,0,0,0,0},
                           {4,9,0,1,5,7,0,0,2},
                           {0,0,3,0,0,4,1,9,0},
                           {1,8,5,0,6,0,0,2,0},
                           {0,0,0,0,2,0,0,6,0},
                           {9,6,0,4,0,5,3,0,0},
                           {0,3,0,0,7,2,0,0,4},
                           {0,4,9,0,3,0,0,5,7},
                           {8,2,7,0,0,9,0,1,3} };

        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("solution exists");
            printSudoku(sudoku);
        }else{
            System.out.println("solution doesn't exist");
        }

    }
}
