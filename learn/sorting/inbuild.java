import java.util.*;

public class inbuild{

    public static void printArr(Integer arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        // int arr[] = {5 , 4 , 1 , 3 , 2};
        Integer arr[] = {5 , 4 , 1 , 3 , 2};
        // Arrays.sort(arr);
        // Arrays.sort(arr , 0 , 3);
        Arrays.sort(arr, Collections.reverseOrder());
        // Arrays.sort(arr,0 , 4, Collections.reverseOrder());
        printArr(arr);
    }
}