package Linked_List;

import Linked_List.SinglyLinkedList.Node;

public class SingleLinkedList {
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
		  tail.next = newNode; 
		  tail = newNode; 
	  }
}
void addBeginning(int data) {
	Node newNode = new Node(data);
	if(head == null) {
		head = newNode;
		tail = newNode;
	
}
 else {
	 newNode.next = head;
	 head = newNode;
	 }
}
void addNodelast(int data) {
	Node newNode = new Node(data);
	if(head == null) {
		head = newNode;
		tail = newNode;	
	}else {
		tail.next = newNode;
		tail = newNode;
	}
}

void deleteNodeFront() {
	if(head == null) {
		System.out.println("Linked list is empty");
		return;
	}
	else {
		if(head!= tail) {
			head =head.next;		
		}
		else {
			head = tail = null;
		}
	}	
}
void deleteNodeBack() {
	if(head == null) {
		System.out.println("Linked list is empty");
		return;
		}
	else {
		if(head!= tail) {
			Node curr = head;
			while(curr.next != tail) {
				curr = curr.next;
			}
			tail = curr;
			tail.next =null;
			
		}
		else {
			head = tail = null;
		}
	}	
}
public void insertInBetween(int position, int data) {
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        return;
    }
    
    Node current = head;
    int count = 1;
    
    while (count < position - 1 && current.next != null) {
        current = current.next;
        count++;
    }
    
    newNode.next = current.next;
    current.next = newNode;
}
public void deleteElement(int data) {
	Node temp = head;
	if(head == null)
		System.out.println("Linked list is empty");
	else {
		if(temp.data == data) {
			temp = temp.next;
			head = temp;
		}
		else {
			while(temp.next.data != data) {
				temp = temp.next;
			}
			if(temp.next == null)
				System.out.println("Element is not present in the list");
			else {
				temp.next = temp.next.next;
			}
		}
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
		SingleLinkedList sl = new SingleLinkedList();
		sl.addNode(2);
		sl.addNode(4);
		sl.addBeginning(6);
		sl.addNodelast(10);
		sl.addNode(12);
		sl.display();
		sl.deleteNodeBack();
		sl.display();
		sl.deleteNodeFront();
		sl.display();
		sl.insertInBetween(3, 24);
		sl.display();
		sl.deleteElement(10);
		sl.display();
	}

}
