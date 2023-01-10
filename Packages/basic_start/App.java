package basic_start;

public class App {
	/**
	* Extended main method with optional modifiers
	* 
	* Modifier:
	* public : mandatory, access modifier, open accessable to every method in the program
	* static : mandatory, this method is a class method (not an instance method)
	* final : optional, this means the method can´t be overwritten by subclasses
	* void : mandatory, return value of the method, void means there is no return value here
	* final for parameter : optional, this means that the given parameter can´t be overwritten or
	* modified within the method. Usually you don´t modify the input, you create a new instance or value
	* to return it. In other words don´t use parameters as output for methods. It can cause a lot 
	* confusion.
	* 
	*/
	public static final void main(final String[] args) {
		
	}
	
	/* 
	// Minimum main method declaration, however you could skip also the parameter args
	public static void main (String [] args) {
		
	}
	*/
}