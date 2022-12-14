package arrays.calculations;

public class Calculations {
    public static void main(String[] args) {
        int[] array = { 2, 5, 3, 9, 5, 1 };
        int result = 0;

        // number of elements in the array
        for (int element : array) {
            result++;
        }

        System.out.println(result); // 6

        // Biggest number in the array
        result = 0;
        for (int element : array) {
            if (element > result) {
                result = element;
            }
        }

        System.out.println(result); // 9

        // average result of the array
        result = 0;
        int h = 0;
        for (int element : array) {
            result = result + element;
            h++;
        }
        result = result / h;

        System.out.println(result); // 4
    }
}
