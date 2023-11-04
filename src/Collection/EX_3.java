package Collection;
import java.util.*;
public class EX_3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//ArrayList <Integer> num = new ArrayList<Integer>();
		@SuppressWarnings("rawtypes")
		ArrayList num = new ArrayList();
		num.add(1);
		num.add(7);
		num.add(5);
		num.add(6);
		num.add("File1");
		num.add("File2");
		
		//displaying elements 
		num.forEach(System.out::println);
				System.out.println("Number of elements in ArrayList: "+num.size());
		
	}

}
