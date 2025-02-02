package LinkedList;

public class SinglyQueueList {
	Node front, rear;

	private class Node {
		int data;
		Node next;
	}

	public void add(int val) {
		Node n = new Node();
		n.data = val;
		if (isEmpty()) {
			front = n;
			rear = n;
		} else {

			rear.next = n;
			rear = n;
		}

	}

	public boolean isEmpty() {
		return front == null;
	}
	
	public String dequeue()
	{
		if(isEmpty()) return null;
		return null;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("front->");
		Node temp = front;
		while (temp != null) {
			sb.append(temp.data + "->");
			temp = temp.next;
		}
		return sb.toString() + "rear";

	}

	public static void main(String[] args) {
		SinglyQueueList sql = new SinglyQueueList();
		sql.add(45);
		sql.add(33);
		sql.add(77);
		sql.add(78);
		System.out.println(sql.toString());

	}

}
