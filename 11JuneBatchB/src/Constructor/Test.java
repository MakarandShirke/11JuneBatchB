package Constructor;

public class Test {
	
	int a;
	int b;
	int m;
	String name;
	String pune;
	
	
	
	Test() {
		
		a = 50;
		b = 30;
		
	}
	
	Test(int c, int d) {
		
		a = c;
		b = d;
		
	}
	
	Test(int c, int d, int i) {
		
		a = c;
		b = d;
		m = i;
		System.out.println(a);
		
	}
	
	Test(String name, String pune) {
		
	}
	
	public void addition() {
		
		System.out.println(m+a+b);
	}
	
	public void work() {
		
		System.out.println("name");
		System.out.println("pune");
	}
	
	public static void main(String[] args) {
	
		Test t = new Test();
		t.addition();
		t.work();
		
		Test t1 = new Test(100,300);
		t1.addition();
		
		Test t2 = new Test(100,300,600);
		t2.addition();
		
		
		
		
	}

}
