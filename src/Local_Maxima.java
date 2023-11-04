import java.util.Scanner;

public class Local_Maxima {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int max;
		System.out.print("Enter the size of the array: ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the array elements: ");
		for(int i =0; i<n; i++)
			arr[i] = s.nextInt();
		 max = arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i]>max)
				max=arr[i];
			}
		System.out.print("The local maxima is: "+ max);
		s.close();
	}

}
