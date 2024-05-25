import javax.sound.midi.Soundbank;

public class DoublyLinkedList {
	Node front, rear;
	int size=0;
	
	private class Node{
		int data;
		Node next;
		Node previous;
		Node(int data)
		{
			this.data=data;

		}
	}
		
		public void append(int val)
		{
			Node newNode=new Node(val);
			if(isEmpty()) {
				front=newNode;
				rear=newNode;

			}
			else {
			newNode.previous=rear;
			rear.next=newNode;
			rear=newNode;
			}
	
			size++;
				
		}
		
		public void remove()
		{
			if(isEmpty()) {System.out.println("Empty"); return;}
			//if(front.next==rear) {front=rear; }
			if(front==rear) {front =null; rear=null; }
			else {
			rear=rear.previous;
			rear.next=null;}
			size--;
		}
		
		public void insert(int val, int pos)
		{
			if(pos<0 || pos>size()) {System.out.println("Invalid Position"); return; }
			if (pos == 0) {
	            Node newNode = new Node(val);
	            newNode.next = front;
	            front.previous = newNode;
	            front = newNode;
	        }
			else {
				Node newNode=new Node(val);
				Node temp=front;
				for(int i=0; i<pos-1; i++)
				{
					temp=temp.next;
				}
				newNode.next=temp.next;
				newNode.previous=temp;
				temp.next.previous=newNode;
				temp.next=newNode;
				
				size++;
			}
			
		}
		
		public void display()
		{
			
			Node temp=front;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
				
		
			System.out.println("..........................................................");
		}
		
		private boolean isEmpty()
		{
			return size==0;
		}
		
		public int size()
		{
			return size;
		}

	
	public static void main(String[] args) {
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.append(56);
		dll.append(98);
		dll.append(77);
		dll.append(45);
		dll.display();
		dll.insert(5, 2);
		dll.display();
		dll.remove();
		dll.remove();
		dll.remove();
		dll.remove();
		dll.remove();
		dll.display();
	
		

		
	}

}
