import java.util.*;

public class Knapsack {
    public static void main(String args[]){
        int val[] = {60 , 100 , 120};
        int weight[] = {10 , 20 , 30};
        int W = 50;

        double ratio[][] = new double[val.length][2];
        //0th col => idx; 1st col => ratio

        for(int i = 0; i < val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i]; 
        }

        //ascending order
        Arrays.sort(ratio , Comparator.comparingDouble(o -> o[1]));

        int finalVal = 0;
        for(int i = ratio.length-1; i >= 0 ; i--){
            int idx = (int)ratio[i][0];
            if(W >= weight[idx]){ //inlcude full item
                finalVal += val[idx];
                W -= weight[idx];
            }
            else{
                //include fraction item
                finalVal += (ratio[i][1] * W);
                W = 0;
                break;
            }
        }

        System.out.println("final value = " + finalVal);
    }
}
