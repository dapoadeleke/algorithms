package creditville;


/*
*   Cyclic Rotation Test
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println("Hello Cyclic Rotation");
        Solution s = new Solution();
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int[] res = s.solution(arr, 3);
        for (int i: res) {
            System.out.print(i + ", ");
        }
    }

    public int[] solution(int[] A, int K) {
        int[] result = new int[A.length];
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < A.length; j++) {
                if (j == 0) {
                    result[j] = A[A.length - 1];
                } else {
                    result[j] = A[j - 1];
                }
            }
            A = result;
            result = new int[A.length];
        }
        return A;
    }

}
