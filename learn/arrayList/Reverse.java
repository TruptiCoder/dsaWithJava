import java.util.ArrayList;

public class Reverse {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<5; i++){
            list.add(i+1);
        }

        //Reverse print O(n)
        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
