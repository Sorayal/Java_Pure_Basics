package arrays.two_dim;

public class TwoDim {
    public static void main(String[] args) {
        String[][] alpha = new String[3][3];
        alpha[0][0] = "obenlinks  ";
        alpha[0][1] = "    oben   ";
        alpha[0][2] = " obenrechts";
        alpha[1][0] = "links      ";
        alpha[1][1] = "   mitte   ";
        alpha[1][2] = "     rechts";
        alpha[2][0] = "untenlinks ";
        alpha[2][1] = "   unten   ";
        alpha[2][2] = "untenrechts";

        for (int i = 0; i < alpha[0].length; i++) {
            for (int j = 0; j < alpha.length; j++) {
                System.out.print(alpha[i][j] + " ");
            }
            System.out.println();
        }
    }
}
