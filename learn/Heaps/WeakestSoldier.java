import java.util.PriorityQueue;

public class WeakestSoldier {
    public static class Soldier implements Comparable<Soldier>{
        int count;
        int idx;

        public Soldier(int count, int idx){
            this.count = count;
            this.idx = idx;
        }

        @Override
        public int compareTo(Soldier s2){
            if(this.count == s2.count){
                return this.idx - s2.idx;
            }
            else{
                return this.count - s2.count;
            }
        }
    }

    public static void main(String args[]){
        int arr[][] = {{1, 0, 0, 0}, 
                       {1, 1, 1, 1},
                       {1, 0, 0, 0}, 
                       {1, 0, 0, 0}};
        int k = 2;

        PriorityQueue<Soldier> pq = new PriorityQueue<>();

        for(int i = 0; i<arr.length; i++){
            int count = 0; 
            for(int j = 0; j < arr[i].length; j++){
                count += arr[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Soldier(count , i));
        }

        for(int i = 0; i < k; i++){
            System.out.println("R" + pq.remove().idx);
        }
    }
    
}
