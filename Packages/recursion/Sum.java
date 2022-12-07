package recursion;

/**
 * Simple recursion adding one to a given sum.
 */
public class Sum {
    public static void main(String[] args) {

        // Starting out intially with sum
        System.out.println(addOne(0, 100));
    }

    private static int addOne(int sum, int limit) {
        // The condition to break out of the recursion loop
        // otherwise it will run endless till stackoverflow
        if(limit == 0){
            return sum;
        }

        // Decrease
        limit--;
        sum += 1;
        return addOne( sum, limit);
    }
}