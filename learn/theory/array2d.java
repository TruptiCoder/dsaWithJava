import java.util.*;

public class array2d {
    
    public static boolean search(int matrix[][], int key){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    //Spiral matrix
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j = startCol; j <= endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }

            //right
            for(int i = startRow+1; i <= endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            //bottom
            for(int j = endCol-1; j >= startCol; j--){
                System.out.print(matrix[endRow][j] + " ");
            }

            //left
            for(int i = endRow-1; i > startRow; i--){
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    
    
    public static void main(String args[]){
        // int matrix[][] = new int[3][3];
        // int n = matrix.length, m = matrix[0].length;

        // Scanner sc = new Scanner(System.in);
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }

        // //Output
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        // System.out.println("Enter key value");
        // int key = sc.nextInt();
        // search(matrix, key);

        //Spiral matrix
        // int matrix[][] ={   {1, 2, 3, 4},
        //                     {5 , 6 , 7 , 8},
        //                     {9 , 10 , 11, 12},
        //                     {13 , 14 , 15 ,16}
        //                 };

        // printSpiral(matrix);


    }
}
