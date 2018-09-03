import java.util.Scanner;
public class FindElement {
	public static void main(String args[]) {
		int n=15, i=0, x ,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter all the elements of the array: ");
		int a[] = new int[n];
		
		for(i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
       System.out.println("Enter the element you want to find:");
       x = sc.nextInt();
       sc.close();
       for(i=0;i<n;i++) {
      	 if(a[i]==x) {
    		flag = 1;
    		break;
    	   }
      	 else {
      		 flag = 0;
      	 }
       }
      	 if(flag == 1) {
      		System.out.println("The given element is present.");
         }
      	 else {
      		System.out.println("The given element is not present.");
      }
	}
}
