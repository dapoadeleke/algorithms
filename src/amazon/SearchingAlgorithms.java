package amazon;

import java.util.Arrays;

public class SearchingAlgorithms {

    public static void main(String[] args) {
        int[] numbers = {0, 2, 5, 6, 9, 11, 19};
        int k = 11;
//        System.out.println("Linear search: " + linearSearch(numbers, k));
        System.out.println("Binary search: " + binarySearch(numbers, k));
//        System.out.println(Arrays.toString(getSliceFromArray(numbers, 4, 7)));
    }

    private static int linearSearch(int[] numbers, int k) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == k)
                return i;
        }
        return -1;
    }

    private static int binarySearch(int[] numbers, int k) {

        return -1;
    }

    private static int[] getSliceFromArray(int[] arr, int low, int high) {
        int[] out = new int[high - low];
        int index = 0;
        for (int i = low; i < high; i++) {
            out[index] = arr[i];
            index++;
        }
        return out;
    }

}
