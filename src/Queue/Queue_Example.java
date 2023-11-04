package Queue;
import java.util.Queue;
import java.util.LinkedList;

public class Queue_Example {

	public static void main(String[] args) {
		//creating queue using Linked list class
Queue<Integer> nums = new LinkedList<>();

//offers elements to the queue
nums.offer(1);
nums.offer(2);
nums.offer(3);
System.out.println("Queue: "+nums);

//access elements of the queue
int accessnums = nums.peek();
System.out.println("\nAccessed element: "+ accessnums);

//removes elements from the queue
int removednum = nums.poll();
System.out.println("\nRemoved Element: "+ removednum);
System.out.println("\nUpdated Queue: "+ nums);
	}

}
