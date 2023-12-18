package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ParkingDilemma {

    public static void main(String[] args) {
        long[] nums = {2, 10, 8, 17};
        List<Long> scores = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int k = 3;
        System.out.println(carParkingRoof(scores, k));
    }



    public static long carParkingRoof(List<Long> cars, int k) {
        Collections.sort(cars);
        List<Long> lengths = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            if ((i + (k-1)) < cars.size()) {
                long len = (cars.get((i + (k - 1))) - cars.get(i)) + 1;
                lengths.add(len);
            }
        }
        Collections.sort(lengths);
        return lengths.get(0);
    }

}
