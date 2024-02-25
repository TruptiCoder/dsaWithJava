import java.util.*;

public class PairSum {

    //Pair sum in sorted arrayList
    //brute force
    public static boolean sum(ArrayList<Integer> list, int target){
        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

    //2 pointer approch
    public static boolean pairSum(ArrayList<Integer> list , int target){
        int lp = 0 , rp = list.size()-1;
        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                System.out.println(list.get(lp) + " + " + list.get(rp));
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }

    //Pair sum in sorted and rotated arrrayList
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int bp = -1;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }

        int lp = bp+1; 
        int rp = bp;

        while(lp != rp){
            //case1
            if(list.get(lp) + list.get(rp) == target){
                System.out.println(list.get(lp) + " + " + list.get(rp));
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target){
                lp = (lp + 1)%list.size();
            }
            else{
                rp = (list.size() + rp -1)% list.size();
            }
        }

        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        int target = 14;

        //Sorted
        // for(int i = 0; i < 6; i++){
        //     list.add(i+1);
        // }
        // System.out.println("Target is " + target);
        // System.out.println(pairSum(list, target));
        
        //Sorted and rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
        System.out.println("Target is " + target);
        System.out.println(pairSum2(list, target));

    }
}
