package arrays.modifications;

public class ModifyArrayContent {
    public static void main(String[] args) {
        int[] array = { 5, 1, 3, 4, 3 };
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i] + 1; // addiere Inhalt um 1
        }

        for (int number : array) {
            System.out.print(number + " "); // 6 2 4 5 3
        }
    }
}
