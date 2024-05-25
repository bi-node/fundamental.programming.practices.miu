package assignment9.Prog3;

import java.awt.Font;
import java.util.Arrays;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	//private int size = 0;
	private int front = -1;
	private int rear = 0;
	//enqueue
	public void enqueue(int n)
	{
		if(rear>arr.length-1) 
			{resize();
			arr[rear++]=n;				//if rear reach the end of the array resize
			}
		else{
			arr[rear++]=n;
			if(front==-1) front++;
		}
	}
	
	//dequeue
	public void dequeue() {
		if(size()==0) System.out.println("Empty queue");
		else {
			front++;
		}
		
	}
	
	//tostring
	public void displayQueue()
	{
		if(isEmpty()) System.out.println("Empty Queue");
		else {
			System.out.println("**************Queue**************");
			for(int i=front; i<rear;i++)
				System.out.print(arr[i]);
		}
		System.out.println("\n");
	}
	
	//isEmpty
	public boolean isEmpty() {
		return size()==0;
	}
	
	//size;
	
	public int size()
	{
		return rear-front;
	}
	
	//resize
	
	public void resize()
	{
		//resize by double
		System.out.println("Resizing...................\n");
		int len=arr.length;
		int[] temp=new int[2*len];
		System.arraycopy(arr, 0, temp, 0, size());
		arr=temp;
		
	}
	
	//peek
	public int peek() {
		if(isEmpty()) throw new IllegalStateException("Cannot peek because Queue is empty!");
		else {
			return arr[front];
		}
	}
	
	
	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
	
		
		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
		for(int i = 0; i < 14; i ++)
			q.dequeue();
		System.out.println(q.size());
System.out.println(q.peek());
	}
}

