package packages;

import java.util.Random;


public class NumberPicker {
	public static final void main(String[] args) {
		// Pseudo Random Generator
		Random random = new Random();
		// creates a number between 0 and 9
		System.out.println(random.nextInt(10));
	}
}