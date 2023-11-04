import java.util.Scanner;

public class Transpose_of_a_Matrix {

	public static void main(String[] args) {
		int col,row;
		Scanner s =new Scanner(System.in);
		System.out.print("Enter number of row:");
		row=s.nextInt();
		System.out.print("Enter number of col:");
		col=s.nextInt();
		int a[][]=new int[row][col];
		System.out.println("Enter the elements of matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Transpose of the matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[j][i]+" ");
				
			}
			System.out.println();
	}
s.close();
}
}
