package builder_method;

/**
* This is an example model for the builder pattern
*/
public class BuilderModel {
	String name;
	String description;
	int number;
	boolean isActive;
	
	/* This is called an instance initializer which appears when the instance is created.
		In Java, an instance initializer is a block of code that is executed when an instance of 
		a class is created. An instance initializer is defined using curly braces {} and is not 
		preceded by any access modifiers or the keyword "static." It can be used to initialize 
		instance variables and perform any other actions that must be performed before an object 
		can be used. Instance initializers are executed before the constructor method of a 
		class is called.
	*/
	{
		System.out.println("fields initialized");
	}
	
	public BuilderModel name(String name) {
		this.name = name;
		return this;
	}
	
	public BuilderModel description(String description) {
		this.description = description;
		return this;
	}
	
	public BuilderModel number(int number) {
		this.number = number;
		return this;
	}
	
	public BuilderModel isActive(boolean isActive) {
		this.isActive = isActive;
		return this;
	}
	
	@Override
	public String toString() {
		return this.name + " " +
		this.description + " " +
		this.number + " " +
		this.isActive;
	}
}