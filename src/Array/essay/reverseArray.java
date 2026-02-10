package Array.essay;

public class reverseArray {

    public static void print(int[] arr){
        int n = arr.length;
        int[] brr= new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >= 0 ; j--) {
                brr[i] = arr[n-1-i];
            }
            System.out.println(brr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 19, 64, 43, 23, 78, 32};
        print(arr);
    }
}
