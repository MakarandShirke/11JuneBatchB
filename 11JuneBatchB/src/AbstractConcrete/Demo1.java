package AbstractConcrete;

public class Demo1 implements Demo {
	
	public void Test1() {
		
		int a = 20;
		int b= 30;
		int c = a+b;
		
		System.out.println(c);
		
		System.out.println("Running Test1 method");
	}
	
	public void Test2() {
		
		System.out.println("Test2 method running");
	}
	
	public static void main(String[] args) {
		
		Demo1 d = new Demo1();
				
				System.out.println(d.a);
				d.Test1();
				d.Test2();
	}

}
