package Collection;
import java.util.*;
public class LinkedlistEx {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		//ADding elements to the Linked list
		list.add("Steve");
		list.add("Cral");
		list.add("Raj");
		
		//Adding an element to the first position
		list.addFirst("Negan");
		
		//Adding an element to the last position
		list.addLast("Rick");
		
		//Adding an element to the 3rd position
		
	list.add(2,"Glenn");
	
	//Iterating LinkedList
	Iterator<String> iter= list.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}

	}

}
