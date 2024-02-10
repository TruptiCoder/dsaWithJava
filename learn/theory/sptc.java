public class sptc{

    public static int power1(int a , int n){
        if(n == 0){
            return 1;
        }
        return a * power1(a , n-1);
    }

    public static int power2(int a , int n){
        if(n == 0){
            return 1;
        }
        int halfpow = power2(a , n/2);
        int half = halfpow * halfpow;

        if(n%2 == 0){
            return a * half;
        }

        return half;
    }

    public static void main(String args[]){
        System.out.println(power2(5 , 2));
    }
}