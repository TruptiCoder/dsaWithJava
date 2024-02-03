public class floydsTri{
    public static void main(String args[]){
        int n = 5 , h = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(h + " ");
                h++;
            }
            System.out.println();
        }
    }
}