package Array.medium;

import java.util.Scanner;

public class rotateArrayRightSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= {11,21,32,23,45,64};
        int n = arr.length;
        int k = sc.nextInt();
        k = k % n;
        reverse(arr,0,n-1); // Right
        reverse(arr, 0,n-k-1); // Side
        reverse(arr, n-k, n-1);   // Rotation
        printRotateArray(arr);
//        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int a, int b){
        for (int i = a, j=b; i < j; i++, j--) {
            int temp = arr[i];
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
