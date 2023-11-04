package Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackOperations_Using_Linked_List {
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
            	System.out.println("Enter Integer element to push:");
            	st.push(s.nextInt());
            	break;
            case 2:
            	int x = st.pop();
            	System.out.println("Popped Element: "+x);
            	break;
            case 3:
            	System.out.println("Peek Element: "+st.peek());
            	break;
            case 4:
            	if(st.isEmpty())
            		System.out.println("Stack is Empty");
            	else
            		System.out.println("Stack is not empty");
            	break;
            case 5:
            	System.out.println("Size = "+st.size());
            	break;
            default:
            	System.out.println("Wrong Entry \n ");
                break; 
            		
            }System.out.print("Stack = ");
            if(st.isEmpty()) {
            	System.out.print("Empty");
            }
            else {
            	reversePrint(st);
            }
            System.out.println("\nDo you want to continue (Type y or n) \n");	
		ch= s.next().charAt(0);
		}while(ch=='Y'|| ch=='y');
	}

}
