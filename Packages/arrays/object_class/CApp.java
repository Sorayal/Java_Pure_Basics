package arrays.object_class;

public class CApp {
    public static void main(String[] args) {
        C[] array = new C[5];
        array[0] = new C(1);
        array[1] = new C(2);
        array[0].methC(1);
        array[1].methC(3);

        for (int i = 0; i < array.length; i++) {
            System.out.print("\n" + i + " : ");
            if (array[i] != null) {
                System.out.print(array[i].getZahl());
                System.out.print(array[i].getWort());
            }
        }
    }
}
