package Collection;

import java.util.*;

public class LinkRemoveEX {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		//ADding elements to the Linked list
		list.add("Steve");
		list.add("Cral");
		list.add("Raj");
		list.add("Negan");
		list.add("Rick");
		
		//Removing first element 
		//same as list.remove(0);
		
		list.removeFirst();
		//removing last element
		list.removeLast();
		list.remove(2);
		
		Iterator<String> iter= list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
