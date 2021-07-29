package codility;

import java.sql.SQLOutput;
import java.util.List;

public class ContactSearch {

    public static void main(String[] args) {
        String[] A = new String[]{"pim", "pom"};
        String[] B = new String[]{"999999999", "77788999"};
        String P = "88999";
        System.out.println(solution(A, B, P));
    }

    public static String solution(String[] A, String[] B, String P) {
        String result = null;
        for (int i = 0; i < A.length; i++) {
            if (isSubString(B[i], P)) {
                if (result == null) {
                    result = A[i];
                } else if (result.compareTo(A[i]) > 0) {
                    result = A[i];
                }
            }
        }
        return result == null ? "NO CONTACT" : result;
    }

    private static boolean isSubString(String word, String match) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < (i+1); j++) {
                for (int k = j; k <= word.length(); k++) {
                    if (match.equals(word.substring(j, k)))
                        return true;
                }
            }
        }
        return false;
    }

}
