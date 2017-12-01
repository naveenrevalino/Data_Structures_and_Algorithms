package ds.linked_list_doublylinked_list;

public class Node {
	public int data;
	public Node next;
	public Node previous;
	
	public Node() {
		this.next = null;
		this.previous = null;
	}
	
	public void displayNode () {
		System.out.println("{ " +data+ " }" );
	}
	

}
