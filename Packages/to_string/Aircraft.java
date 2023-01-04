package to_string;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Aircraft {
	
	private String type;
	private String name;
	private int maxSpeed;
	
	
	public Aircraft(){
		// Constructor Chaining between parametrized constructor and parameterless constructor
		this("", "unnamed", 0);
		
		/*
		this.type = "";
		this.name = "unnamed";
		this.maxSpeed = 0;
		*/
	}
	
	public Aircraft(String type, String name, int maxSpeed){
		this.type = type;
		this.name = name;
		if(maxSpeed < 0) {
			throw new IllegalArgumentException();
		} else {
			this.maxSpeed = maxSpeed;
		}
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	/**
	* Using toString and adds more informations using Reflection with helper API
	* ToStringBuilder
	* @see https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/builder/ToStringBuilder.html 
	*/
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}