package java559;
import java.util.Scanner;

public class EvenOddSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Taking size of Integers
		System.out.println("Enter the number of Integers:");
		int n = sc.nextInt();
		int Evensum = 0,Oddsum = 0;
		int i;
		//Input of Integers given number of Integers or size n
		System.out.println("Enter the Integers:");
		for(i=1;i<=n;i++) {
			//Reading Integers Inside for loop
			int num = sc.nextInt(); 
			if(num%2 == 0) {
				Evensum = Evensum + num;
			}else {
				Oddsum = Oddsum + num;
			}
		} System.out.println("Even numbers sum is:"+Evensum);
		  System.out.println("Odd numbers sum is:"+Oddsum);
		  sc.close();
	}
}
