package Array.essay;

import java.util.Scanner;

public class a2_sumOfElementsInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter size: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter Array element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        System.out.print("Sum of all array index: " + sum);
    }
}
