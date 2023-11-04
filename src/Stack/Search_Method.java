package Stack;

import java.util.Iterator;
import java.util.Stack;

public class Search_Method {

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
		//search an element
		int loc= st.search("HP");// prints value from top 
		System.out.println(st.search("test"));
		System.out.println("Location of HP: "+loc);
		System.out.println("Size of the stack: "+st.size());
		
		Iterator ite = st.iterator();
		while(ite.hasNext()) {
			Object val = ite.next();
			System.out.println(val);
		}
		//using for each
		System.out.println("\nFor Each:");// started working from java 8 version
		st.forEach(n -> System.out.println(n));
		

	}

}
