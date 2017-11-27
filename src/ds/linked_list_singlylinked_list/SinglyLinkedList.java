package ds.linked_list_singlylinked_list;

public class SinglyLinkedList {
	private Node first;
	
	public SinglyLinkedList() {
		
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	public void insertFirst(int data) {
		//this method will take the data from the user and insert it at the start of the node
		Node newnode = new Node(); // we create a new instance of the node
		newnode.data = data; //assign the data entered by the user into the data field of the node that we created
		newnode.next = first;
		first = newnode;		
	}
	
	public void insertLast(int data) {
		Node current = first;
		while (current.next != null) {
			current = current.next;			
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first =first.next; 		
		return temp;		
	}
	
	public void display() {
		System.out.println("First --------> last");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
	}

}
