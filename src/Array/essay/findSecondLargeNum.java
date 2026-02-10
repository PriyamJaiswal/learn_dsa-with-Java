package Array.essay;

public class findSecondLargeNum {
    public static void main(String[] args) {
        int[] a = {12, 23, 21, 43, 53, 42, 56, 54, 89, 88, 43, 32};
        int secondLarge = Integer.MIN_VALUE;
        int large = Integer.MIN_VALUE;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > large)  large = a[i];
             else if (a[i] > secondLarge && a[i] != large) {
                secondLarge = a[i];
            }
        }
        System.out.println(secondLarge);
    }
}
