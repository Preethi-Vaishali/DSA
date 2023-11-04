package Stack;

import java.util.Iterator;
import java.util.Stack;

public class Stack_Iterate {

	@SuppressWarnings("rawtypes")
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

		Iterator ite = st.iterator();
		while(ite.hasNext()) {
			Object val = ite.next();
			System.out.println(val);
		}

	}

}
