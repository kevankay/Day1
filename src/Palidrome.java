import java.util.Scanner;
public class Palidrome {
	public static void main(String args[]) {
		int n, m, x, a=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		n = sc.nextInt();
		sc.close();
		m = n;
		while (n>0) {
			x = n % 10;
			a = a * 10 + x;
			n = n/10;
		}
		if (a == m){
			System.out.println("Given number is a palindrome.");
		}
		else {
			System.out.println("Given number is not a palindrome.");
		}
	}
}
