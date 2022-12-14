package arrays.references;

public class Task1 {
    public static void main(String[] args) {

        char[] eins = { 'x', 'y', 'z' };
        char[] zwei = { 'a', 'b', 'c', 'd', 'e' };

        eins = zwei;

        System.out.println(eins[3]); // d
    }
}
