package Array.essay;

import java.util.Arrays;
import java.util.Scanner;

public class a1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = in.nextInt();

        System.out.println("ARRAY OF PRMITIVE DATA TYPE");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)   arr[i] = in.nextInt();
        System.out.println();

//        print arr using normal for loop
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");}

//     OR - enhanced for loop
        for (int i : arr) {    // for each element in arr, print the element
            System.out.print(i + " ");    // here i represents each element of the array
        }
        System.out.println();
        // SAME
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

//        print arr form of string
        System.out.println(Arrays.toString(arr));

        System.out.println("ARRAY OF OBJECT DATA TYPE");
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = in.next();}

        System.out.println(Arrays.toString(str));
    }
}
