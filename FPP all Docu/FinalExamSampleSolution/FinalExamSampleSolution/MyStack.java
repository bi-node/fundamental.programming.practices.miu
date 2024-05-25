package prog;

public class MyStack {
	private class Node {
		Integer data;
		Node next;
	}

	private Node top;

	public boolean isEmpty() {
		return top == null;
	}

	public void push(Integer s) {
		Node newTop = new Node();
		newTop.data = s;
		newTop.next = top;
		top = newTop;
	}

	public Integer peek() {
		if (top != null) {
			return top.data;
		} else {
			throw new IllegalArgumentException("no element");
		}
	}

	public Integer pop() {
		if (top != null) {
			Integer s = peek();
			top = top.next;
			return s;

		} else {
			throw new IllegalArgumentException("no element");
		}
	}

	public void printStack() {
		if (top == null)
			System.out.println("Empty stack");
		else 			
			System.out.println("printing stack elements: "+printStack(top));
	}

	public String printStack(Node n) {
		if (n == null) return "";
		return n.data + " " + printStack(n.next);
	}

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(5);
		stack.push(7);
		stack.push(8);
		System.out.println("peeking: "+stack.peek());
		stack.printStack();
		System.out.println("popping: "+stack.pop());
		stack.printStack();
		stack.push(9);
		stack.push(11);
		stack.printStack();
	}
}
