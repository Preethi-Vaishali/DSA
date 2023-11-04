package Linked_List;

public class SinglyLinkedList {
	class Node{
		  int data;
		  Node next;
		  public Node(int data) {
			  this.data = data;
			  this.next = null;
		  }
	}
		  public Node head = null;
		  public Node tail = null;
		public void addNode(int data) {
			  Node newNode = new Node(data);
			  if(head == null) {
				  head = newNode;
				  tail = newNode;
				 }
			  else {
				  tail.next = newNode; //connecting to the newNode
				  tail = newNode; //moving the tail
			  }
		  }
		void addFirst(int data) {
			Node newNode = new Node(data);
			if (head==null) {
				head = newNode;
				tail = newNode;
				
			}
			else {
				newNode.next = head;
				head = newNode;
			}
		}
		void addLast(int data) {
			Node newNode = new Node(data);
			//Node curr = head;
			if (head==null) {
				head = newNode;
				tail = newNode;
				
			}
			else {/*
				while(curr.next!=null) {
					curr = curr.next;
				}
			curr.next = newNode; 
			*/
				tail.next = newNode;
				tail = newNode;
			  }
		}
		
		public void display() {
			Node curr = head;
			if(head==null) {
				System.out.println("Linked list is empty");
			}
			else {
				System.out.println("Singly linked list elements are: ");
				while(curr!=null) {
					System.out.print(curr.data+" ");
					curr = curr.next;
					System.out.println();
				}
			}

		}
 
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.addNode(10);
		sll.addNode(5);
		sll.addNode(20);
		sll.addLast(-300);
		sll.display();
		
		sll.addFirst(100);
		sll.addLast(200);
		sll.addNode(500);
		sll.display();
	}

}
