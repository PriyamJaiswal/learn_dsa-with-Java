package Array.essay;

public class a2 {
    public static void main(String[] args) {
        int[] marks = {100,93, 45, 67, 87, 4, 32, 98 , 23};

        System.out.println("Print index less than 35");
        for (int i = 0; i < marks.length; i++) {
            if(marks[i] <= 35) {
                System.out.println( i );
            }
        }
    }
}
