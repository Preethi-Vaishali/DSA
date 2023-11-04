package Linked_List;



public class Linkedlist_Example {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data =d;
			next = null;
		}
	}
	
	//Insert at the beginning
	public void insertAtBeginning(int new_data) {
		//insert the data
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	//Insert after a node
	public void insertAfter(Node prev_node, int new_data) {
		if(prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	
	//Insert at the end
	public void insertAtEnd(int new_data) {
		Node new_node = new Node(new_data);
		if(head==null) {
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		Node last = head;
		while(last.next != null)
			last = last.next;
		last.next = new_node;
		return;
	}
	//Delete a node
	
	void deleteNode(int position) {
		if(head == null) 
			return;
			Node temp = head;
			if(position ==0) {
				head = temp.next;
				return;
			}
			
			//Find the key to be deleted
			for(int i=0; temp != null && i<position -1; i++)
				temp = temp.next;
			//If the key is not present
			if(temp == null || temp.next == null)
				return;
			//Remove the node
			Node node1 = temp.next.next;
			temp.next = node1;
	}
	//Search a node
	
	boolean search(Node head, int key){
		Node curr = head;
		while(curr != null) {
			if(curr.data == key) 
				return true;
			curr = curr.next;
			
		}
		return false;
	}
	//Sort the linked list
	void sortLinkedList(Node head) {
		Node curr = head;
		Node index = null;
		int temp;
		if(head == null) {
			return;
		}
		else {
			while (curr != null) {
				//index points to the node next to current
				index = curr.next;
				while(index != null) {
					if(curr.data > index.data) {
						temp = curr.data;
						curr.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				curr = curr.next;

			}
		}
	
 }
	// Print the linked list
	public void printList() {
		Node tnode = head;
		while(tnode != null) {
			System.out.print(tnode.data+" ");
			tnode = tnode.next;
		}
	}
	
	public static void main(String[] args) {
		Linkedlist_Example llist = new Linkedlist_Example();
		llist.insertAtEnd(1);
		llist.insertAtBeginning(2);
		llist.insertAtBeginning(3);
		llist.insertAtEnd(4);
		llist.insertAfter(llist.head.next, 5);
		System.out.println("Linked List: ");
		llist.printList();
		System.out.println("\nAfter deleting an element: ");
		llist.deleteNode(3);
		llist.printList();
		System.out.println();
		int item_to_find = 10 ;
		if(llist.search(llist.head, item_to_find))
			System.out.print(item_to_find+" is found ");
		else
			System.out.print(item_to_find+" is not found ");
		llist.sortLinkedList(llist.head);
		System.out.print("\nSorted List: ");
		llist.printList();
	}

}
