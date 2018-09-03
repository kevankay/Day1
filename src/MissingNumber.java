import java.util.Scanner;
public class MissingNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		int[] ms=new int[n];
		int temp,i,j;
		System.out.println("Enter the array elements:");
		
		for(i=0;i<n;i++) {
			ms[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) {
		for(j=i+1;j<n;j++) {
			if(ms[i]>ms[j]) {
				temp=ms[i];
				ms[i]=ms[j];
				ms[j]=temp;
			}
		}
	}
	for(i=0;i<n;i++) {
		if(ms[i]!=i) {
			System.out.println("The missing element is " + i);
			sc.close();
		}
	}
 }
}
