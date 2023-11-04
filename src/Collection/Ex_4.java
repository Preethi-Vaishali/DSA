package Collection;

import java.util.*;


public class Ex_4 {

	public static void main(String[] args) {
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
		list.remove(2);
		System.out.println();
			System.out.println(list.indexOf("Imarticus"));
			System.out.println();
			System.out.println(list.get(3));
			System.out.println();
			System.out.println(list.size());
			System.out.println();
			System.out.println(list.contains("Hello"));
			System.out.println(list.contains("TCS"));
			System.out.println();
			for(String str:list)
				System.out.println(str);
			list.clear();
			System.out.println(list);

	}

}
