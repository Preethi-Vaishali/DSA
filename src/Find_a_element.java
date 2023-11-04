import java.util.Scanner;

public class Find_a_element {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count=0;
		System.out.print("Enter the number of elements you want in array: ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter all the elements: ");
		for(int i =0; i<n; i++)
			arr[i] = s.nextInt();
		System.out.print("Enter the element you want to find: ");
		int find = s.nextInt();
		for(int i =0; i<n; i++) {
			if(arr[i]==find) {
				System.out.println("Element found at position: " +(i+1));
			count++;	
			}	
				
		}if(count==0)
			System.out.println("Element not found ");
s.close();
	}

}
