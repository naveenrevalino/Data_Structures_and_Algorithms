package ds.linked_list;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node nodea = new Node();
		nodea.data = 1;
		Node nodeb = new Node();
		nodeb.data = 2;
		Node nodec = new Node();
		nodec.data = 3;
		Node noded = new Node();
		noded.data = 4;
		
		nodea.next = nodeb;
		nodeb.next = nodec;
		nodec.next = noded;
		System.out.println(length(nodec));
	}
	
	public static int length(Node aNode) {
		int length =0;
		Node currentNode = aNode;
		while (currentNode !=null) {
			length++;
			currentNode = currentNode.next;
		}
		return length;
		
	}

}
