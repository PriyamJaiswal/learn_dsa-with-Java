package Array.essay;
import java.util.Arrays;

public class a5_makeAscendingOrder {
    public static void main(String[] args){
        int[] arr = {4, 3, -1, 8, 5 , -9};
        print(arr);
        Arrays.sort(arr);
        System.out.print("Sorted Array => ");
        print(arr);
    }
    public static  void print(int[] a){
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
}
