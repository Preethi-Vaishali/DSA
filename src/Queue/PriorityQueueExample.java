package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
	
		//creating queue using the Priorityqueue class
		Queue<Integer> nums = new PriorityQueue<>();
		nums.offer(5);
		nums.offer(1);
		nums.offer(2);
		System.out.println("Queue: "+nums);
		
		int accessnum = nums.peek();
		System.out.println("\nAccessed element: "+ accessnum);

		int removednum = nums.poll();
		System.out.println("\nRemoved Element: "+ removednum);
		System.out.println("\nUpdated Queue: "+ nums);
	}

}
