package csed8;

public class me_overlo {
	public int sum(int x,int y) {
		return x+y;
	}
	public int sum(int x,int y,int z) {
		return x+y+z;
	}
	public double sum(double x,double y) {
		return x+y;
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		me_overlo obj = new me_overlo();
		System.out.println(obj.sum(7, 8));
		System.out.println(obj.sum(7, 8,1));
		System.out.println(obj.sum(7.2, 8.1));
	}

}
