package FinalTerm3;

public class MyStack {
    private Node top;

    private class Node {
        Integer data;
        Node next;

        public Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
     return top==null;
     
    }

    public void push(Integer val) {
    	Node n=new Node(val);
    	if(isEmpty())
    	{
    		top=n;
    	}
    	else {
    	n.next=top;
    	top=n;
    	}
        
    }

//    public Integer peek() {
//      
//    }

    public Integer pop() {
    	if(isEmpty()) return null;
    	else {
			Integer topValue=top.data;
			top=top.next;
			return topValue;
			
		}
    
    }
    public void display()
    {
    	Node temp=top;
    	while(temp!=null)
    	{
    		System.out.println(temp.data);
    		temp=temp.next;
    	}
    }
    public static void main(String[] args) {
		MyStack ms=new MyStack();
		ms.push(45);
		ms.push(43);
		ms.push(5);
		ms.push(21);
		ms.push(88);
		ms.display();
		ms.pop();
		ms.display();
		
	}
}
