public class Armstrong_range {
	public static void main(String args[]) {
		int number1=100, number2=999, n, i,rem, temp, count=0;
		for(i=number1+1; i<number2; i++){
			temp = i;
			n = 0;
			while(temp != 0){
				rem = temp%10;
				n = n + rem*rem*rem;
				temp = temp/10;
			}
			if(i == n){
				if(count == 0) {
					System.out.println("Armstrong numbers within the given range: \n");
				}
				System.out.println(i + " ");
				 count++;
			}
		}
	}
}
