package Collection;
import java.util.*;

public class Ex_2 {

	public static void main(String[] args) {
		ArrayList <String> alist = new ArrayList<String>();
		alist.add("Steve");
		alist.add("Tim");
		alist.add("Lucy");
		alist.add("Pat");
		alist.add("Angela");
		alist.add("Tom");
		
		//displaying elements 
		alist.forEach(System.out::println);
		System.out.println();
		System.out.println(alist);
		//Removing steve and angela
		alist.remove("Steve");
		alist.remove("Angela");
		//displaying elements
		System.out.println(alist);
		//Removing 3rd element
		alist.remove(2);
		//displaying elements
				System.out.println(alist);
				System.out.println();
				for(String str:alist)
					System.out.println(str);
				System.out.println("Number of elements in ArrayList: "+alist.size());
	}

}
