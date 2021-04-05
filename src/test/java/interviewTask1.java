import java.util.Scanner;

public class interviewTask1 {

    public static int solution(int[] A) {
        int min = A[0];
        int wantedNum=0;

        for (int smallest : A) {
            if (smallest > 0 && smallest < min) {
                min = smallest;
            }
        }
        System.out.println("min = " + min);

            for (int j = 0; j <A.length-1 ; j++) {
                if (min + 1 == A[j]) {
                    min = A[j];

                } else wantedNum = min + 1;

            }
        return wantedNum;
    }

    public static void main(String[] args) {

        int[] A = {87, 11, 6, 98, 785, 211, 24, 15, 6, 7, 9, 3, 4,2, 8821, 100};

        System.out.println("Missing minimium number = " + solution(A));

    }
}
