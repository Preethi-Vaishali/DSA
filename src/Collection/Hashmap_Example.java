package Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class Hashmap_Example {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// This is how to declare Hashmap
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		//Adding elements to Hashmap
		hmap.put(12, "Santhosh");
		hmap.put(2, "Vaishali");
		hmap.put(7, "Singh");
		hmap.put(49, "Anwar");
		hmap.put(3, "Aravind");
		//hmap.put(50, "Anwar");
		
		//Display content using iterator
		Set set = hmap.entrySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
		Map.Entry mentry = (Map.Entry)iter.next();
		System.out.print("Key is: "+ mentry.getKey()+ " & Value is: ");
		System.out.println(mentry.getValue());
		}
		//Get values based on key
		
		String var = hmap.get(2);
		System.out.println("Value at index 2 is: "+ var);
		
		//Remove values based on key
		hmap.remove(3);
		System.out.println("Map key and values after removal: ");
		Set set2 = hmap.entrySet();
		Iterator iter2 = set2.iterator();
		while(iter2.hasNext()) {
			Map.Entry mentry2 = (Map.Entry)iter2.next();
			System.out.print("Key is: "+ mentry2.getKey()+ " & Value is: ");
			System.out.println(mentry2.getValue());
		}

		
	}

}
