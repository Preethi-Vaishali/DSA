package Queue;
import java.util.*;
public class DequePrgPractice {

	public static void main(String[] args) {
		Deque<String> ele = new ArrayDeque<>();
		
		ele.add("one");
		ele.add("two");
		ele.add("three");
		ele.add("four");
		ele.add("five");
		System.out.println("Elements: "+ ele);
		ele.addFirst("red");
		ele.addLast("blue");
		System.out.println("Elements: "+ ele);
		
		System.out.println("Peek Element: "+ele.peek());
		System.out.println("Remove Element: "+ ele.remove());
		System.out.println("Remove Element: "+ ele.removeLast());
		System.out.println("Elements: "+ ele);
		ele.remove("three");
		System.out.println("Elements: "+ ele);
		
		Iterator<String> desIte = ele.descendingIterator();
		System.out.print("Reverse Element: [ ");
		while(desIte.hasNext()) {
			System.out.print(desIte.next());
			System.out.print(" ");
		}
		System.out.print("]");
		
		

	}

}
