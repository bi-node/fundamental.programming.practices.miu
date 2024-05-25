package linklist;

import org.junit.validator.PublicClassValidator;

public class IntegerLinkedList {
	Node head;
	int size=0;
	
	class Node{
		private Integer data;
		Node next;
		
	}
	public void addLast(Integer data)
	{
		Node n=new Node();
		n.data=data;
		if(head==null)
		{
			head=n;
		}
		else {
			{
				Node temp=head;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=n;
			}
		}
		size++;
	}
	
	void remove(int pos)
	{
		if(pos>size) System.out.println("Can't find postion");;
		if(head==null) System.out.println("Empty");
		else {
			Node temp=head;
			for(int i=0; i<pos-1;i++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
			size--;
		}
		
	}
	
	public void diplay()
	{
		if(head==null) System.out.println("Empty ");
		dres(head);
		
	}
	
	private Node dres(Node temp)
	{
		if(temp==null) return null;
		else {
			System.out.println(temp.data);
			return dres(temp.next);	
		}
	}
	public static void main(String[] args) {
		IntegerLinkedList ill=new IntegerLinkedList();
		ill.addLast(50);
		ill.addLast(40);
		ill.addLast(56);
		ill.addLast(23);
		ill.remove(1);
		ill.diplay();
	}

}
