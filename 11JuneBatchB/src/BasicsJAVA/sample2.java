package BasicsJAVA;

public class sample2 {
	
	public void m3() {
		System.out.println("Running m3 method");
		
	}
	
	public static void main(String[] args) {  // Non static method call from different class 
		
		System.out.println("main2 method started");
		
		sample1 S2 = new sample1();
		
		S2.m1();
		S2.m2();
		
		sample2 S = new sample2();
		S.m3();
		
		System.out.println("main2 method ended");
		
		
		
		
		
		
		
	}

}
