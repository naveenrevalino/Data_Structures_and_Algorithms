package ds.reverse_string;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("naveen"));
	}
	public static String reverseString (String str) {
		int stackSize = str.length();
		Stack myStack = new Stack(stackSize);
		for (int i=0; i<stackSize; i++) {
			char ch = str.charAt(i);
			myStack.push(ch);
		}
		String result = "";
		while (!myStack.isEmpty()) {
			char ch = myStack.pop();
			result = result + ch;
			
		}
		return result;
		
	}

}
