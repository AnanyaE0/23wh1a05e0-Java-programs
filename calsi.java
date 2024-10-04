package csed8;
import java.util.Scanner;
public class calsi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		int a = x.nextInt();
		int b = x.nextInt();
		System.out.print("1:+\n2:-\n3:*\n4:/\n5:%\n");
		int y = x.nextInt();
		switch(y) {
		case 1:System.out.println("Add:"+(a+b));break;
		case 2:System.out.println("Sub:"+(a-b));break;
		case 3:System.out.println("Muli:"+(a*b));break;
		case 4:System.out.println("Div:"+(a/b));break;
		case 5:System.out.println("Rem:"+(a%b));break;
		default:System.out.println("Enter the valid choice");
		}
	}

}
