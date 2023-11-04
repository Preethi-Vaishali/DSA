package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex_1 {

	public static void main(String[] args) {
		// List
		List<String> list = new ArrayList<String>();//List is interface
		list.add("HCL");
		list.add("DELL");
		list.add("CTS");
		list.add("TCS");
		list.add("Tech Mahindra");
		list.add(2,"Zoho");
		list.set(1, "Imarticus");
		//Sorting list in ascending order according to the natural ordering
		//Collections.sort(list);
		list.forEach(System.out::println);
		
		Collections.sort(list);
		System.out.println();
		for(String str:list)
			System.out.println(str);
		 

	}

}
