import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the array elements one by one: ");
		for(int i =0; i<n; i++)
			arr[i] = s.nextInt();
		System.out.print("Enter the position you want to update: ");
		int pos = s.nextInt();
		System.out.print("Enter the element you want to update: ");
		int ele = s.nextInt();
		arr[pos-1]= ele;
		System.out.println("Array Updated: ");
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
		s.close();

	}

}
