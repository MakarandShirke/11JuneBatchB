package MethodConstructor;

public class Sample2 {
	
	public static void m3() { //Static method call from different class
		
		System.out.println("Running m3 method");
		
	}
	public static void main(String[] args) {
		
		System.out.println("main2 method started");
		
	 Sample1.m1();
	 Sample1.m2();
	 
	 
	 System.out.println("main2 method ended");
	 
	}
	
	
	
	
	
	
	
	
	

}
