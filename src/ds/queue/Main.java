package ds.queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue myQueue = new Queue(3);
		myQueue.insert(10);
		myQueue.insert(22);
		myQueue.insert(55);
		myQueue.view();
		long num = myQueue.remove();
		System.out.println(num);
		

	}

}
