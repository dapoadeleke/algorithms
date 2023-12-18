import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dialer {

    public static void main(String[] args) {
        Dialer d = new Dialer();
        String[] A = {"pim", "pom"};
        String[] B = {"999999999", "777888999"};
        System.out.println(d.solution(A, B, "88999"));
    }

    public static String solution ( String [] A, String[] B, String P){

        //HashMap<String, String> phoneBook = new HashMap<>();
        if(P.equals("")) return "NO CONTACT";

        List<String> names = new ArrayList<String>();
        for (int a = 0; a < B.length; a++ )
            if (B[a].contains(P))
                names.add(A[a]);

        if( names.size() < 1) return "NO CONTACT";

        String[] tmp = names.toArray(new String[0]);
        Arrays.sort(tmp);

        return tmp[0];
    }

}
