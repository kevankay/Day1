import java.util.Scanner;
public class Interest {
	private static Scanner sc;
	public static void main (String args[]) {
		double P,T,R,sim,com;
		sc = new Scanner(System.in);
		System.out.println("Enter the Amount:");
		 P=sc.nextDouble();
		System.out.println("Enter the No. of years:");
		 T=sc.nextDouble();
		System.out.println("Enter the Rate of interest:");
		 R=sc.nextDouble();
		
		sim=(P * T * R)/100;
		System.out.println("Simple interest="+sim);
		
		com=P * Math.pow(1.0+R/100.0,T) - P;
		System.out.println("Compound interest="+com);
	}
}
