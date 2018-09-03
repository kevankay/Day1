import java.util.Scanner;
public class Discount {
	public static void main(String args[]) {
		Float newItem,discount,newPrice;
		Scanner in=new Scanner (System.in);
		System.out.println("Enter the new item price: ");
		newItem=in.nextFloat();
		in.close();
		discount=(newItem*35)/100;
		System.out.println("The discount amount is "+discount);
		newPrice=newItem-discount;
		System.out.println("The new amount is "+newPrice);
	}
}
