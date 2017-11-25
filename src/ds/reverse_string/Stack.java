package ds.reverse_string;

public class Stack {
	
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new char[maxSize];
		this.top = -1;
	}
	
	public void push(char var) {
		if (isFull()) {
			System.out.println("This stack is already full");
		}
		else {
			top++;
			stackArray[top] = var;
		}
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("This stack is empty...");
			return '0';
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

