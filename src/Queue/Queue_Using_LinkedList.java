package Queue;

import java.util.*;
import java.util.Queue;

public class Queue_Using_LinkedList {

	public static void main(String[] args) {
		Queue<Integer> nums = new LinkedList<>();
		nums.offer(11);
		nums.offer(5);
		nums.offer(25);
		nums.offer(34);
		nums.offer(96);
		nums.offer(112);
		System.out.println("Queue: "+nums);
		System.out.println("Accessed Element: "+nums.peek());
		System.out.println("Removed Element "+nums.remove());
		System.out.println("Removed Element: "+nums.remove(34));
		System.out.println("Updated Queue: "+nums);
	}

}
