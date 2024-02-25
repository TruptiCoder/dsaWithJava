// import java.util.*;

public class subarray{

    public static void subArray(int numbers[]){
        int ts = 0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                // int sum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k] + " ");
                    // sum += numbers[k];
                }
                ts = ts+1;
                System.out.println();
            }
        }
        // System.out.println("total subarrays are " + ts);
    }

    //Brute force approch
    public static void bruteMaxSum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                currSum = 0;
                for(int k=i; k<=j; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum = " + maxSum);
    }

    //prefix sum
    public static void preMaxSum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum = " + maxSum);
    }

    //Kadanes algorithm
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs , ms);
        }
        System.out.println("our max subarray sum is: " + ms);
    }

    public static void main(String args[]){
        int numbers[] = {-2 , -3 , 4 , -1 , -2, 1, 5, -3};
        kadanes(numbers);
    }
}