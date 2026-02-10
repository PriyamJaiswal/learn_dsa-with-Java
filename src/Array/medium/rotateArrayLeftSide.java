package Array.medium;
import java.util.Scanner;

public class rotateArrayLeftSide {
public static void main(String[] args) {
    Scanner  sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    enterArray(arr);
    int k = sc.nextInt();
    rotate(arr,k);
    printRotateArray(arr);
  }

  public static void enterArray(int[] arr) {
    Scanner in = new Scanner(System.in);
      for (int i = 0; i < arr.length; i++) {
          arr[i] = in.nextInt();
      }
  }

  public static void rotate(int[] arr, int k){
    int n = arr.length;
    k = k % n;
      reverse(arr,0,k-1);   // Left
      reverse(arr, k,n-1);     // Side
      reverse(arr, 0, n-1);  // Rotation
  }
  public static void reverse(int[] arr, int a, int b){
      for (int i = a, j = b; i < j; i++, j--) {
          int temp =  arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
      }
  }

  public static void printRotateArray(int[] arr){
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
  }

}