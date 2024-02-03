public class reverseArray{

    public static void revArray(int numbers[]){
        int first = 0, last = numbers.length-1;

        while(first < last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }

    public static void printArray(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int numbers[] = {10 , 23 ,31 , 45, 59};
        printArray(numbers);
        revArray(numbers);
        printArray(numbers);
    }
}