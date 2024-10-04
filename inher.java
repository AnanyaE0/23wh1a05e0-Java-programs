package csed8;
 class job{
	int salary = 50000;
}
 class it extends job{
	int bonus = 30000; 
}
 class inher {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		it x = new it();
		System.out.println(x.salary);
		System.out.println(x.bonus);
	}

}
