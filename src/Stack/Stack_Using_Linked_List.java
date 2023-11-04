package Stack;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Stack_Using_Linked_List {
	
	@SuppressWarnings({"unchecked" })
	static void pop(@SuppressWarnings("rawtypes") Stack stk) {
		Integer x = (Integer)stk.pop();
		System.out.println("Popped Element= " +x);
		if(stk.isEmpty()) {
		System.out.print("Stack = Empty ");}
		else {
			System.out.print("Stack = ");
		reversePrint(stk);
		}
	}
	
	
		@SuppressWarnings("unchecked")
		static void peek(@SuppressWarnings("rawtypes") Stack stk) {
			System.out.println("Peeked Element = "+stk.peek());
			if(stk.isEmpty()) {
				System.out.print("Stack = Empty ");}
				else {
					System.out.print("Stack = ");
				reversePrint(stk);
				}
	}
		
	static void reversePrint(Stack<Integer> s) {// printing upto top 0 or print in reverse
		if(s.isEmpty())
			return;
		int x = s.peek();
		s.pop();
		//System.out.print("Stack = ");
		System.out.print(x+" ");
		reversePrint(s);
		s.push(x);// to retain the elements in stack
	}
	
	
	@SuppressWarnings({ "unchecked", "removal" })
	static void push(@SuppressWarnings("rawtypes") Stack stk, int x) {
		//invoking push() method
		stk.push(new Integer(x));
		//prints modified stack
		System.out.print("Stack = ");
		reversePrint(stk);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Stack_Using_Linked_List list = new Stack_Using_Linked_List();
		Stack<Integer> st = new Stack<>();
		System.out.println("Linked Stack Test\n");
		char ch;
		do
		{
			System.out.println("\nLinked Stack Operations");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. size");  
            int choice = s.nextInt();            
            switch (choice) {
            case 1 :
                System.out.println("Enter integer element to push");
                //int x = 
                push(st,s.nextInt());
                break;  
                
            case 2: {
            	try {
        			pop(st);
        		}
        		catch (EmptyStackException e)
        		{
        			System.out.println("Stack = Empty");
        		}
            
            }
                break;
                
            case 3:{try {
    			peek(st);
    		}
    		catch (EmptyStackException e)
    		{
    			System.out.println("Stack = Empty");
    		}
            	
            }
            	break;
            case 4:
            	
            	System.out.println("Empty Status = "+st.isEmpty());
            	break;
            	
            case 5:{
            	System.out.println("Size = "+st.size());
            	reversePrint(st);
            }
            	break;
            default : 
                System.out.println("Wrong Entry \n ");
                break;              	
            }
            System.out.println("\nDo you want to continue (Type y or n) \n");	
		ch= s.next().charAt(0);
		}while(ch=='Y'|| ch=='y');

	}

}
