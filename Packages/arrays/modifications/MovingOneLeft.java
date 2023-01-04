package arrays.modifications;

public class MovingOneLeft {
    public static void main(String[] args) {
        int[] array = { 5, 1, 3, 4, 3 };
        int h = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = h;

        for (int number : array) {
            System.out.print(number + " "); // 1 3 4 3 5
        }
    }
}
