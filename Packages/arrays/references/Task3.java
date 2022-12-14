package arrays.references;

public class Task3 {
    public static void main(String[] args) {

        char[] eins = { 'a', 'b', 'c', 'd', 'e' };
        char[] zwei = { 'x', 'y', 'z' };

        zwei = eins;
        eins[2] = 'p';

        System.out.println(eins[2]); // p
        System.out.println(zwei[2]); // p
    }
}
