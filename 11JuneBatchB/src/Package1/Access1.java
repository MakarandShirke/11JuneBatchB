package Package1;

public class Access1 {
	
	public int a = 20;
	private int b = 30;
	protected int c = 40;
	int d = 50;    // Default
	
	public static void main(String[] args) {
		
		Access1 x = new Access1();
		System.out.println(x.a);
		System.out.println(x.b);
		System.out.println(x.c);
		System.out.println(x.d);
		
		
		
	}

}
