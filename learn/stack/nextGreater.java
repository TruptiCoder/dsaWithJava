import java.util.*;

public class nextGreater {
    public static void main(String args[]){
        int arr[] = {2, 4, 9, 3, 2, 10, 6, 8};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i = arr.length-1; i >= 0; i--){
            //while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //if-else
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }
            else{
                nxtGreater[i] = arr[s.peek()];
            }

            //push
            s.push(i);
        }

        for(int i = 0; i < nxtGreater.length; i++){
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }
}
