import java.util.*;

public class Test {

    public static void main(String[] args) {
        String[] A = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] B = {"KFC", "Burger King", "Tapioca Express", "Shogun"};
        System.out.println(Arrays.toString(minIndex(A, B)));
    }

    static String[] minIndex(String[] list1, String[] list2) {
        List<String> output = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    output.add(list1[i]);
                }
            }
        }
        String[] result = output.toArray(new String[0]);
        Arrays.sort(result);
        return result;
    }

}
