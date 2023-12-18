package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StorageOptimization {

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 5, 6, 8, 9, 10, 11};
//        for (int i: getLongestContiguous(arr))
//            System.out.print(i + ", ");
        int n = 3;
        int m = 2;
        List<Integer> h = new ArrayList<>();
        h.add(1);
        h.add(2);
        h.add(3);
        List<Integer> v = new ArrayList<>();
        v.add(1);
        v.add(2);
        System.out.println(storage(n, m, h, v));


    }

    public static long storage(int n, int m, List<Integer> h, List<Integer> v) {
        int[] hor = getLongestContiguous(listToArray(h));
        int[] ver = getLongestContiguous(listToArray(v));
        System.out.println(String.format("h.len: %d, v.len: %d", hor.length, ver.length));
        int count = 0;
        for (int i = 0; i <= hor.length; i++) {
            for (int j = 0; j <= ver.length; j++) {
                count++;
            }
        }
        return count;
    }

    static int[] getLongestContiguous(int[] arr) {
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer> l = new ArrayList<>();
            l.add(arr[i]);
            for (int j = (i+1); j < arr.length; j++) {
                if (arr[j] > arr[j-1]+1) {
                    break;
                } else {
                    l.add(arr[j]);
                }
            }
            if (l.size() > list.size()) {
                list = l;
            }
        }
        int[] out = new int[list.size()];

        return listToArray(list);
    }

    private static int[] listToArray(List<Integer> list) {
        int[] out = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            out[i] = list.get(i);
        return out;
    }


}
