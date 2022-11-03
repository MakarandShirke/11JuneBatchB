package AbstractConcrete;

public class Multiple implements A, B{
	
	public void Display() {  // Multiple inheritance by interface
		
		System.out.println("Display implementation class");
		
	}
	
	public void Show() {
		
		System.out.println("Show implementation class");
	}
	
	
	public void Add() {
		
		int a = 20;
		int b= 10;
		int c = a+b;
		
		System.out.println(c);
	}
	
	public void Division () {
		
		int a= 50;
		int b = 25;
		int c= a/b;
		
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Multiple m = new Multiple();
		m.Display();
		m.Show();
		m.Add();
		m.Division();
	}

}
