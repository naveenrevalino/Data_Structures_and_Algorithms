package ds.stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack myStack = new Stack(6);
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.push(5);
		while (!myStack.isEmpty()) {
			long value = myStack.pop();
			System.out.println(value);
		}
	}
}