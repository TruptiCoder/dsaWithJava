import java.util.*;

public class assign5 {

    //Question no. 1
    public static void average(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numberes");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float sum = a + b + c;
        float avg = sum/3;
        System.out.println("Average is " + avg);
    }

    //Question no. 2
    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    //Question no. 3
    public static void isPal(int n){
        int temp = 0;
        int myNum = n;
        int reverse = 0;
        while(n != 0){
            temp = n % 10;
            reverse = (reverse * 10) + temp;

            n = n/10;
        }

        if(myNum == reverse){
            System.out.println("Your number is palindrome");
        }
        else{
            System.out.println("Your number is not a palindrome");
        }
    }

    //Question no. 5
    public static void intSum(int n){
        int sum = 0, temp = 0;
        int myNum = n;
        while(n != 0){
            temp = n % 10;
            sum = sum + temp;
            n = n / 10;
        }
        System.out.println("Sum of " + myNum + " is " + sum);
    }


    public static void main(String args[]){

        // average();

        // boolean result = isEven(33);
        // System.out.println("Number is " + result);

        // isPal(12321);

        intSum(123);
    }
}
