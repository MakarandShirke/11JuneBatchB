package MethodConstructor;

public class Sample3 {
	
	public static void Addition(int a, int b) {
		
		int c =a+b;
		
		System.out.println("Addition="+c);
	}
	
	public void Multiplication(int a, int b) {
		
		int c = a*b;
		
		System.out.println("Multiplication="+c);
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		Addition(30,20);
		
		Sample3 mul = new Sample3();
		mul.Multiplication(15, 2);
	}

}
