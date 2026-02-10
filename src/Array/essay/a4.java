package Array.essay;

import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();
        int[] arr = {21, 23, 43, 4, 6, 34, 23, 12, 54, 9};

        System.out.print("Count num of element in given array greater than a given num x: ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > x){
                sum = sum + 1;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Number of element: "+ sum);
    }
}
