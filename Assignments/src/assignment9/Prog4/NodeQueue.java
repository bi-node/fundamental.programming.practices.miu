package  assignment9.Prog4;

import org.junit.runner.manipulation.NoTestsRemainException;

public class NodeQueue {
	//stores the element at the front of the queue, if it exists */
	private Node head;
	
	//stores the element at the end of the queue, if it exists */
	private Node tail;
	
	/**
	 * Inserts a new node containing s at end of queue
	 */
	public void enqueue(String s) {
		//implement
		Node n=new Node();
		n.data=s;
		if(isEmpty())
		{
			head=n;
			tail=n;
			return;
		}
		Node temp=head;
		while(temp!=tail)
		{
			temp=temp.next;
		}
		temp.next=n;
		tail=n;
		
	}	

	public String dequeue() throws QueueException {
		if(isEmpty()) throw new QueueException("Queue is empty!");
			String temp=head.data;
			if(head.next==tail )
			{
				head=tail;
			}
			
			head=head.next;
			return temp;
		
				
	}	
	/**
	 * Returns value stored at the front of the queue
	 * @return
	 * @throws QueueException
	 */
	public String peek() throws QueueException {
		if(isEmpty()) throw new QueueException("Queue is empty!");
		return null;
	}
	public boolean isEmpty() {
		return head == null;
	}
	@Override
	public String toString() {
		if(isEmpty()) return "<empty queue>";
		StringBuilder sb=new StringBuilder();
			Node temp=head;
			while(temp!=null)
			{
				sb.append(temp.data+ " ");
			}
			
			return sb.toString();

		
		
	}
}


