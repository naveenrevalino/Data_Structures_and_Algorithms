package Prerequisite_OOP;
/**
 * Class Name: Human
 * What is a class : A class is a specification or a BluePrint.
 *  
 * @author Naveen Ravi
 *
 */
public class Human {
	
	
	public Human() {
		// This is the Constructor for the class HUMAN.
	}
	
	public void speak(String name, String eye_Color, String age) {
		
		System.out.println("My Name is :" +name);
		System.out.println("My Eye color is: " +eye_Color);
		System.out.println("My age is:" +age);
	}
	
	public void walk() {
		System.out.println("I am Walking...");
	}
	
	public void work() {
		System.out.println("I am Working...");
	}
	

}
