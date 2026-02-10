package Array;

import java.util.Arrays;
import java.util.Scanner;

public class multiDimension {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
//        int[][] arr = new int[3][];

//        int[][] arr2D = {
//                {1,2,3},  // 0th index
//                {3,2,1},  // 1st
//                {1,2}     //2nd
//        };

// Take input
        int[][] arr = new int[3][3];
        System.out.println(arr.length);                        // no. of row

        // input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {  // no. of column = arr[row].length
                arr[row][col] = sc.nextInt();
            }
        }
        //output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {  // no. of column = arr[row].length
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        // use TOString
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        //enhanced + toString
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

     }
}
