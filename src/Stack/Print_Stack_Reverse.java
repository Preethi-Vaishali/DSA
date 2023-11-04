package Stack;

import java.util.Stack;

public class Print_Stack_Reverse {
static void reversePrint(Stack<Integer> s) {// printing upto top 0 or print in reverse
	if(s.isEmpty())
		return;
	int x = s.peek();
	s.pop();
	System.out.print(x+" ");
	reversePrint(s);
	s.push(x);// to retain the elements in stack
}
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println("Stack Elements in forward");
		System.out.println(st);
		System.out.println("Stack Elements in reverse:");
		reversePrint(st);
		System.out.println();
		System.out.println(st);
	}

}
