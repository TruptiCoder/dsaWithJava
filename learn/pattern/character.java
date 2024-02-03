public class character{
    public static void main(String args[]){

        int n = 5 ;
        char x = 'A';
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }
}