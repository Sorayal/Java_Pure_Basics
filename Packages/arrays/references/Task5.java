package arrays.references;

public class Task5 {
    public static void main(String[] args) {

        char[] eins = { 'a', 'b', 'c', 'd', 'e' };
        char[] zwei = { 'a', 'b', 'c', 'd', 'e' };

        eins = zwei;

        System.out.println(eins.equals(zwei)); // true

    }
}
