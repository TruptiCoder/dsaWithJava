// import java.util.*;

public class array {

    public static void update(int marks[] , int nonChangeble){
        for(int i = 0; i < marks.length; i++){
            marks[i] += 1;
        }
        nonChangeble = 10;
    }
    public static void main(String args[]){

        //  int marks[] = new int[50];
        //  int numbers[] = {1 , 2, 3};
        //  int moreNumbers[] = {4, 5 , 6};
        //  String fruits[] = {"apple", "mango", "orange"};

        // Scanner sc = new Scanner(System.in);

        // int marks[] = new int[89];
        // System.out.println("length of array = " + marks.length);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("phy : " + marks[0]);
        // System.out.println("chem : " + marks[1]);
        // System.out.println("maths : " + marks[2]);

        // marks[2] += 1;
        // System.out.println("maths : " + marks[2]);

        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("percentage : " + percentage + "%");


        int marks[] = {97 , 98 , 95};
        int nonChangeble = 5;
        update(marks , nonChangeble);

        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println(nonChangeble);
    }
}
