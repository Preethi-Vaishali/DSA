package Stack;

import java.util.Stack;

public class StringStack {

	public static void main(String[] args) {
	//To print the top element from the stack
		
		Stack<String> st = new Stack<>();
		//pushing elements into Stack
		st.push("Apple");
		st.push("Grapes");
		st.push("Mango");
		st.push("Orange");
		System.out.println("Stack: "+st);
		//access element from the top of the stack
		String fruits = st.peek();
		//prints stack
		System.out.println("Element at top: "+ fruits);

	}

}
