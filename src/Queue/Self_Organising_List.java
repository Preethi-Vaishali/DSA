package Queue;

import java.util.Scanner;

class SelfOrganising{
	//1 usage
	private int[] list;
	//1 usage
	private int[] count;
	//3 usages
	private int size;
	//no usages
	public SelfOrganising(int listSize) {
		list = new int[listSize];
		count = new int[listSize];
		size =0;
	}
	//no usages
	public boolean isEmpty() {
		return size==0;
	}
	//no usages 
	public boolean isFull(){
		return size == list.length;
	}
	//no usages
	public int getSize() {
		return size;
	}
	//no usages
	public void insert(int val) {
		if(isFull()) {
			System.out.println("Error: List is Full");
			return;
		}
		list[size] = val; //list[0] =7
		count[size]=0; //count[o] = 0
		size++;
	}
	//no usages
	public void remove(int pos) {// 7 3 1 5 2 => pos =4 =>  element 5 removed
		pos--; //index =2
		if(pos<0 || pos>=size) {
			System.out.println("Invalid Position");
			return;
		}
		for(int i= pos; i<size-1; i++) {
			list[i] = list[i+1]; //list[3] = list[4]
			count[i]= count[i+1]; //count[0] = count[1]
		}
		size--;
	}
	//no usages
	public boolean search(int x) { 
		// 7 3 12 5 9 => x =12
		// 0 0 0 0 0 
		boolean searchResult = false;
		int pos = -1;
		for(int i=0; i<size; i++) {
			if(list[i]==x) {// list[2] == x
				searchResult = true;
				pos = i; //pos = 2
				break;
			}
		}
		if(searchResult) {//if(true)
			count[pos]++;// count[2]++ => 0++ =1 
			int c = count[pos]; //c=count[2]
			for(int i=0; i<pos; i++) {
				if(count[pos]>count[i]) { //count[2] > count[0]
					for(int j= pos;j>i; j++) {//j =2
						list[j]=list[j-1]; //list[2] = list[1]
						count[j] = count[j-1];
					}
					list[i]=x;
					count[i]=c;
					break;
				}
			}
		}
		return searchResult;
	}
	//no usages
	public void printList() {
		System.out.print("\n List= ");
		for(int i=0; i<size; i++)
			System.out.print(list[i]+" ");
		System.out.print("\n Count= ");
		for(int i=0; i<size; i++)
			System.out.print(count[i]+" ");
	}
}

public class Self_Organising_List {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			System.out.println("Self Organizing List\n");
			System.out.println("Enter size of list ");
			int size = s.nextInt();
			SelfOrganising list = new SelfOrganising(size);
			char ch;
			do 
			{
				System.out.println("\nSelf Organizing List Operations: ");
	            System.out.println("1. insert");
	            System.out.println("2. delete at position");
	            System.out.println("3. search");
	            System.out.println("4. check empty");
	            System.out.println("5. check full");
	            System.out.println("6. get size");
	            int choice = s.nextInt();            
	            switch (choice) {
	            case 1:
	            	System.out.println("Enter integer element to insert");
	            	list.insert(s.nextInt());
	            	break;
	            case 2:
	            	System.out.println("Enter position to delete");
	            	list.remove(s.nextInt());
	            	break;
	            case 3:
	            	System.out.println("Enter integer element to search");
	            	System.out.println("Search Result: "+list.search(s.nextInt()));
	            	break;
	            case 4:
	            	System.out.println("Empty status = "+ list.isEmpty());
	            	break;
	            case 5:
	            	System.out.println("Full status = "+ list.isFull());
	            	break;
	            case 6:
	            	System.out.println("Size = "+ list.getSize());
	            	break;
	            default:
	            	System.out.println("Wrong Entry\n");	
	            
	            }
	            list.printList();
	            System.out.println("\nDo you want to continue (Type y or n) \n");	
	    		ch= s.next().charAt(0);
			}while(ch =='y' || ch=='Y');
		
		
	}

}
