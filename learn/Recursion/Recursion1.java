public class Recursion1{
    //decreasing order
    public static void printDec(int n){
        if(n == 1){        //base case
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);   //call inner function
    }
    //incresing order
    public static void printInc(int n){
        if(n == 1){        //base case
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);   //call inner function
        System.out.print(n + " ");
    }
    //factorial
    public static int Fact(int n){  //O(n)
        if(n == 0){
            return 1;
        }
        int fnm1 = Fact(n-1);
        int fn = n * fnm1;
        return fn;
    }
    //sum of natural numbers
    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = Sum(n-1);
        int sn = n + snm1;
        return sn;
    }
    //fibonacci seriesn    //O(2^n)
    public static int Fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = Fib(n-1);
        int fnm2 = Fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean issorted(int arr[],int i){
        if(i == arr.length-1){ //base condition
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return issorted(arr,i+1);
    }

    public static int firstOccurence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }

    public static int lastOccurence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr,key,i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static int power(int x,int n){
        if(n == 0){
            return 1;
        }
        // int xnm1 = power(x,n-1);
        // int xn = x * xnm1;
        // return xn;
        return x * power(x,n-1);
    }
    public static int optimizedPower(int a,int n){
        if(n == 0){
            return 1;
        }
        int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a,n/2);
        //n is odd
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    

   
    public static void main(String args[]){
    int n = 5;
    // printDec(n);
    // printInc(n);
    System.out.println(Fact(n));
    // System.out.println(Fib(n));
    int arr[] = {2,8,6,8,4,7,5,4};
    System.out.println(lastOccurence(arr,8,0));
    
    
    }
}