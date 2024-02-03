public class solidRhombus{
    public static void main(String args[]){
        int n = 5;
        for(int i = n; i > 0; i--){
            int h = 1;
            for(int j = 0; j < (n*2); j++){
                if(j >= i && h <= n){
                    System.out.print("* ");
                    h++;
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}