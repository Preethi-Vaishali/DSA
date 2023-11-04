import java.util.Scanner;

public class Insertion_of_an_Element {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = s.nextInt();
		int arr[] = new int[n+1];
		System.out.print("Enter the array elements one by one: ");
		for(int i =0; i<n; i++)
			arr[i] = s.nextInt();
		System.out.print("Enter the position you want to insert: ");
		int pos = s.nextInt();
		System.out.print("Enter the element you want to insert: ");
		int ele = s.nextInt();
		/*int j =n;
		while(j>pos) {
			arr[j] = arr[j-1];
			j--;
		}*/
		for(int j=n; j>pos; j--) {
			arr[j] = arr[j-1];
		}
		arr[pos]= ele;
		System.out.println("Array Insertion: ");
		for(int i=0; i<=n; i++)
			System.out.print(arr[i]+" ");
		s.close();

	}

}
