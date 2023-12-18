package codility;

import java.util.Arrays;

public class SmallestPositiveInteger {

    public static void main(String[] args) {
        ;
        System.out.println(solution(new int[]{-1, -3}));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        if (A.length == 0 || A[A.length-1] < 0) {
            return 1;
        }
        int min = A[0];
        int max = A[A.length-1];

        for(int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                continue;
            }
            if (i < (A.length - 2) && A[i] == A[i+1]) {
                continue;
            }

            int nextNumber = (A[i] + 1);
            if (i < (A.length - 1) && nextNumber != A[i+1]) {
                return nextNumber;
            }
        }
        return max + 1;
    }


}
