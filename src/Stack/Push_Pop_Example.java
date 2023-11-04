package Stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class Push_Pop_Example {

	public static void main(String[] args) {
		//creating an object of Stack Class
		Stack<Integer> st = new Stack<>();
		System.out.println("Stack: "+ st);
		
		//pushing elements into the stack
		pushelmnt(st, 20);
		pushelmnt(st, 13);
		pushelmnt(st, 89);
		pushelmnt(st, 90);
		pushelmnt(st, 11);
		pushelmnt(st, 45);
		pushelmnt(st, 18);
		
		//poping elements from the stack
		popelmnt(st);
		popelmnt(st);
		
		//throws exception if the stack is empty
		try {
			popelmnt(st);
		}
		catch (EmptyStackException e)
		{
			System.out.println("Empty Stack: ");
		}
	}
	//performing push operations
		@SuppressWarnings({ "unchecked", "removal", "rawtypes" })
		static void pushelmnt(Stack stk, int x) {
			//invoking push() method
			stk.push(new Integer(x));
			System.out.println("push ->" +x);
			//prints modified stack
			System.out.println("Stack: "+ stk);
		}
		
		//performing pop operation
		@SuppressWarnings("rawtypes")
		static void popelmnt(Stack stk) {
			System.out.println("pop ->");
			//invoking pop() method
			Integer x = (Integer)stk.pop();
			System.out.println(x);
			//prints modified stack

			System.out.println("Stack: "+ stk);
	}

}
