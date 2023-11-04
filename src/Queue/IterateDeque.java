package Queue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class IterateDeque {

	public static void main(String[] args) {
		ArrayDeque<String> ani = new ArrayDeque<>();
		ani.add("Dog");
		ani.add("Cat");
		ani.add("Cow");
		ani.add("Horse");
		ani.add("Lion");
		ani.add("Zebra");
		ani.add("Elephant");
		System.out.println("ArrayDeque: ");
		Iterator<String> ite = ani.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next());
			System.out.print(", ");
		}
		
		System.out.println("\nArrayDeque in reverse order:");
		//using descending iterator()
		Iterator<String> desIte = ani.descendingIterator();
		while(desIte.hasNext()) {
			System.out.print(desIte.next());
			System.out.print(", ");
		}

	}

}
