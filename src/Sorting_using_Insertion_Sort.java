import java.util.Scanner;

public class Sorting_using_Insertion_Sort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t,key;
		//System.out.print("Enter the number of elements: ");
		int n = s.nextInt();
		int arr[] = new int[n+1];
		//System.out.print("Enter the array elements one by one: ");
		for(int i =0; i<n; i++)
			arr[i] = s.nextInt();
		for(int step =1; step<n; step++) {
			key = step;
			for(int i=step-1; i>=0; i--) {
				if(arr[i]>arr[key]) {
					t = arr[i];
					arr[i] = arr[key];
					arr[key] = t;
					key--;
				}
			}
		}
		//System.out.println("Array after Sorting: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		s.close();
	}

}
