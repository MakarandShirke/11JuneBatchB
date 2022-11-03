package Inheritance;

public class This {
	
	int a = 67; // Global Variable
	
	public void Demo() {
		
		int a = 35; // Local Variable
		System.out.println(a);
		System.out.println(this.a);
		
		
	}
	
	public static void main(String[] args) {
		
		This t = new This();
		t.Demo();
		
		
	}

}
