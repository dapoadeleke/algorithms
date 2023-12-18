package codility;

public class ContiguousArithmeticMean {

    public static void main(String[] args) {
        int[] A = {0, 4, 3, -1};
        int S = 2;
        ContiguousArithmeticMean cam = new ContiguousArithmeticMean();
        System.out.println("Result: " + cam.solution(A, S));
    }

    public int solution(int[] A, int S) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                double sum = 0; double deno = 0;
                for (int k = i; k <= j; k++) {
                    sum += A[k];
                    deno++;
                }
                if (sum / deno == S) {
                    count++;
                }
            }
        }
        return count;
    }

}
