package ds.linked_list_doublylinked_list;

public class DoublLinkedList {
	private Node first;
	private Node last;
	
	public DoublLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (isEmpty()) {
			last = newNode;
		}
		else {
			first.previous = newNode;
		}
	}
	
	
	

}
