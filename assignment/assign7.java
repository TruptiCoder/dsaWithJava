public class assign7 {

  //Question no 1
  public static int times7(int num[][]) {
    int count = 0;
    int n = num.length;
    int m = num[0].length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (num[i][j] == 7) {
          count++;
        }
      }
    }
    return count;
  }

  //Question no 2
  public static int sumSec(int num[][]) {
    int sum = 0;
    int m = num[0].length;
    for (int i = 0; i < m; i++) {
      sum += num[1][i];
    }
    return sum;
  }

  //Question no 3
  public static void printArr(int num[][]) {
    for (int i = 0; i < num.length; i++) {
      for (int j = 0; j < num[0].length; j++) {
        System.out.print(num[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void transpose(int num[][]) {
    int n = num.length;
    int m = num[0].length;
    int temp[][] = new int[m][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        temp[j][i] = num[i][j];
      }
    }

    System.out.println("Array after");
    printArr(temp);
  }

  public static void main(String args[]) {
    int numbers[][] = { { 1, 4, 7, 5 }, { 6, 2, 7, 5 }, { 2, 2, 1, 7 } };
    // int result = sumSec(numbers);
    // System.out.println("7 in the 2d array is " + result);

    System.out.println("Array before");
    printArr(numbers);
    transpose(numbers);
  }
}
