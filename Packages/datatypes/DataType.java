package datatypes;

/**
 * Primitive datatypes
 */
public class DataType {

    private final static String line = new String("\n" + "*".repeat(20) + "\n");

    public static void main(String[] args) {
        System.out.println("Maximum von Byte");
        System.out.println(Byte.MAX_VALUE);
        System.out.println("Minimum von Byte");
        System.out.println(Byte.MIN_VALUE);
        System.out.println(line);

        System.out.println("Maximum von Short");
        System.out.println(Short.MAX_VALUE);
        System.out.println("Minimum von Short");
        System.out.println(Short.MIN_VALUE);
        System.out.println(line);

        System.out.println("Maximum von Integer");
        System.out.println(Integer.MAX_VALUE);
        System.out.println("Minimum von Integer");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(line);

        System.out.println("Maximum von Long");
        System.out.println(Long.MAX_VALUE);
        System.out.println("Minimum von Long");
        System.out.println(Long.MIN_VALUE);
        System.out.println(line);

        System.out.println("Maximum von Float");
        System.out.println(Float.MAX_VALUE);
        System.out.println("Minimum von Float");
        System.out.println(Float.MIN_VALUE);
        System.out.println(line);

        System.out.println("Maximum von Double");
        System.out.println(Double.MAX_VALUE);
        System.out.println("Minimum von Double");
        System.out.println(Double.MIN_VALUE);
        System.out.println(line);

        System.out.println("Char as Character");
        System.out.println("Boolean as true or false");

    }
}