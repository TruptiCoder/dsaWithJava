public class hollowRhombus{
    public static void main(String args[]){
        int n = 5;
        for(int i = n; i > 0; i--){
            int h = 1;
            for(int j = 0; j < (n*2); j++){
                if(j >= i && h <= n){
                    if(h == 1 || h == n || i == 1 || i == n){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
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