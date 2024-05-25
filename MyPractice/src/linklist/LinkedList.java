package linklist;

//Node 
class Node {
	int data;
	Node next;
	Node head = null;

//add method
	public void add(int x) {
		Node n = new Node();
		n.data = x;
		if (isEmpty()) {

			head = n;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
			n.next = null;
		}

	}
	// end of add method

	// start of dpublic void display() {
		
	void display() {
	Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	

	// start of insert At first
	public void insertAtfirst(int data) {
		Node n = new Node();
		n.data = data;
		if (isEmpty()) {
			head = n;

		} else {
			{
				n.next = head;
				head = n;
			}
		}
	}

//insert in position
	void insert(int data, int pos) {
		if (pos > size() || size() < 0)
			System.out.println("No position found");
		else {
			Node n = new Node();
			n.data = data;
			Node temp = head;
			if (pos == 0) {
				head = n;
			} else {
				for (int i = 1; i < pos; i++) {
					temp = temp.next;
				}

				n.next = temp.next;
				temp.next = n;
			}

		}

	}

	// delete at last
	void deleteAtLast() {
		if (isEmpty())
			System.out.println("Linked List Empty");
		else {
			Node temp = head;
			for (int i = 1; i < size() - 1; i++) {
				temp = temp.next;
			}
			temp.next = null;

		}
	}

	// delete at first
	void deleteAtFirst() {
		if (isEmpty())
			System.out.println("Linked List Empty");
		else {
			Node temp = head;
			temp = temp.next;
			head = temp;
		}
	}

	// search operation
	boolean find(int x) {
		if (isEmpty())
			return false;
		else {
			Node temp = head;
			while (temp != null) {
				if (temp.data == x)
					return true;
				temp = temp.next;
			}

			return false;
		}
	}

	// Empty linked list search
	boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	int size() {

		Node temp = head;
		int counter = 0;
		while (temp != null) {
			temp = temp.next;
			counter++;
		}
		return counter;

	}
}

//Linked List class
public class LinkedList {

	public static void main(String[] args) {
		Node node = new Node();
		node.add(34);
		node.insertAtfirst(22);
		node.add(67);
		node.add(43);
		node.insertAtfirst(2);
		node.insert(3, 3);
		node.deleteAtLast();
		node.display();
		System.out.println("After Delete at first");
		node.deleteAtFirst();
		node.display();
		System.out.println(node.find(3));

	}
}