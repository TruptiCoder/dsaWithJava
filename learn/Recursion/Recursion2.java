public class Recursion2 {
    //tiling problem
    public static int tilingProblem(int n){ //2 x n (floor size)
        //base case
        if(n == 0 || n == 1){
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1 = tilingProblem(n-1);
    
        //horizontal choice
        int fnm2 = tilingProblem(n-2);
        int totWays = fnm1 + fnm2;
        return totWays;
        }
    
        public static void removeDuplicates(String str,int idx, StringBuilder newStr,boolean map[]){
            if(idx == str.length()){
                System.out.println(newStr);
                return;
            }
            //kaam
            char currChar = str.charAt(idx);
            if(map[currChar - 'a'] == true){
                //duplicate
                removeDuplicates(str,idx+1,newStr,map);
            }else{
                map[currChar - 'a'] = true;
                removeDuplicates(str,idx+1,newStr.append(currChar),map);
            }
        }
    
        public static int friendPairing(int n){
            if(n==1 || n == 2){
                return n;
            }
            //choice
            //single
            int fnm1 = friendPairing(n-1);
            //pair
            int fnm2 = friendPairing(n-2);
            int pairWays = (n-1) * fnm2;
            //totways
            int totWays = fnm1 + pairWays;
            return totWays;
        }
        public static void printBinStrings(int n,int lastPlace,String str){
            //base case
            if(n == 0){
                System.out.println(str);
                return;
            }
            //kaam
            printBinStrings(n-1,0,str + "0");
            if(lastPlace == 0){
                printBinStrings(n-1,1,str + "1");
            }
        }
            public static void main(String args[]){
                // System.out.println(tilingProblem(4));
                // String str = "apnnacollege";
                // removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
                // System.out.println(friendPairing(4));
                printBinStrings(3,0,"");
            }
        
    
       
    
}
