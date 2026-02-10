package Array.medium;

public class FindMajorityElement { //appears more than n/2 times

    public static void main(String[] args) {
        int[] arr = {11, 33, 22, 44,33,23};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count = count + 1;
                }
            }
        }
    }
}
