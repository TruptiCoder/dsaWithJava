public class butterfly{
    public static void main(String args[]){
        int n = 5;
        int h = (n*2)-1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < (n*2); j++){
                if(j <= i || j >= h){
                    System.out.print("* "); 
                }
                else{
                    System.out.print("  ");
                }
            }
            h--;
            System.out.println();
        }
        for(int i = n; i > 0; i--){
            for(int j = 0; j < (n*2); j++){
                if(j < i || j > h){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            h++;
            System.out.println();
        }
    }
}