package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		//creating Deque using the ArrayDeque class
		Deque<Integer> nums = new ArrayDeque<>();
		
		//add elements to the Deque
		nums.offer(1);
		nums.offerLast(2);
		nums.offerFirst(3);
		System.out.println("Deque: " + nums);
		
		//Access elements of the Deque
		int firstElement = nums.peekFirst();
		System.out.println("First Element: "+ firstElement);
		
		int lastElement = nums.peekLast();
		System.out.println("Last Element: "+ lastElement);
		
		//remove elements from the Deque
		int removedNum = nums.pollFirst();
		System.out.println("Removed First Element: "+ removedNum);
		
		int removedNum1 = nums.pollLast();
		System.out.println("Removed First Element: "+ removedNum1);
		
		System.out.println("Updated Deque"+ nums);

	}

}
