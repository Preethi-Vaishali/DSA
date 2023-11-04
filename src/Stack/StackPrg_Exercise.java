package Stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackPrg_Exercise {
	static void reversePrint(Stack<Integer>s) {
		if(s.isEmpty())
			return;
		int x = s.peek();
		s.pop();
		System.out.print(x+" ");
		reversePrint(s);
		s.push(x);
	}

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(24);
		st.push(5);
		st.push(11);
		st.push(36);
		st.push(65);
		
		System.out.println("Stack Elements: "+ st);
		System.out.println("Popped Element: "+ st.pop());
		System.out.println("Stack Elements: "+ st);
		
		Iterator<Integer>ite = st.iterator();
		System.out.println("\nIteration forward:");
		System.out.print("[ ");
		while(ite.hasNext()) {
			
			System.out.print(ite.next());
			System.out.print(" ");
			
		}
		System.out.print("]");
				
		ListIterator<Integer> li= st.listIterator(st.size());
		System.out.println("\nIteration reverse:");
		System.out.print("[ ");
		while(li.hasPrevious()) {	
			System.out.print(li.previous());
			System.out.print(" ");
		}
		System.out.print("]");
		System.out.println();
		System.out.println("\nStack Elements in reverse:");
		reversePrint(st);
	}

}
