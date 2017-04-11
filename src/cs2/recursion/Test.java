package cs2.recursion;

/**
 * Created by jjenkins on 4/11/2017.
 */
public class Test {
    public static void main(String[] args) {
        xMethod(5);
    }
    public static void xMethod(int n) {
        if (n > 0) {
            xMethod(n - 1);
            System.out.print(n + " ");
        }
    }
}
