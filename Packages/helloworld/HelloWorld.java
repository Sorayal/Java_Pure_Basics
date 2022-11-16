package helloworld;

// import Packages.Fields; nicht notwendig

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello Universe");
		Fields f = new Fields();
		System.out.println(f.getName());
		System.out.println("Ende");
	}
}