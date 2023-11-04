import java.util.Scanner;

public class Print_the_non_Duplicate_num {
	static void duplicateNum(int ar[], int n) {
		int c=0, flag =0;
		for(int i=0; i<n; i++) {
			c=0;
			for(int j=0; j<n; j++) {
				if(ar[i]==ar[j] && i!=j) {
					c++;	
				}
			}
			if(c==0) {
				System.out.print(ar[i]+" ");
			flag=1;
			}
		}
		if(flag==0)
			System.out.print("The elements are repeated");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n= s.nextInt();
		int ar[]= new int[n];
		System.out.print("Enter array elements: ");
		for(int i=0; i<n; i++)
			ar[i]=s.nextInt();
		duplicateNum(ar,n);
		s.close();	
	}

}
