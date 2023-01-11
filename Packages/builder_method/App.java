package builder_method;

import builder_method.BuilderModel;

public class App {
	public static void main (String [] args) {
		BuilderModel model = new BuilderModel()
		.name("new Model")
		.description("This is a new model")
		.number(2)
		.isActive(true);
		
		System.out.println(model);
	}
}