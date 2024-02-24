import java.util.ArrayList;

public class Classroom {

  public static void main(String args[]) {
    // String | Boolean | Float
    //ClassName objectName = new ClassName();
    //Angular bracets show which type of data you want to store
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    ArrayList<Boolean> list3 = new ArrayList<>();

    //Add elements
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    list.add(1 , 9);

    list2.add("Hello");
    list2.add("World");

    list3.add(true);
    list3.add(false);

    // System.out.println(list);
    // System.out.println(list2);

    //Get elements
    // int element = list.get(2);
    // System.out.println(element);

    //Remove element
    list.remove(2);
    // System.out.println(list);

    //Set element at index
    list.set(2, 10);
    // System.out.println(list);

    //Contains element
    // System.out.println(list.contains(1));
    // System.out.println(list.contains(11));

    //Size of ArrayList
    System.out.println(list.size());
    for(int i=0; i<list.size(); i++){
      System.out.print(list.get(i) + " ");
    }
    System.out.println();
  }
}
