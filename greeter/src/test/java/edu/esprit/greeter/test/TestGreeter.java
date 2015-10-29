package edu.esprit.greeter.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import edu.esprit.greeter.Greeter;



public class TestGreeter {
//5 condition a satisfaire lorsqu'on fait un test unitaire
	//FIRST ( Fast , Independent , Repeatable , Self Checking , Timely )
	
	Greeter gr;
	
	@Before
	public void setUp(){
		 gr = new Greeter();
		
	}

	 @Test
		public void itShouldSayHello() {
			
			String result = gr.SayHello("worlds");
			Assert.assertEquals("Hello world", result);
			
			
		}
	 
	 @Test(expected = IllegalArgumentException.class)
	 public void itShouldRaiseExeption() {
			
			String result = "MAN";
			gr.SayHello(result);
			
			
		}
	 
	 @After
	 
	 public void tearDown(){
		 
		gr = null; 
		 
	 }
	 
	
	
}
