package Array.essay;
import java.util.Arrays;
import java.util.Scanner;

public class checkAsendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterArray(arr);
        boolean a = check(arr);
        print(arr,a);
    }

    private static boolean check(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }

    private static void enterArray(int[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
    }

    private static void print(int[] arr, boolean a){
        if (a == false) System.out.println("Array is not asending order.");
        else System.out.println("Array is asending order.");
        System.out.println(Arrays.toString(arr));
    }
}
