import static org.junit.Assert.assertNotNull;

import org.hamcrest.core.Is;

public class SingleLinkedList {
	private Node head;

	private class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
		}
	}

	public void addAtLast(String val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}

	}

	public void addFirst(String val) {
		if (isEmpty())
			addAtLast(val);
		else {
			Node newNode = new Node(val);
			newNode.next = head;
			head = newNode;
		}
	}

	public void removeAtLast() {
		if (isEmpty())
			return;
		else {
			Node temp = head;
			if (temp.next == null)
				head = null;
			else {
				while (temp.next.next != null) {
					temp = temp.next;
				}
				temp.next = null;
			}
		}
	}
	
	public void removeAtFirst()
	{
		if(isEmpty()) return;
		if(head.next==null) {head=null; return;}
		head=head.next;
	
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		sll.addAtLast("aa");
		sll.addAtLast("ab");
		sll.addAtLast("ac");
		sll.addAtLast("ad");
		sll.addFirst("xx");

//		sll.removeAtLast();
//		sll.removeAtLast();
//		sll.removeAtLast();
//		sll.removeAtLast();
//		sll.removeAtLast();
		sll.removeAtFirst();
		sll.removeAtFirst();
		sll.removeAtFirst();
		sll.removeAtFirst();
		sll.removeAtFirst();

		sll.display();

	}

}
