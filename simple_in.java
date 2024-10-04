package csed8;
import java.util.Scanner;
public class simple_in {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int p = x.nextInt();
		int t = x.nextInt();
		int r = x.nextInt();
		int result = (p*t*r)/100;
		System.out.println("Simple intrest for given input is:"+result);
	}
}
