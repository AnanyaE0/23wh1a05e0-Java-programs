package Java_programs;

public class cons_para {
	int x;
	public cons_para(int y) {
		x=y;
	}
	public static void main(String[]args)
	{
		cons_para myObj = new cons_para(9200);
		System.out.println(myObj.x);
	}
}
