package arrays.without_ten;

public class WithoutTenApp {
    public static void main(String[] args) {
        // int[] given = { 10, 9, 10, 5, 3, 2 }; // 9 5 3 2 0 0
        // int[] given = { 1, 9, 12, 5 }; // 1 9 12 5
        // int[] given = { 10, 10, 12, 5 }; // 12 5 0 0
        // int[] given = { 12, 5, 10, 10, 10 }; // 12 5 0 0 0
        // int[] given = { 10, 10, 10, 10, 9 }; // 9 0 0 0 0
        // int[] given = { 10, 10, -1, 10, 10 }; // -1 0 0 0 0
        // int[] given = { 1, 10, 10, 2 }; // 1 2 0 0
        int[] given = new int[0]; // nothing

        int[] result = WithoutTen.withoutTen(given);

        for (int number : result) {
            System.out.print(number + " ");
        }
    }
}
