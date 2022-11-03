package Encapsulation;

public class Demo1 {
	
	private int a = 55;
	
	static private int b = 30;
	
	public static void set(int d) {
		
		b = d;
		
		System.out.println(b);
		
	}
	
	public int get() {
		
		return a;
	}
	

}
