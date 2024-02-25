// import java.util.*;

public class largestNum {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; //-infinity

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE; // infinity

        for(int i=0; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){

        int number[] = {1, 3, 5, 6, 7, 9};
        System.out.println("Largest value is " + getLargest(number));
        System.out.println("Smallest value is " + getSmallest(number));
    }
}
