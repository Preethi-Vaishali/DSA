package Stack;

import java.util.ListIterator;
import java.util.Stack;

public class ListIterator_Stack {

	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		//pushing elements into Stack
		System.out.println(st.isEmpty());// to find whether stack is empty
		st.push("Mac Book");
		st.push("HP");
		st.push("Dell");
		st.push("Asus");
		st.push("Linux");
		System.out.println("Stack: "+st);
		//Stack reverse
		ListIterator<String> li= st.listIterator(st.size());
		System.out.println("\nIteration over the stack from top to bottom:");
		while(li.hasPrevious()) {
			String rev = li.previous();
			System.out.println(rev);
		}

	}

}
