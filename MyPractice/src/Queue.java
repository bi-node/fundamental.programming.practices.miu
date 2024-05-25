

public class Queue {
	Node front, rear;
	
	private class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}
	
	
	public void enqueue(int val)
	{
		Node newNode=new Node(val);
		if(isEmpty())
		{
			front=newNode;
			rear=newNode;
			return;
		}
		Node temp=front;
		while(temp!=rear) {
			temp=temp.next;
		}
		temp.next=newNode;
		rear=newNode;
		
	}
	
	public void dequeue()
	{
		if(isEmpty()) return;
		else if(front.next==rear) {
			front=rear;
		}
		else {
			front=front.next;
		}
	}
	private boolean isEmpty()
	{
		return front==null && rear==null;
	}
	
	public void display()
	{
		Node temp=front;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	

	
	public static void main(String[] args) {
		Queue q=new Queue();
		q.enqueue(45);
		q.enqueue(89);
		q.enqueue(9);
		//q.display();
		q.dequeue();
		//q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		
		
		
	}

}
