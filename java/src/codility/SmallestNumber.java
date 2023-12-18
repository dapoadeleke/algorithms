package codility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] A = {-1, -5, -1};

        System.out.println(solution(A));

    }

    static int solution(int[] A) {
        Arrays.sort(A);
        if (A.length == 0 || A[A.length-1] < 1)
            return 1;
        int previousNumber = A[0];
        for (int i = 1; i < A.length; i++) {
            int diff = A[i] - previousNumber;
            if (diff > 1) {
                return previousNumber + 1;
            }
            previousNumber = A[i];
        }
        return previousNumber + 1;
    }
}
