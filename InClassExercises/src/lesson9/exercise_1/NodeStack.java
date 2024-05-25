package lesson9.exercise_1;
@SuppressWarnings("unused")
public class NodeStack {
	private Node top;
	
	public void push(String s) {
		Node n=new Node();
		n.data=s;
				n.next=top;
				top=n;
		
		//implement
	}
	public String peek() {
		return null;
	}
	public String pop() {
		if(top==null) {
			return null;;
		}
		else{
			top=top.next;
			return top.data;
		}
		
	
	}
}

/*public static void main(String[] args) {
		NodeStack stack = new NodeStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack.peek());
		System.out.println(stack.top.toString());
		System.out.println(stack.pop());
		System.out.println(stack.top.toString());
		
	}*/
