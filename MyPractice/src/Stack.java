
public class Stack {
	private Node top;

	private class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public void push(int x) {
		Node newNode = new Node(x);
		if (isEmpty()) {
			top = newNode;
		} else {
			newNode.next=top;
			top=newNode;
		}
	}
	
	public void pop()
	{
		if(isEmpty()) return;
		if(top.next==null) { top=null; return;}
		top=top.next;
	}
	
	public void peek()
	{
		if(!isEmpty()) System.out.println(top.data);
	}

	private boolean isEmpty() {
		return top == null;
	}

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(3);
		s.push(6);
		s.push(4);
		s.peek();
		s.pop();
		s.peek();
		s.pop();
		s.peek();
		s.pop();
		s.peek();
		
	}

}
