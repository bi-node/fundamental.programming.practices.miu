package linklist;

public class DoubleLinkedList {
	Node head;
	Node tail;
	int size;

	class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}
	}

	void add(int val) {
		Node n = new Node(val);
		if (isEmpty()) {
			head = n;
		} else {
			tail.next = n;
			n.prev = tail;
		}
		tail = n;
		size++;

	}

	void addAtFirst(int val) {
		if(isEmpty()) add(val);
		else {
			Node n=new Node(val);
			n.next=head;
			head.prev=n;
			head=n;
			size++;
		}

	}
	void pop() {
		 if (isEmpty())
	            return;
	        tail = tail.prev;
	        if (tail != null)
	            tail.next = null;
	        else
	            head = null;
	        size--;
		
	}
	
	void pull()
	{
		if(isEmpty()) return;
		else {
			
			head=head.next;
			head.prev=null;
			size--;
			
		}
	}

	void insert(int val, int pos) {
		if (pos > size())
			return;
		if (pos == size() || isEmpty())
			add(val);
		else {
			Node n = new Node(val);
			Node temp = head;
			for (int i = 0; i < pos - 1; i++) {

				temp = temp.next;

			}
			n.next = temp.next;
			temp.next = n;
			
			n.next.prev = n;
			n.prev = temp;
			size++;

		}

	}

	void display() {
		if (isEmpty())
			System.out.println("Empty List");
		else {
			Node temp = head;
			System.out.print("The Doubly Linked List\n [ ");

			for (int i = 0; i < size(); i++) {
				System.out.print(temp.data+"<-->");
				temp = temp.next;
			}
			System.out.print("null]");

			/*
			 * while(temp!=null) { System.out.println(temp.data); temp=temp.next; }
			 */
		}

	}

	boolean isEmpty() {
		return size == 0;
	}

	int size() {
		return size;
	}

	public static void main(String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.add(20);
		dll.add(30);
		dll.add(40);
		dll.add(10);
		dll.insert(80, 2);
		dll.addAtFirst(2);
		dll.addAtFirst(65);
		dll.display();
		dll.pop();
		System.out.println("\nAfter Pop");
		dll.display();
		System.out.println("\nAfter pull");
		dll.pull();
		dll.display();

	}
}
