package Queue;
import java.util.*;

public class Queue_Using_PriorityQueue {

	public static void main(String[] args) {
		Queue<Integer> nums = new PriorityQueue<>();
		nums.offer(11);
		nums.offer(5);
		nums.offer(25);
		nums.offer(34);
		nums.offer(96);
		nums.offer(112);
		System.out.println("Queue: "+nums);
		System.out.println("Accessed element: "+nums.peek());
		System.out.println("Removed element: "+nums.remove());
		System.out.println("Removed element: "+nums.remove(34));
		System.out.println("Updated Queue: "+nums);
		
	}

}
