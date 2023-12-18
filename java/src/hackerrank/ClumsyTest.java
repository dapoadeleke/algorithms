package hackerrank;

public class ClumsyTest {

    private static final String FUBAR = "fubar";

    public boolean myMethod(final MyObject bar) {
        if (bar == null)
            return false;

        if (bar.getFoo() != null) {
            return bar.getFoo().equals(FUBAR);
        } else {
            return false;
        }
    }

    public interface MyObject {
        String getFoo();
        void setFoo(String o);
    }

}
