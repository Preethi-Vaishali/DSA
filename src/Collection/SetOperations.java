package Collection;
import java.util.*;

public class SetOperations {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Integer[ ] A = {22, 45, 33, 66, 55, 34, 77};
		Integer[ ] B = {33, 2, 83, 45, 3, 12, 55};
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(A));
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(B));
		
		//Finding union of set1 & set2
		Set<Integer> union_data = new HashSet<Integer>(set1);
		union_data.addAll(set2);
		System.out.print("Union of set1 & set 2 is: ");
		System.out.println(union_data);
		
		//Finding intersection of set1 & set2
				Set<Integer> intersection_data = new HashSet<Integer>(set1);
				intersection_data.retainAll(set2);
				System.out.print("Intersection of set1 & set 2 is: ");
				System.out.println(intersection_data);

				//Finding difference of set1 & set2
						Set<Integer> difference_data = new HashSet<Integer>(set1);
						difference_data.removeAll(set2);
						System.out.print("Difference between set1 & set 2 is: ");
						System.out.println(difference_data);
						Set<Integer> difference_data1 = new HashSet<Integer>(set2);
						difference_data1.removeAll(set1);
						System.out.print("Difference between set2 & set 1 is: ");
						System.out.println(difference_data1);
	}

}
