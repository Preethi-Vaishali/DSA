import java.util.Scanner;

public class Traverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the array elements one by one: ");
		for(int i =0; i<n; i++)
			arr[i] = s.nextInt();
		System.out.println("Array Traverse: ");
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
		s.close();
	}

}
