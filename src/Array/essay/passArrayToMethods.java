package Array.essay;

public class passArrayToMethods {


    private static void change(int[] roy) { // because array ka reference (address) pass hota hai,
        roy[1] = 33;                         // The array is stored in one place in memory (heap memory).
        roy[3] = 44;                          // Java sends the value of the reference (the memory address).
    }

    public static void main(String[] args) {
        int[] arr = {12, 32 , 43, 34, 54, 65};
        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]+ "  " +arr[3]);
    }
}
