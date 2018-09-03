import java.util.Scanner;
public class PalindromeCheck {
	public static Scanner sc;
	public static void main(String args[]) {
		int k=0,count=0;
		String b=" ";
		String temp ="";
		sc = new Scanner(System.in);
		String words[] = new String[10];
		System.out.println("Enter 10 words");
		for(int i=0;i<10;i++) {
			words[i] = sc.nextLine();
		}
		String palindrome[] = new String[10];
		for(int i=0;i<10;i++) {
			int n = words[i].length();
			for(int j=n-1;j>=0;j--) {
				b=b+words[i].charAt(j);
			}
			if(words[i].equals(b)) {
				count++;
				palindrome[k]=words[i];
				k++;
			}
			b="";
		}
		System.out.println("Total palindromes are "+count);
		for(int j=0;j<count-1;j++) {
			for(int i=0; i<count-j-1;i++) {
				int n = palindrome[i].length();
				int m = palindrome[i+1].length();
				if(n>m) {
					temp=palindrome[i+1];
					palindrome[i+1]=palindrome[i];
					palindrome[i]=temp;
				}
			}
		}
		System.out.println("Palindromes in descending order are: ");
		for(int i=0;i<count;i++) {
			int n=palindrome[i].length();
			System.out.println(palindrome[i]+":"+n);
		}
	}
}
