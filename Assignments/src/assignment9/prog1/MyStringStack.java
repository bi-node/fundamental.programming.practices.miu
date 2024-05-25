package assignment9.prog1;


import assignment9.prog1.MyStringLinkedList.Node;

public class MyStringStack {
	private MyStringLinkedList list;
	public MyStringStack() {
		list = new MyStringLinkedList();
	}
	
	public String pop() {
		//implement
		if(list.header.next==null) return null;
		else {
			Node temp=list.header.next;
			String st=temp.value;
			list.header.next=temp.next;
			
			if(temp.next!=null)
				temp.next.previous=list.header;
			return st;
			
		}
		
	}
	public String peek() {
		//implement
		if(list.header.next==null) return null;
		else {
			
			String st=list.header.next.value;
		
			return st;
			
		}
	}
	
	public void push(String s) {
		Node n=list.new Node();
		n.value=s;
		if(list.header.next==null)
		{
			list.header.next=n;
			n.previous=list.header;
		}
		else {
			n.next=list.header.next;
			
			n.previous=list.header;
			list.header.next.previous=n;
		
			list.header.next=n;
			
			
		}
		
		
		
		
		
		//implement
	}
	
	public static void main(String[] args) {
		MyStringStack stack = new MyStringStack();
		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");
		System.out.println("Popping…"+stack.pop());
		System.out.println("Peeking…."+stack.peek());
		System.out.println("Popping…"+stack.pop());
		
	}
}
