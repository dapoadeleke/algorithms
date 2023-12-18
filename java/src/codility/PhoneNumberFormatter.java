package codility;

public class PhoneNumberFormatter {

    public static void main(String[] args) {
        PhoneNumberFormatter pnf = new PhoneNumberFormatter();
        String phoneNo = "00-44    48  5555  8361";
        System.out.println("Result: " + pnf.solution(phoneNo));
    }

    public String solution(String S) {
        String out = "";
        /* Replace space and dashes */
        S = S.replace(" ", "").replace("-", "");
        while (S.length() > 0) {
            if (S.length() >= 3) {
                if (S.length() == 4) {
                    out += this.removeFirstNChars(S, 2) + "-";
                    S = S.substring(2);
                } else {
                    out += this.removeFirstNChars(S, 3) + "-";
                    S = S.substring(3);
                }
            } else {
                out += S;
                S = "";
            }
        }
        if ((out.charAt(out.length()-1)+"").equals("-")) {
            out = out.substring(0, out.length()-1);
        }

        return out;
    }

    private String removeFirstNChars(String S, int N) {
        String out = "";
        String newS = "";
        if (S.length() < N) {
            return "";
        }
        for (int i = 0; i < S.length(); i++) {
            if (i < N) {
                out += S.charAt(i);
            } else {
                newS += S.charAt(i);
            }
        }
        return out;
    }

}
