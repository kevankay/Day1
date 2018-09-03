import java.util.Scanner;
public class Avg_marks {
	public static void main(String args[]) {
		int Marks[][] = new int[3][3];
		int sum1=0,avg1=0,sum2=0,avg2=0,sum3=0,avg3=0;
		int sumA=0,avgA=0,sumB=0,avgB=0,sumC=0,avgC=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values: ");
				for(int i=0; i<3; i++) {
					for(int j=0; j<3; j++) {
						Marks[i][j] = sc.nextInt();
					}
				}
			sc.close();
				for(int j=0; j<3; j++) {
					sum1 = sum1 + Marks[0][j];
					sum2 = sum2 + Marks[1][j];
					sum3 = sum3 + Marks[2][j];
					avg1 = sum1/3;
					avg2 = sum2/3;
					avg3 = sum3/3;
				}
				System.out.println("Score of student1 is:" +sum1);
				System.out.println("Average of student1 is:" +avg1);
				System.out.println("Score of student2 is:" +sum2);
				System.out.println("Average of student2 is:" +avg2);
				System.out.println("Score of student3 is:" +sum3);
				System.out.println("Average of student3 is:" +avg3);
				
				for(int i=0; i<3; i++) {
					sumA = sumA + Marks[i][0];
					sumB = sumB + Marks[i][1];
					sumC = sumC + Marks[i][2];
					avgA = sumA/3;
					avgB = sumB/3;
					avgC = sumC/3;
				}
				System.out.println("Score of subjectA is:" +sumA);
				System.out.println("Average of subjectA is:" +avgA);
				System.out.println("Score of subjectB is:" +sumB);
				System.out.println("Average of subjectB is:" +avgB);
				System.out.println("Score of subjectC is:" +sumC);
				System.out.println("Average of subjectC is:" +avgC);
				
	}
}
