import java.util.Scanner;
public class ArrayIndex {
	public static void main(String args[]) {
		int x=0,y=0;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter how many numbers you want: ");
		int n=Integer.parseInt(inp.nextLine());
		int array[]=new int[n];
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter the number");
			array[i] = inp.nextInt();
		}
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					x=Math.abs(i-j);
					y=j;
				}
			}
		}
		System.out.printf("Give k value");
		Scanner in=new Scanner(System.in);
		int k=Integer.parseInt(in.nextLine());
		if(x>=k) {
			System.out.println("Yes, it is less than k");
		}
		else {
			System.out.println("No");
			in.close();
			inp.close();
		}
	}
}
