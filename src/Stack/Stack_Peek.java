package Stack;

import java.util.Stack;

public class Stack_Peek {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		System.out.println(st.peek());

	}

}
