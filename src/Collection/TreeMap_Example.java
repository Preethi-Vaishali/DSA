package Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Example {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// This is how to declare Treemap
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		
		//Adding elements to Hashmap
		tmap.put(1, "Data1");
		tmap.put(23, "Data2");
		tmap.put(70, "Data3");
		tmap.put(4, "Data4");
		tmap.put(2, "Data5");
		
		
		//Display content using iterator
		Set set = tmap.entrySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
		Map.Entry mentry = (Map.Entry)iter.next();
		System.out.print("Key is: "+ mentry.getKey()+ " & Value is: ");
		System.out.println(mentry.getValue());
		}

	}

}
