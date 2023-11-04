package Stack;
import java.util.Stack;

public class StackEmptyMethodExample {

	public static void main(String[] args) {
		//creating an instance of Stack Class
		Stack<Integer> stk = new Stack<>();
		
		//checking stack empty or not
		boolean res = stk.empty();
		System.out.println("Is the stack empty? "+ res);
		//pushing elements into stack
		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(120);
		
		//prints elements of the stack
		System.out.println("Elements in Stack: "+ stk);
		res = stk.empty();
		System.out.println("Is the stack empty? "+ res);
	}

}
