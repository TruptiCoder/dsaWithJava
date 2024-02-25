import java.util.*;

public class MostWater {

    //Brute force O(n^2)
    public static int maxWater(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                int width = j-i;
                int hgt = Math.min(list.get(i) , list.get(j));
                int area = width * hgt;
                max = Math.max(area , max);
            }
        }
        return max;
    }

    //2 pointer approch
    public static int storeWater(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        int lp = 0 , rp = list.size()-1;
        while(lp < rp){
            //calculate water area
            int ht = Math.min(list.get(lp) , list.get(rp));
            int width = rp - lp;
            int curr = ht * width;
            max = Math.max(curr , max);

            //update pointer
            if(list.get(lp) < list.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return max;
    }

    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(height);
        System.out.println(storeWater(height));
    }
}
