package learning_datastructrues.abstract_data_types;
/**
 * Class Name: Counter
 * Abstract Data Type: Mean's, it will give you and implementation
 * it will only tell you what operations are to be performed, but will not tell you how those operations are performed.
 * 
 * Here in this class we have a counter class which will increment the counter, give you the current value of the counter and also 
 * print it in a string format for the one who calls these method in this class.
 * The value of the counter is initialized to ZERO, and every time someone call's this method the value is incremented.
 * And the value is returned.
 * @author Naveen Ravi
 *
 */
public class Counter {
	private String name = null;
	private int value = 0;
	// initialize the value to ZERO
	
	public Counter(String str) {
		this.name=str;
		// assign the name passed in the constructor to the variable "name"
		
	}
	public void increment() {
		value++;
		// the value is incremented here
	}
	
	public int getCurrentValue() {
		return value;
		// the incremented value is returned in integer type
	}
	
	public String toString() {
		return name+ ":" +value;
		// the name and the current value is returned in String type.
	}

}
