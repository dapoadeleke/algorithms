package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HCF {

    public static void main(String[] args) {
        int[] arr = new int[]{25, 10, 15, 600};
        System.out.println(String.format("Answer: %d", findHcf(arr.length, arr)));
    }

    public static int findHcf(int num, int[] arr) {
        int hcf = 1;
        Arrays.sort(arr);
        int min = arr[0];
//        System.out.println("Min: " + min);
        List<Integer> factors = new ArrayList<>();
        factors.add(min);
        for (int i = 1; i <= min/2; i++) {
            if (min%i == 0) {
                factors.add(i);
            }
        }
        for (int i = 0; i < factors.size(); i++) {
            boolean isDivisor = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]%factors.get(i) != 0) {
                    isDivisor = false;
                }
            }
            if (isDivisor && (factors.get(i) > hcf)) {
                hcf = factors.get(i);
            }
        }
        return hcf;
    }

}
