package Array.medium;
import java.util.Scanner;

public class reverseArrayWithoutExtraArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        enterArray(arr);
        swap(arr,n);
        reverseArray(arr);
    }

    public static void enterArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void swap(int[] arr, int n){
        for (int i = 0, j = n-1; i < j; i++ ,j--) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }
    }

    public static void reverseArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
