import java.util.*;

public class Operations {
    public static void main(String[] args) {
        // Create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // Get
        // int population = hm.get("India");
        // System.out.println(population);
        // System.out.println(hm.get("Indonesia"));

        // // Contains key
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Bhutan"));

        // // Remove 
        // System.out.println(hm.remove("China"));
        // System.out.println(hm);

        // Size
        System.out.println(hm.size());

        // Is Empty
        System.out.println(hm.isEmpty());

        // Clear
        hm.clear();
        System.out.println(hm);

    }
}
