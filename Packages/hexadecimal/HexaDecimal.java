package hexadecimal;

/**
 * Hexadecimal Number System
 * Base 16
 * 
 * Decimal Number System
 * Base 10
 */

public class HexaDecimal {

    private final static String line = new String("\n" + "*".repeat(20) + "\n");

    public static void main(String[] args)  {
        int a = 0xf; // Hexadezimal F : Decimal 15
        System.out.println(a);
        System.out.println(Integer.toHexString(a).toUpperCase());

        System.out.println(line);
        
        // F + F
        System.out.println(a + a);
    }
}