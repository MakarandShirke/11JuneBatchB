package MethodConstructor;

public class Sample1 {
	
	public static void m1() { //static method call from same class
		
		System.out.println("Running m1 method");	
		
	}
	
	public static void m2() {
		
		System.out.println("Running m2 method");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		m1();
		m2();
		
		System.out.println("main method ended");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
