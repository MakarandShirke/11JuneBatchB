package MethodConstructor;

public class Method_basic {
	
	static void test() {
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
		
	}

	public static void main(String[] args) {
		
		test();
		System.out.println("e");
		test();
		System.out.println("f");
		test();
	
	}

}
