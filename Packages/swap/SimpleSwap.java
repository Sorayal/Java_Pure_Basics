package swap;

/**
 * Swapping numbers without third variable.
 */
public class SimpleSwap {
    public static void main(String[] args) {
        int a = 2;
        int b = 11;

        System.out.println("Variable a contains: " + a);
        System.out.println("Variable b contains: " + b);

        a = a + b;
        // variable a contains the values of a and b now

        // You want only the initial value of a from the former operation a + b
        // subtract b from that to get the initial value of a
        b = a - b;

        // the last step is to get the value of initial b, a is still a + b
        // subtract the new value of b (which was initial a before) to get the initial value of b
        a = a - b;

        System.out.println("Variable a contains: " + a);
        System.out.println("Variable b contains: " + b);
    }
}
