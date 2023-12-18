package codility;

public class UndirectedGraph {

    public static void main(String[] args) {
        UndirectedGraph ug = new UndirectedGraph();
        int[] A = {1,3};
        int[] B = {2,2};
        int N = 3;

        System.out.println("Result: " + ug.solution(N, A, B));
    }


    public boolean solution(int N, int[] A, int[] B) {
        for (int i = 1; i < N; i++) {
            if (!this.isExistInArray(i, (i+1), A, B)) {
                return false;
            }
        }
        return true;
    }

    private boolean isExistInArray(int n1, int n2, int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if ((arr1[i] == n1 && arr2[i] == n2) || (arr1[i] == n2 && arr2[i] == n1))
                return true;
        }
        return false;
    }

}
