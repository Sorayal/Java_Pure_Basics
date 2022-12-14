package arrays.syntactic;

public class SyntacticCheck {

    public static void main(String[] args) {
        byte[] d;
        d = new byte[] { 1, 2, 3, 4, 5 };
        byte[] given = new byte[] { 0 };

        // float[] = new float[10]; no variable identifier

        boolean[] versuch = { true, false, true, true };
        // versuch={true,false,true,true}; // Syntax wrong

        int[] a = new int[20];

        char[] c;
        c = new char[6];

        // int[] array = new byte[6]; int to byte is not possible
    }

}
