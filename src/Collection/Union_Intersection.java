package Collection;
import java.util.*;

public class Union_Intersection {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Integer[ ] A = {1,2,3,4,5};
		Integer[ ] B = {5,3,6,7,9};
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(A));
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(B));
		Set<Integer> union = new HashSet<Integer>(set1);
		union.addAll(set2);
		System.out.println("Union = "+union);
		Set<Integer> inter = new HashSet<Integer>(set1);
		inter.retainAll(set2);
		System.out.println("Intersection = "+inter);
		
	}

}
