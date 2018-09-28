public class HackerRank {

    public static int divide(int a, int b) {
        int c = -1;

        try {
            c = a/b;
        }
        catch (Exception e) {
            System.err.print("Exception ");

        } finally {
            System.err.println("Finally ");
        }
        System.out.println(c);
        return c;
    }

    public static void lel() {
        int x = 0;
        for (x=1; x<4; x++) {
            System.out.println("x=%d\n" + x);
        }
    }

    public static void main(String[] args) {
        divide(4,0);
        lel();
    }
}
