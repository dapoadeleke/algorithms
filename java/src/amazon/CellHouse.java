package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CellHouse {

    public static void main(String[] args) {
        int[] states = new int[]{1, 0, 0, 1, 1, 0, 1, 1};
        int days = 2;
        System.out.println("Result: ");
        for (int i: cellCompete(states, days))
            System.out.print(i + ", ");
    }

    public static List<Integer> cellCompete(int[] states, int days) {
        List<Integer> list = new ArrayList<>();
        int[] temp = new int[states.length];

        int left = 0, right = 0, current = 0;
        for (int d = 0; d < days; d++) {
            for (int i = 0; i < states.length; i++) {
                current = states[i];
                if (i > 0) {
                    left = states[i - 1];
                } else {
                    left = 0;
                }
                if (i < states.length - 1) {
                    right = states[i + 1];
                } else {
                    right = 0;
                }

                if (left == right) {
                    temp[i] = 0;
                } else {
                    temp[i] = 1;
                }
            }
            for (int i = 0; i < temp.length; i++)
                states[i] = temp[i];
        }
        for (int i: states)
            list.add(i);
        return list;
    }

}
