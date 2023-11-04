import java.util.Scanner;

public class Rotate_Array_by_n_Times {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, rot, x;
		System.out.print("Enter the number of elements: ");
		n = s.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the array elements one by one: ");
		for(int i =0; i<n; i++)
			arr[i] = s.nextInt();
		System.out.print("Enter the number of rotation: ");
		rot = s.nextInt();
		for (int r=0; r<rot; r++) {
		x = arr[n-1];
			for (int i=n-1; i>0; i--)
				arr[i]=arr[i-1];
			arr[0]= x;
			
	}
		System.out.println("Rotated array: ");
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
		s.close();

	}

}
