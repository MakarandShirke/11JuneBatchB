package Polymorphism;

public class Demo {
	
	public void addition (int a, int b) {
		
		System.out.println(a+b);
	}
	
	public void addition (int a, int b, int c) {
		
		System.out.println(a+b+c);
		
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		
		d.addition(20, 20);
		d.addition(30, 30, 50);
	}

}
