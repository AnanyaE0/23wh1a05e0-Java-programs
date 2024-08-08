package Java_programs;

public class cons_default {
	int x;
	public cons_default() {
		x=99;
	}
	public static void main(String[]args)
	{
		cons_default myObj = new cons_default();
		System.out.println(myObj.x); 
	}
}
