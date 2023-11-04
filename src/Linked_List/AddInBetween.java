package Linked_List;
import Linked_List.AddInBetween.Node;
public class AddInBetween {
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
		void addBetween(int pos, int data){// pos=20, data =78
				Node newNode = new Node(data);
				Node curr = head;
				if (head==null) {
					head = newNode;
					tail = newNode;
					
				}
				else {
					while(curr.data!=pos) {
						curr = curr.next;
					}	
					newNode.next = curr.next;
					curr.next = newNode;
				
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
			AddInBetween sll = new AddInBetween();
			sll.addNode(10);
			sll.addNode(5);
			sll.addNode(20);
			sll.addLast(-300);
			sll.display();
			
			sll.addFirst(100);
			sll.addLast(200);
			sll.addNode(500);
			sll.display();
			sll.addBetween(20,78);
			sll.display();
		}

	}


