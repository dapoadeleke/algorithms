package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingAlgorithm {

    public static void main(String[] args) {
        int[] arr = new int[]{14, 33, 27, 35, 10};
        System.out.println("Bubble sort: " + Arrays.toString(bubbleSort(arr)));
    }

    /* Bubble Sort */
    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    /* Merge Sort */
    private static int[] mergeSort(int[] arr) {
        if (arr.length == 1)
            return arr;
        int mid = arr.length/2;
        int[] l1 = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] l2 = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(l1, l2);
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        return new int[]{};
    }





















}
