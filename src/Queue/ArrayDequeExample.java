package Queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		ArrayDeque<String> ani = new ArrayDeque<>();
		ani.add("Dog");
		ani.add("Cat");
		ani.add("Cow");
		ani.add("Horse");
		ani.add("Lion");
		ani.add("Zebra");
		ani.add("Elephant");
		System.out.println("ArrayDeque: "+ani);
		
		//using Remove() method
		String ele = ani.remove();
		System.out.println("Removed Element: "+ ele);
		
		System.out.println("New ArrayDeque: "+ ani);

		//Using remove(element)
		System.out.println("Removed Sepcific Element: "+ ani.remove("Cow"));
		System.out.println("New ArrayDeque: "+ ani);
		
		//using removeFirst()
		String firstElement = ani.removeFirst();
		System.out.println("Removed element: "+ firstElement);
		
		//using removeLast()
				String lastElement = ani.removeLast();
				System.out.println("Removed element: "+ lastElement);
				
				System.out.println("New ArrayDeque: "+ ani);
				
				ani.clear();
				System.out.println("New ArrayDeque: "+ ani);
		
	}

}
