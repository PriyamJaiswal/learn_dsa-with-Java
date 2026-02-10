package Array.medium;
import java.util.Scanner;

public class reverseArrayWithoutExtraArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterArray(arr);

        int i = 0, j = n-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++ ;
            j--;
        }
        printReverseArray(arr);
    }

    public static void enterArray(int[] arr ){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
    }
    private static void printReverseArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
