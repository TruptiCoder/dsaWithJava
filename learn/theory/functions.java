// import java.util.*;

public class functions{
    public static void hello(){
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        return;
    }

    public static int calculateSum(int num1, int num2){   //parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }

    public static int factorial(int a){
        int f = 1;
        for(int i = 1; i <= a; i++){
            f = f * i;
        }
        return f;
    }

    public static int binCoeff(int n , int r){
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nmrfact = factorial((n-r));
        int result = nfact / (rfact * nmrfact);
        return result;
    }

    public static boolean prime(int n){
        if(n == 2){
            return true;
        }

        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n){
        for(int i = 2; i <= n; i++){
            if(prime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static void binToDec(int bin){
        int myNum = bin;
        int pow = 0;
        int decNum = 0;

        while(bin > 0){
            int lastDigit = bin % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2 , pow));
            pow++;
            bin = bin/10;
        }
        System.out.println("Decimal of " + myNum + " is " + decNum);
    }

    public static void decToBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while(n > 0){
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));

            pow++;
            n = n/2;
        }

        System.out.println("binary form of " + myNum + " = " + binNum);
    }

    //Function overloading
    public static int sum(int a , int b){
        return a + b;
    }

    public static int sum(int a , int b, int c){
        return a + b + c;
    }

    public static float sum(float a , float b){
        return a + b;
    }

    public static void main(String args[]){
        // hello();

        // Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int result = calculateSum(a , b); //arguments or actual parameters
        // System.out.println(result);

        // int a = 5;
        // int b = 10;
        // swap(a ,b);

        // int a = 3;
        // int b = 5;
        // int prod = multiply(a , b);
        // System.out.println("a * b = " + prod);

        // int a = sc.nextInt();
        // int fact = factorial(a);
        // System.out.println("Factorial of " + a + " is " + fact);

        // int n = 5;
        // int r = 2;
        // int binomialCoeff = binCoeff(n , r);
        // System.out.println("Binomial coefficient is " + binomialCoeff);

        // int a = 2 , b = 5 , c = 3;
        // float d = 5.23f , e = 6.3f;
        // int result = sum(a , b);
        // System.out.println("Sum is " + result);
        // float output = sum(d , e);
        // System.out.println("Sum is " + output);

        // System.out.println(prime(3));

        // primeInRange(20);

        // binToDec(1001);
        // decToBin(23);

        // {
        //     int s = 45;
        //     System.out.println(s);
        // }
        // System.out.println(s); //This will give a error because of block scope


    }
}