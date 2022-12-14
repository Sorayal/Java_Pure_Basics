package arrays.mid_three;

public class MidThree {

    public static int[] midThree(int[] given) {
        int[] result = new int[3];
        if (given.length < 3 || given.length % 2 == 0) {
            return result;
        }

        result[0] = given[given.length / 2 - 1];
        result[1] = given[given.length / 2];
        result[2] = given[given.length / 2 + 1];
        return result;
    }
}
