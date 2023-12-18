package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortestVacation {

    public static void main(String[] args) {
        ShortestVacation sv = new ShortestVacation();
        int[] A = {7,5,2,7,2,7,4,7};
        System.out.println("Result: " + sv.solution(A));
    }

    int solution(int[] A) {
        int[] locations = this.getDistinctValuesFromArray(A);
        int shortestVacation = A.length;
        for (int i = 0; i < A.length; i++) {
            int distance = 0;
            int[] iLocation = locations;
            for (int k = i; k < A.length; k++) {
                distance++;
                if (this.isInArray(iLocation, A[k])) {
                    iLocation = this.removeElementFromArray(iLocation, A[k]);
                }
                if (iLocation.length == 0)
                    break;
            }
            if (distance <= shortestVacation && iLocation.length == 0) {
                shortestVacation = distance;
            }
        }
        return shortestVacation;
    }

    /* Get available locations */
    private int[] getDistinctValuesFromArray(int[] arr) {
        int[] A = new int[arr.length];
        for (int i = 0; i < A.length; i++) {
            A[i] = arr[i];
        }
        Arrays.sort(A);
        List<Integer> locations = new ArrayList<>();
        locations.add(A[0]);
        for (int i = 1; i < A.length; i++) {
            if (A[i] != locations.get(locations.size() - 1)) {
                locations.add(A[i]);
            }
        }
        int[] res = new int[locations.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = locations.get(i);
        }
        return res;
    }

    private int[] removeElementFromArray(int[] arr, int ele) {
        List<Integer> list = new ArrayList<>();
        for (int i: arr) {
            if (i != ele)
                list.add(i);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    private boolean isInArray(int[] arr, int ele) {
        for (int i: arr) {
            if (i == ele)
                return true;
        }
        return false;
    }

    private String printArr(int[] arr) {
        String out = "";
        for (int i: arr) {
            out += (i + ", ");
        }
        return out;
    }

}
