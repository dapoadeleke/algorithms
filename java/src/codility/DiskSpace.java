package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DiskSpace {

    public static void main(String[] args) {
        Integer[] numbers = {2, 5, 4, 6, 8};
        List<Integer> scores = Arrays.asList(numbers);
        int x = 3;
        System.out.println(segment(x, scores));
    }

    public static int segment(int x, List<Integer> space) {
        List<Integer> minValues = new ArrayList<>();
        for (int i = 0; i < space.size(); i++) {
            if ((i+x) < space.size()) {
                List<Integer> list = new ArrayList<>();
                for (int j = i; j < (i + x); j++) {
                    list.add(space.get(j));
                }
                Collections.sort(list);
                minValues.add(list.get(0));
            }
        }
        Collections.sort(minValues, Collections.reverseOrder());
        return minValues.get(0);
    }

}
