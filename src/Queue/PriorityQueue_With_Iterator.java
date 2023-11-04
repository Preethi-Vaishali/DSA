package Queue;
import java.util.PriorityQueue;
import java.util.Iterator;
public class PriorityQueue_With_Iterator {
	

		public static void main(String[] args) {
		
			//creating queue using the Priorityqueue class
			PriorityQueue<Integer> nums = new PriorityQueue<>();
			nums.add(4);
			nums.add(2);
			nums.add(1);
			System.out.println("PriorityQueue using Iterator(): ");
			//using the iterator() method
			Iterator<Integer> iterate = nums.iterator();
			while(iterate.hasNext()) {
				System.out.print(iterate.next());
				System.out.print(", ");
			}
		}
}
