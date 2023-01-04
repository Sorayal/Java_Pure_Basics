package arrays.no_triple;

public class NoTriples {
    public static boolean noTriples(int[] given) {
        boolean result = true;
        for (int i = 0; i < given.length - 2; i++) {
            if (given[i] == given[i + 1] && given[i] == given[i + 2]) {
                return false;
            }
        }
        return result;
    }
}
