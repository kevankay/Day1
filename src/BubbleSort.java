
public class BubbleSort {
	public static void main(String args[]) {
		int ar[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		for(int i=0;i<=14;i++)
		{
			for(int j=i+1;j<=14;j++) {
				if(ar[i]>ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for(int i=0;i<=14;i++) {
			System.out.print(" "+ar[i]);
		}
	}
}
