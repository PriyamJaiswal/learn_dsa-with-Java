package Array.medium;
import java.util.Scanner;

public class findTwoSumEqualToGIven {

    private static int[] twoSum(int[] num, int target) {
        int n = num.length;
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (num[i]+num[j] == target){
                    ans[0]=i; ans[1]=j;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {11, 22, 12, 56, 57, 68, 10};
        System.out.print("Enter your value: ");
        int x = in.nextInt();
        int[] ans = twoSum(arr, x); //store returned indexes
        System.out.println("Indexes: [" +ans[0]+","+ans[1]+ "]");
        System.out.println("Values: (" +arr[ans[0]]+","+arr[ans[1]]+ ")");
        }
}

