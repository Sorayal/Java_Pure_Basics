package arrays.mid_three;

public class MidApp {
    public static void main(String[] args) {
        int[] given = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] result = MidThree.midThree(given);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }
}
