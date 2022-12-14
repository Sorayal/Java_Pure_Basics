package arrays.references;

public class Task2 {
    public static void main(String[] args) {

        int[] eins = new int[5];
        int[] zwei = { '1', '2', '3', '4', '5' };

        zwei = eins;

        System.out.println(zwei[1]); // 0
    }
}
