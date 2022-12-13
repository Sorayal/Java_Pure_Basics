package input;

import java.util.Scanner;

public class SafeInput {

    private static Scanner scanner = new Scanner(System.in);

    public static Scanner getScanner() {
        return scanner;
    }

    public static void main(String[] args) {

        System.out.println("Please enter a whole number:");

        int num = 0;
        do {
            try {
                num = scanner.nextInt();
                break;
            } catch (NumberFormatException e) {
                System.err.println("You didn´t entered a number. Try again!");
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        } while (true);

        System.out.println(num);
    }

}
