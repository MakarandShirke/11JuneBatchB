package Inheritance;

public class sample1 extends sample {
	
	
     int a = 56;  // Global variable from same class
	
	public void test() {
		
		int a = 34; // Local variable
		
		System.out.println(a);  // Calling Local Variable
		System.out.println(this.a); // calling same class variable
		System.out.println(super.a); // calling super class global variable
	}
	
	public static void main(String[] args) {
		
		sample1 s = new sample1();
		s.test();
	}

	
}
