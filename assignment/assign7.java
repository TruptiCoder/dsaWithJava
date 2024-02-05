public class assign7 {

    //Question no 1
    public static int times7(int num[][]){
        int count = 0;
        int n = num.length;
        int m = num[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(num[i][j] == 7){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]){
        int numbers[][] = {{1 , 4, 7, 2}, {2, 7 ,5, 7}, {2 , 1, 7, 2}};
        int result = times7(numbers);
        System.out.println("7 in the 2d array is " + result);
    }
}
