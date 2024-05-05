import java.util.ArrayList;

public class heaps {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at last idx
            arr.add(data);

            int x = arr.size() - 1;
            int par = (x - 1) / 2;

            while (arr.get(x) < arr.get(par)) { // O(logn)
                // swap
                if (par >= 0) {
                    int temp = arr.get(x);
                    arr.set(x, arr.get(par));
                    arr.set(par, temp);
                    x = par;
                    par = (x - 1) / 2;
                }
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void hepify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minidx = i;

            if(left < arr.size() && arr.get(minidx) > arr.get(left)){
                minidx = left;
            }

            if(right < arr.size() && arr.get(minidx) > arr.get(right)){
                minidx = right;
            }

            if(minidx != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minidx));
                arr.set(minidx, temp);

                hepify(minidx);
            }
        }

        public int remove() { //O(logn) 
            int data = arr.get(0);

            // swap 1st and last
            int temp = arr.get(0);
            arr.set(0 , arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // delete last
            arr.remove(arr.size()-1);

            // hepify
            hepify(0);
            return data;
        }

        public boolean isEmpty(){
            if(arr.size() == 0){
                return true;
            }
            return false;
        }
    }

    public static void main(String args[]) {
        Heap h = new Heap();
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(6);
        h.add(1);

        while(!h.isEmpty()){
            System.out.print(h.peek() + " ");
            h.remove();
        }
    }
}
