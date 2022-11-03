package BasicsJAVA;

public class sample1 {
	
	public void m1() { // Non static method call from same class
		
		System.out.println("Runnin non static m1 method");
		
	}
	
	public void m2() {
		
		System.out.println("Running non static m2 method");
	}
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		sample1 S1 = new sample1();
		S1.m1();
		S1.m2();
		
		System.out.println("main method ended");
	}

}
