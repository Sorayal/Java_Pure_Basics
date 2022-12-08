package strings;

/**
 * Try to interpolate a string with angle brackets
 */

public class StringInterpolation {
    public static void main(String[] args) {
        String name = "Maru";
        // since JDK 15
        System.out.println("This is my %s".formatted(name));
        int age = 512;
        System.out.println("My name is %s and I am %d years young!".formatted(name, age));
    }
}