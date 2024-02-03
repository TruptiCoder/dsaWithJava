import java.util.*;

public class assign3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Question no. 1

        // int num = sc.nextInt();
        // if(num >= 0){
        //     System.out.println("Number is positive");
        // }
        // else{
        //     System.out.println("Number is negetive");
        // }

        //Question no. 2

        // double temp = 103.5;
        // if(temp > 100){
        //     System.out.println("You have a fever");
        // }
        // else{
        //     System.out.println("You don't have a fever");
        // }

        //Question no. 3

        // System.out.println("Enter week number(1-7)");
        // int weekNum = sc.nextInt();
        // switch(weekNum){
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sonday");
        //         break;
        //     default:
        //         System.out.println("Invalid Case");
        //         break;
        // }

        //Question no. 4

        // int a = 63 , b = 36;
        // boolean x = (a < b) ? true : false;
        // int y = (a > b) ? a : b;

        // x = false , y = 63

        //Question no. 5

        System.out.println("Enter a year");
        int year = sc.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                System.out.println("Leap year");
            }
            else{
                if(year % 400 == 0){
                    System.out.println("Not a Leap year");
                }
                else{
                    System.out.println("Leap year");
                }
            }
        }
        else{
            System.out.println("Not a Leap year");
        }

    }
}