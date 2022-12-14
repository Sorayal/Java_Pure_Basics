package arrays.without_ten;

public class WithoutTen {
    public static int[] withoutTen(int[] given) {
        int[] result = new int[given.length];
        int indexFirstResult = -1;

        for (int i = 0; i < result.length; i++) {
            for (int j = indexFirstResult + 1; j < given.length; j++) {
                if (10 != given[j]) {
                    result[i] = given[j];
                    indexFirstResult = j;
                    break;
                }
            }
        }
        return result;
    }
}
