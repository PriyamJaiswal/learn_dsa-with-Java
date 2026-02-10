package Array.medium;

import java.util.Scanner;

public class commonElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        enterArray(a);
        enterArray(b);
        checkCommonElement(a,b);
    }

    private static void checkCommonElement(int[] a, int[] b) {
        System.out.print("Common Element: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]){
                    System.out.print(a[i] + " ");
                }
            }
        }
    }

    private static void enterArray(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
    }
}
