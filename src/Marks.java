import java.util.Scanner;
public class Marks {
	private static Scanner sc;
	public static void main(String args[]) {
		int a,b,c;
		System.out.println("Enter your marks :");
		sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>60 && b>60 && c>60) {
			System.out.println("You are Passed");
		}
		else if ((a>60 && b>60)||(a>60 && c>60 )||( b>60 && c>60 )) {
			System.out.println("You are Promoted");
		}
		
		else if((a<60 && b<60 )|| (a<60 && c<60 ) ||( b<60 && c<60 )) {
			System.out.println("You are Failed");
		}
	}
}
