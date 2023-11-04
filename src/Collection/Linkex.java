package Collection;

import java.util.*;


public class Linkex {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();//List is interface
		//convert arraylist into linkedlist
		LinkedList<String> llistobj = new LinkedList<String>();
		ArrayList<String> arraylist = new ArrayList<String>();
		
		arraylist.add("String1");
		arraylist.add("String2");
		llistobj.addAll(arraylist);
		
		System.out.println(llistobj);
		
		
		
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
		list.addFirst("IBM");
		list.addLast("PWC India");
		System.out.println();
		list.add("Imarticus");
			System.out.println(list.indexOf("Imarticus"));//indexOf will give first occurance of the element
			System.out.println();
			System.out.println(list.get(3));
			System.out.println();
			System.out.println(list.size());
			System.out.println();
			System.out.println(list.getFirst());
			System.out.println(list.getLast());
			System.out.println();
			System.out.println(list.contains("Hello"));
			System.out.println(list.contains("TCS"));
			System.out.println();
			System.out.println(list.lastIndexOf("Imarticus"));//lastIndexOf gives last occurance of the element
			System.out.println();
			System.out.println(list.lastIndexOf("HCL"));//lastIndexOf gives last occurance of the element
			System.out.println();
			System.out.println(list);
			list.poll();//Removing the first element- IBM
			list.pollFirst();//Removing the first element - HCL
			list.pollLast(); // Remove the last element - PWC India
			list.remove("TCS");// Remove the TCS element
			list.remove(1);// Remove the first index element
			System.out.println();
			Iterator<String> iter= list.iterator();
			while(iter.hasNext()) {
				System.out.print(iter.next()+" ");
			}
			
			
			list.clear();
			System.out.println(list);

	}

}
