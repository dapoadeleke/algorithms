package codility;

import java.util.Arrays;

public class StringCompression {

    public static void main(String[] args) {
        System.out.println(solution("ABBBCCDDCCC", 3));
    }

    static int solution(String S, int K) {
        String[] outs = getPossibleStrings(S, K);
        int[] counters = new int[outs.length];
        for (int i = 0; i < outs.length; i++) {
            counters[i] = compress(outs[i]).length();
        }
        Arrays.sort(counters);
        return counters[0];
    }

    static String[] getPossibleStrings(String S, int K) {
        String[] letters = S.split("");
        String[] output = new String[(letters.length - K)+1];
        for (int i = 0; i <= letters.length - K; i++) {
            String out = "";
            for (int j = 0; j < letters.length; j++) {
                if (j >= i && j < (K+i)) {
                    continue;
                } else {
                    out += letters[j];
                }
            }
            output[i] = out;
        }
        return output;
    }


    static String compress(String str) {
        String output = "";
        String[] letters = str.split("");
        String[] values = new String[letters.length];
        int[] counters = new int[letters.length];
        int valuesCounter = 0;
        values[valuesCounter] = letters[0];
        counters[valuesCounter] = 1;
        for (int i = 1; i < letters.length; i++) {
            if (letters[i].equals(values[valuesCounter])) {
                counters[valuesCounter]++;
            } else {
                valuesCounter++;
                values[valuesCounter] = letters[i];
                counters[valuesCounter] = 1;
            }
        }
        for (int i = 0; i < values.length; i++) {
            if (values[i] == null) {
                break;
            }
            output += ((counters[i] > 1) ? counters[i] : "") + values[i];
        }
        return output;
    }

}
