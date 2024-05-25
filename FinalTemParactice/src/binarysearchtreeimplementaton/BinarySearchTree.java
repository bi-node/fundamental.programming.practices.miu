package binarysearchtreeimplementaton;

import java.nio.channels.NonWritableChannelException;

public class BinarySearchTree {
	
	Node root;
	Node left, right;
	int size;
	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
	
		root=new Node();
		left=new Node();
		right=new Node();
		size=0;
	}
	
	public void add(int val)
	{
		Node n=new Node(val);
		if(root==null)
		{
			root=n;
			
		}
		else {
			Node temp=root;
			if(val>root.data)
			{

				root.nextright=n;
			}
			else {
				root.nextleft=n;
			}
		}
		
	}
	
	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.add(3);
		
	}

}
