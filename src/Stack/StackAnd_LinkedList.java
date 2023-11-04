package Stack;

import java.util.NoSuchElementException;
import java.util.Scanner;


	class Node{
		protected int data;
		protected Node link;
		//constructor
		public Node() {
			link = null;
			data =0;
		}
		//constructor
		public Node(int d, Node n) {
			data = d;
			link =n;
		}
		//Function to set link to next node
		public void setLink(Node n) {
			link =n;	
		}
		//function to set data to current node
		
		public void setData(int d) {
			data = d;
		}
		
		//function to get link to next node
		public Node getLink() {
			return link;
		}
		//Function to get data from current node
		public int getData() {
			return data;
			}
	}
		//class linkedSTack
		class linkedStack{
			protected Node top;
			protected int size;
			
			//constructor
			public linkedStack() {
				top = null;
				size =0;
			}
			//function to check if stack is empty
			public boolean isEmpty() {
				return top == null;
			}
			//function to get size of the stack
			public int getSize() {
				return size;
			}
			//function to push an element to the stack
			public void push(int data) {
				Node ntr = new Node(data, null);
				if(top == null)
					top = ntr;
				else {
					ntr.setLink(top);
					top = ntr;
				}
				size++;
			}
			//function to pop an element from the stack
			public int pop() {
				if(isEmpty())
					throw new NoSuchElementException("Underflow Exception");
				Node ptr = top;
				top = ptr.getLink();
				size--;
				return ptr.getData();
			}
			//function to check the top element of the stack
			public int peek() {
				if(isEmpty())
					throw new NoSuchElementException("Underflow Exception");
				return top.getData();
			}
			//function to display the status of the stack
			public void display() {
				System.out.print("\nStack= ");
				if(size ==0) {
					System.out.print("Empty\n");
					return;
				}
				Node ptr = top;
				while(ptr != null) {
					System.out.print(ptr.getData()+" ");
					ptr = ptr.getLink();
				}
			}
public class StackAnd_LinkedList {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		linkedStack ls = new linkedStack();
		System.out.println("Linked Stack Test\n");
		char ch;
		do
		{
			System.out.println("\nLinked Stack Operations");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. size");  
            int choice = s.nextInt();            
            switch (choice) {
            
            }
            System.out.println("\nDo you want to continue (Type y or n) \n");	
    		ch= s.next().charAt(0);
 		}while(ch=='Y'|| ch=='y');
	}

}
}
