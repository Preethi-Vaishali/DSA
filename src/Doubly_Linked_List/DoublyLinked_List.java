package Doubly_Linked_List;

public class DoublyLinked_List {
	class Node{
		// stores data
		public int data;
		
		//pointer to the next node
		public Node next = null;
		
		//pointer to the previous node
		public Node prev = null;
		public Node(int data) {
			this.data = data;
		}
	}
	//To represent the head of a doubly linked list
	Node head = null;
	
	//To represent the tail of a doubly linked list
	Node tail = null;
	public void addNodeFront(int val) {
		Node temp = new Node(val);
		if(head != null) {
			head.prev = temp;
			temp.next = head;
		}
		head = temp;
		if(tail == null) 
			tail = temp;
			//System.out.print("Data inserted: " +val);
			//System.out.print("Head node"+ head.data);	
		}
		
		public void addNodeBack(int val) {
			Node temp = new Node(val);
			if(tail != null) {
				tail.next = temp;
				temp.prev = tail;
			}
			tail = temp;
			if(head == null) {
				head = temp;
			}
			System.out.println("New node added at the End: "+val);
		}
		
		public void iterateForward() {
			Node temp = head;
			while(temp!= null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
			
		}
		
		public void removeNodeFront() {
			Node temp = head;
			head = head.next;
			head.prev = null;
			System.out.println("Deleted: "+temp.data);
			//return temp.data;
		}
		
		public void removeNodeBack() {
			Node temp = tail;
			tail = tail.prev;
			tail.next = null;
			System.out.println("Deleted: "+temp.data);
			//return temp.data;
		}
		
		public void iterateBackward() {
			Node temp = tail;
			while(temp!= null) {
				System.out.println(temp.data);
				temp=temp.prev;
			}
			
		}

	public static void main(String[] args) {
		DoublyLinked_List dl = new DoublyLinked_List();
		dl.addNodeFront(2);
		dl.addNodeFront(100);
		dl.addNodeBack(1200);
		dl.addNodeBack(2000);
		dl.addNodeBack(500);
		System.out.println("Doubly Linked list Before remove: ");
		dl.iterateForward();
		dl.removeNodeFront();
		System.out.println("Doubly Linked list After remove Front: ");
		dl.iterateForward();
		dl.removeNodeBack();
		System.out.println("Doubly Linked list After remove Back: ");
		dl.iterateForward();
		System.out.println("Iterate Backward: ");
		dl.iterateBackward();
	}

}
