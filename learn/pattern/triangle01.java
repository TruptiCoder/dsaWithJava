public class triangle01{
    public static void main(String args[]){
        int n = 5 , h = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(h == 0){
                    h = 1;
                }
                else{
                    h = 0;
                }
                System.out.print(h + " ");
            }
            System.out.println();
        }
    }
}