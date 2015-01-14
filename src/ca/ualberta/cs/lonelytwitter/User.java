package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public abstract class User extends Object
{
	protected String name;
	
	public String getName() {
		return name;
	}
	
	//abstract method
	public abstract void setName(String name) throws IOException;

	//constructor
	public User(String name) {
		super();
		this.name = name;
	}
	
	//constructor
	public User() {
		super();
		name = "anonymous";
	}
	
}
