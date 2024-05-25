package assignment8_2;


public class MyStringLinkedList {
	Node header;
	int size;

	MyStringLinkedList() {
		header = new Node(null);
		size=0;
	}
	

	/******* sorting methods ********/
	public void minSort() {
		// implement
		if (header.next==null)
			return;
		int len = size();
		for (int i = 0; i < len; i++) {
			int nextMinpos = minpos(i, len - 1);
			swap(i, nextMinpos);
		}

	}

	void swap(int i, int j) {
		// implement
		String temp = strArray[i];
		strArray[i] = strArray[j];
		strArray[j] = temp;

	}

	// find minimum of arr between the indices bottom and top
	public int minpos(int bottom, int top) {
		// implement
		int min = bottom;
		String minVal = strArray[bottom];
		for (int i = bottom + 1; i <= top; ++i) {
			if (minVal.compareTo(strArray[i]) > 0) {
				minVal = strArray[i];
				// System.out.println(strArray[i]);
				min = i;
			}
		}

		return min;
	}

	/********* end sorting methods ********/

	
	

	// inserts a new Node containing data so that its
	// position in the list is now pos
	void insert(String data, int pos) {
		int size = 0;
		Node temp = header;
		while (temp.next != null) {
			size++;
			temp = temp.next;
		}
		if (pos > size)
			return;
		else {
			temp = header;
			int index = 0;
			while (index < pos) {
				temp = temp.next;
				index++;
			}
			Node n = new Node(data);
			n.next = temp.next;
			temp.next = n;
			temp.next.previous = n;
			n.previous = temp;

		}

	}

	// attempts to remove the first Node that contains
	// data; if successful, returns true; otherwise, false.
	boolean remove(String data) {
		boolean valuefound = false;
		Node temp = header;
		if (header.next == null)
			return false;
		else {
			
			while (temp.next != null) {
				if (temp.value==data) {

					valuefound = true;
					break;
				}
				temp = temp.next;
			}
		}
		if (valuefound) {
			temp.previous.next=temp.next;
			temp.next.previous=temp.previous;
			return true;
			

		} else {
			return false;
		}

	}

	// adds to the front of the list
	public void addFirst(String item) {
		Node n = new Node(item);

		// place new node after header and
		// establish links from new node to
		// surrounding nodes
		n.next = header.next;
		n.previous = header;

		// establish links from surrounding
		// nodes to the new node
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;
	}

	// adds to the end of the list
	public void addLast(String item) {
		Node n = new Node(item);
		// find last node
		Node last = header;
		while (last.next != null) {
			last = last.next;
		}
		// now last.next == null
		last.next = n;
		n.previous = last;
	}

	// removes node in last position
	public void removeLast() {
		// if list is empty, return
		if (header.next == null)
			return;

		Node current = header;
		// traverse the list until current.next is
		// null - then remove current
		while (current.next != null) {
			current = current.next;
		}
		// now current.next == null, so remove current
		Node previous = current.previous;
		// previous is not null since current is not header
		previous.next = null;
		current.previous = null;
	}

	// determines whether the input string is in the list
	public boolean search(String s) {
		Node next = header.next;
		while (next != null && !next.value.equals(s)) {
			next = next.next;
		}
		// either next == null or next.value is s
		if (next == null)
			return false;
		else {// next.value.equals(s)
			return true;
		}
	}

	public String toString() {
		var sb = new StringBuffer();
		Node next = header.next;
		while (next != null) {
			sb.append(next.toString() + ", ");
			next = next.next;
		}
		var result = sb.toString().trim();
		if (result.length() == 0)
			return "<empty list>";
		if (result.charAt(result.length() - 1) == ',') {
			return result.substring(0, result.length() - 1);
		}
		return result;
	}

	class Node {
		String value;
		Node next;
		Node previous;

		Node(String value) {
			this.value = value;
		}

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		var list = new MyStringLinkedList();
		list.addLast("Rich");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.addFirst("Bob");
		list.addFirst("Harry");
		list.addFirst("Steve");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		System.out.println(list.search("Harry"));
		System.out.println(list.search("Bob"));
		list.addLast("Tom");
		System.out.println(list);
		list.insert("Jefferoy", 2);
		System.out.println(list);
		list.remove("Harry");
		System.out.println(list);
		
	}
}
