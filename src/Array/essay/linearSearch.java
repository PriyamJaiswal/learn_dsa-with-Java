package Array.essay;
import java.util.Scanner;

public class linearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {12, 23, 43, 65 , 65, 2, 12, 54, 2, 87};
        int x = sc.nextInt();
        boolean flag = false; //nhi mila

        for (int i = 0; i < a.length; i++) {
             if (a[i] == x) {
                 flag = true; //mil gya
                 break;
             }
        }

        if (flag ==false) System.out.println("nhi mila");
        else System.out.println("Mil gya");
    }
}
