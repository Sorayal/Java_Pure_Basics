package arrays;

public class CreateArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 2;
        }

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}