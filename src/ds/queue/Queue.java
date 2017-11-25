package ds.queue;

public class Queue {
	private int maxSize; // initialize the number of slots in the queue
	private long[] queueArray; //place to maintain the data
	private int front; // index position of the element in the front
	private int back; // index position of the element in the back
	private int nItems; // counter to maintain number of items in the queue
	
	public Queue (int size) {
		this.maxSize = size;
		this.queueArray = new long[size];
		front = 0;
		back = -1;
		nItems = 0;
		
	}
	
	public void insert(long j) {
		back++;
		queueArray[back] = j;
		nItems++;
	}
	
	public long remove() {
		long temp = queueArray[front];
		front++;
		if (front == maxSize) {
			front = 0;
		}
		nItems --;
		return temp;
		
	}
	public void view() {
		System.out.print("[");
		for (int i=0; i<queueArray.length; i++) {
			System.out.print(queueArray[i]+ " ");
		}
		System.out.print("]");
	}

}
