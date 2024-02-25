// import java.util.*;

public class string {

    public static String substring(String str , int si, int ei){
        String substr = "";
        for(int i = si; i < ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static String toUpper(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String compress(String str){
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            // newStr += " ";
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }

        }
        return newStr;
    }

    public static void main(String args[]){
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // //Strings are IMMUTABLE

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());

        //Concatanation
        // String firstName = "Trupti";
        // String LastName = "Balbudhe";
        // String fullName = firstName + " " + LastName;
        // System.out.println(fullName);

        //String comparision
        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");

        // if(s1 == s2){
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("String are not equal");
        // }

        // if(s1 == s3){
        //     System.out.println("Strings are equal 2");
        // }
        // else{
        //     System.out.println("Strings are not equal 2");
        // }

        // if(s1.equals(s3)){
        //     System.out.println("Equal");
        // }
        // else{
        //     System.out.println("Unequal");
        // }

        //SubString
        // String str = "Hello world";
        // System.out.println(str.substring(0, 5));
        // System.out.println(substring(str , 0 , 5));

        //Largest string
        // String fruits[] = {"Apple", "Mango", "Banana"};
        // String Largest = fruits[0];
        // for(int i = 0; i < fruits.length; i++){
        //     if(Largest.compareTo(fruits[i]) < 0){
        //         Largest = fruits[i];
        //     }
        // }
        // System.out.println(Largest);

        // StringBuilder sb = new StringBuilder("");
        // for(char ch = 'a'; ch <= 'z'; ch++){
        //     sb.append(ch);
        // }
        // System.out.println(sb.length());

        //Covert to uppercase
        // String str = "hi i am trupti balbudhe";
        // System.out.println(toUpper(str));

        //compressing
        String str = "aaaabbbbbdddddccccedddddd";
        System.out.println(compress(str));
    }    
}
