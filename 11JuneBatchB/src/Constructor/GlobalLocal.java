package Constructor;

public class GlobalLocal {
	
	int a = 50;  // Global variable define inside class
	
	public void Demo() {
		
		int b = 30;   // Local variable defined inside method
		int a = 15;
		System.out.println(b);
		System.out.println(a);
	}
	
	public void Demo1() {
		
		int c = 20;
		int b = 25;
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		
		GlobalLocal x = new GlobalLocal();
		System.out.println(x.a);
		x.Demo();
		x.Demo1();
	}

}
