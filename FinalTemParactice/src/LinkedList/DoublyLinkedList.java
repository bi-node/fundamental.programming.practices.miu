package LinkedList;

public class DoublyLinkedList {
	private Node front;
	private Node rear;
	private int size;

	public DoublyLinkedList() {
		// TODO Auto-generated constructor stub
		front = new Node();
		rear = new Node();
		size = 0;
		front.next = rear;
		rear.previous = front;
	}

	private class Node {
		String data;
		Node next;
		Node previous;
	}

	// adding at last
	void addAtLast(String s) {
		Node n = new Node();
		n.data = s;
		Node lastNode = rear.previous;

		lastNode.next = n;
		n.previous = lastNode;
		n.next = rear;
		rear.previous = n;
		size++;

	}// end of add

	// insert in position
	public void insert(String s, int pos) {
		if (pos > size() || pos < 0) {
			System.out.println("Invalid position");
		} else if (pos == 0)
			addAtFirst(s);
		else if (pos == size())
			addAtLast(s);
		else {
			Node temp = front.next;
			Node n = new Node();
			n.data = s;
			for (int i = 0; i < pos; i++) {
				temp = temp.next;
			}
			n.next = temp.next;
			temp.next.previous = n;
			n.previous = temp;
			temp.next = n;
			size++;
		}
	}

	// add at first
	public void addAtFirst(String s) {
		Node n = new Node();
		n.data = s;
		if (front.next == rear) {
			n.next = rear;
			rear.previous = n;
		} else {
			n.next = front.next;
			front.next.previous = n;
		}
		n.previous = front;
		front.next = n;

		size++;
	}

	// delete at last
	public void deleteAtLast() {
		if (isEmpty() || size == 0)
			return;
		else if (size == 1) {
			front.next = rear;
			rear.previous = front;
			size--;
		} else {
			Node temp = front.next;
			while (temp.next != rear) {
				temp = temp.next;
			}
			rear.previous = temp.previous;
			temp.previous.next = rear;
			size--;

		}
	}

	// deleteatFIrst
	public void deleteAtFirst() {
		if (isEmpty() || size == 0)
			return;
		else if (size == 1) {
			front.next = rear;
			rear.previous = front;
			size--;
		} else {
			front.next = front.next.next;
			front.next.next.previous = front;
			size--;

		}

	}

	// delete on position
	public void deleteOnPosition(int x) {
		if (size() == 0 || x >= size())
			System.out.println("Invalid Postion");
		else if (x == 0)
			deleteAtFirst();
		else if (x == size() - 1)
			deleteAtLast();
		else {
			Node temp = front;
			for (int i = 0; i < x; i++) {
				temp = temp.next;
			}
			temp.next.previous = temp.previous;
			temp.previous.next = temp.next;
			size--;

		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (size == 0)
			return null;
		else {

			sb.append("The <<Doubly Linked LIst>>>\n Front↹");

			Node n = front.next;
			while (n != rear) {
				sb.append(n.data).append("↹");
				n = n.next;
			}
			sb.append("Rear");
			return sb.toString();

		}

	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return front.next == rear;
	}

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addAtLast("a");
		dll.addAtLast("b");
//		dll.addAtLast("c");
//		dll.addAtLast("d");
//		dll.addAtLast("e");
		dll.deleteOnPosition(2);
		System.out.println(dll.toString());
		dll.deleteOnPosition(1);
		System.out.println(dll.toString());
		dll.deleteOnPosition(0);
		System.out.println(dll.toString());

	}
}
