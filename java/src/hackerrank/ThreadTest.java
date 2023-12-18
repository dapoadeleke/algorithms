package hackerrank;


public class ThreadTest {

    private boolean satisfied = false;

    public void first() {
        satisfied = true;
        System.out.println("FIRST");
    }

    public void second() {
        System.out.println("SECOND");
    }

    public boolean isSatisfied() {
        return satisfied;
    }

    public static void main(final String[] args) {
        final ThreadTest b = new ThreadTest();
        (new Thread(new Runnable() {
            public void run() {
                while (!b.satisfied) {

                }
                b.second();
            }
        })).start();

        (new Thread(new Runnable() {
            public void run() {
                b.first();
            }
        })).start();
    }

}
