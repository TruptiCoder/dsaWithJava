import java.util.*;

public class Array2d {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        mainList.add(list2);

        System.out.println(mainList);

        for(int i = 0; i < mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j = 0; j < currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        ArrayList<ArrayList<Integer>> newList = new ArrayList<>();
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();

        for(int i = 1; i <= 5; i++){
            arr1.add(i);
            arr2.add(i*2);
            arr3.add(i*3);
        }

        newList.add(arr1);
        newList.add(arr2);
        newList.add(arr3);

        System.out.println(newList);

        for(int i = 0; i < newList.size(); i++){
            ArrayList<Integer> curr = newList.get(i);
            for(int j = 0; j < curr.size(); j++){
                System.out.print(curr.get(j) + " ");
            }
            System.out.println();
        }
    }
}
