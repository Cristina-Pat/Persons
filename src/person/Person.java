package person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
	
	private String name;
	private String age;
	
	public Person() {
		this.name = "Unknown";
		this.age = "0";
	}
	
	public void consoleOut() {
		System.out.println(this.name + " - " + this.age);
	}
	
	public void readConsoleIn() throws IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
	     	
	    System.out.println("Please insert the peson's name:");
	 
	    //Reading data using readLine
	    this.name = reader.readLine();
	    
	    System.out.println("Please insert the person's age:");
		 
	    //Reading data using readLine
	    this.age = reader.readLine();

	}
}
