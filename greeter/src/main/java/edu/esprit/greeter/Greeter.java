package edu.esprit.greeter;

public class Greeter {

	public String SayHello(String name){
		/**
		 * 
		 * sayHello method 
		 * 
		 * 
		 * 
		 */
		if(name.equals("MAN"))
			throw new IllegalArgumentException();
		
		return "Hello " + name;
		
		
	}
		
	public String var ;
	}
	