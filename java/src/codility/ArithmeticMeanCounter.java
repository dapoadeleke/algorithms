package codility;

public class ArithmeticMeanCounter {

    public static void main(String[] args) {
        int[] A = {2,1,3};
        int S = 2;

        System.out.println(solution(A, S));
    }


    static int solution(int[] A, int S) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            System.out.println(i);
            for (int j = i; j < A.length; j++) {
                for (int k = j; k < j+1; k++) {
                    System.out.print(k + ", ");
                }
            }
            System.out.println();
        }

        return 0;
    }

}
