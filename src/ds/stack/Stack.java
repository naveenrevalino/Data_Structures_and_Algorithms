package ds.stack;
/**
 * 
 * @author Naveen Ravi
 * Class Name: Stack
 * @arraySize  = the size of the array
 * @stackArray = the actual array that will be created
 * @top = is the pointer we are going to use to traverse through the stack/array.
 */
public class Stack {
	
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new long[maxSize];
		this.top = -1;
	}
	
	public void push(int num) {
		if (isFull()) {
			System.out.println("This stack is already full");
		}
		else {
			top++;
			stackArray[top] = num;
		}
	}
	
	public long pop() {
		if(isEmpty()) {
			System.out.println("This stack is empty...");
			return -1;
		}
		
		else {
		int old_top = top;
		top--;	
		return stackArray[old_top];
		}
	}
	
	public boolean isFull() {
		return (maxSize-1 == top);
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
}
