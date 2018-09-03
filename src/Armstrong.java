import java.util.*;
public class Armstrong {
	
	public static void main(String args[]) {
		
		int num,number,temp,total = 0;
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		number = num;
		
		for(;number != 0;)
		{
			temp = number % 10;
			total = total + temp*temp*temp;
			number=number/10;
		}
		
		if(total == num)
			System.out.println(num + " is an Armstrong number");
		else
			System.out.println(num + " is not an Armstrong number");
	}
}