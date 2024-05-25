package LinkedList;

import java.nio.channels.NonWritableChannelException;

public class SingleLinkedList {
	private Node header = new Node();
	private int size = 0;

	private class Node {
		int data;
		Node next;
	}
	
	//insert node at giver position
	void insert(int val, int pos) {
		if(pos>size()) {System.out.println("Position not found"); return;}
		
		else{Node temp=header.next;
		for(int i=0; i<pos-1;i++)
		{
			temp=temp.next;
		}
		Node newNode=new Node();
		newNode.data=val;
		newNode.next=temp.next;
		temp.next=newNode;
		size++;
		}

	}
	//end of insert
	//find the value
	public boolean find(int val)
	{
		if(isEmpty()) {return false;}
		Node temp=header.next;
		while(temp.next!=null)
		{
			if(temp.data==val) return true;
			temp=temp.next;
		}
		return false;
	}

	// add node method at last
	public void add(int val) {
		Node n = new Node();
		n.data = val;
		if (header.next == null) {
			header.next = n;
		} else {
			Node temp = header.next;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;

		}
		size++;
	} // end of add

	// delete at end
	public void deleteAtLast() {
		if (isEmpty()) {
			System.out.println("List Empty");
			return;
		}
		else {
		Node temp = header.next;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		size--;
		}

	}
	// end of deleteat last
	//delete particular position
	public void deletePos(int i) {
	    if (isEmpty() || i >= size || i < 0)
	        return;

	    Node temp = header;
	    for (int j = 0; j < i; j++) {
	        temp = temp.next;
	    }

	    temp.next = temp.next.next;
	    size--;
	}
	//empty list
	boolean isEmpty() {
		return header.next == null;
	}
	
	//size
	public int size() {
		return size;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node temp = header.next;
		while (temp != null) {
			sb.append(temp.data + "->");
			temp = temp.next;
		}
		return sb.toString() + "null";
	}

	public static void main(String[] args) {
		SingleLinkedList sl = new SingleLinkedList();
		for (int i = 0; i <=80; i +=  10) {
			sl.add(i);
		}
		
		System.out.println(sl.toString());
		System.out.println(sl.size());
		sl.deletePos(0);
		System.out.println(sl.toString());
		System.out.println(sl.size());
		

	}

}
