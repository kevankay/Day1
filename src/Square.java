import java.util.Scanner;

public class Square {
	private static Scanner sc;
	public static void main(String[] args)
	{
		int number, square;
		sc = new Scanner (System.in);
		
		System.out.print("Enter a number : ");
		number = sc.nextInt ();
		
		square = calsquare(number);
		
		System.out.println("\n Square:" + square);
	}
public static int calsquare(int num) {
	return num * num;
}
}
