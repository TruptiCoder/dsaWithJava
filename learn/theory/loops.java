import java.util.*;

public class loops{
    public static void main(String args[]){
        //while loop
        // int count=0;
        // while(count<100)
        // {
        //     System.out.println("hello world");
        //     count++;
        // }
        // System.out.println("printed hello world 100 times");


        //print numbers from 1 to 10
        // int number=1;
        // while(number<=10)
        // {
        //     System.out.println(number);
        //     number++;
        // }


        //print sum of n numbers
        // System.out.println("enter the value of i");
        // int n=sc.nextInt();
        // int i=1;
        // int sum=0;
        // while(i<=n)
        // {
        //     sum+=i;
        
        //     i++;
        // }
        //   System.out.println("sum is " + sum);


        //for loop
        // int i;
        // for(i=0;i<=4;i++)
        // {
        //       System.out.println("hello world");
        // }


        //print square pattern
        // for(int line=1;line<=4;line++)
        // {
        //       System.out.println("* * * *" );
        // }


        // print reverse of the number
        //   System.out.println("enter a number");
        // int n=sc.nextInt();
        // while(n>0)
        // {
        //     int lastdigit = n % 10;
        //       System.out.print(lastdigit + " ");
        //     n = n / 10;
        // }


        //reverse of given number
        //   System.out.println("enter a number");
        //   int n=sc.nextInt();
        //   int reverse=0;
        //   while(n>0)
        //   {
        //     int lastdigit = n % 10;
        //     n = n / 10;
        //     reverse = reverse * 10 +lastdigit;
        //   }
        //   System.out.print( reverse + " " );


        //do while loop
        // int counter=0;
        // do{
        //     System.out.println("hello world");
        //     counter++;
        // }
        // while(counter<0);


        //break statement
        // for(int i=1;i< 10;i++)
        // {
        // if(i==3)
        // {
        //     break;
        // }

        // System.out.println(i);
        // }
        // System.out.println("i is out of the loop");


        //break keyword
        // do{
        //     System.out.println("enter a number");
        //     int n=sc.nextInt();
        //     if(n % 10 == 0)
        //     {
        //         break;
        //     }
        //     System.out.println(n + " ");
        // } while(true);


        //continue statement
        // do{
        //      System.out.println("enter a number");
        //      int n=sc.nextInt();
        //      if(n % 10 == 0)
        //      {
        //         continue;
        //      }
        //      System.out.println(n + " ");
        //      }
        //      while(true);

        // for(int i=1;i<=5;i++)
        // {
        //     if(i==3)
        //     {
        //         continue;
        //     }
        //     System.out.println(i);
        // }



        //prime or not
        // System.out.println("enter a number");
        // int n=sc.nextInt();
        // if( n == 2)
        // {
        //     System.out.println( n + " is prime");
        // }
        // else{
        // boolean isprime = true;
        // for(int i=2;i<=n-1;i++)
        // for(int i=2;i<=Math.sqrt(n);i++)
        // {
        //     if(n % i ==0)
        //     {
        //         isprime = false;
        //     }
            
        
        // }
        // if(isprime == true)
        // {
        //     System.out.println( n + " is a prime number ");
        // }
        // else
        // {
        //     System.out.println( n + " is not a prime number ");
            
        // }
        // }


        //printing a right triangle star pattern
        for(int line=1;line<=4;line++)
        {
            for(int star=1;star<=line;star++)
            {
                System.out.print( " * ");
            }
            System.out.println();
            
        }

    }
}