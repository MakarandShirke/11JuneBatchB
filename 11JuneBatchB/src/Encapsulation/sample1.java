package Encapsulation;

public class sample1 {
	
private int a;
private int b;


sample1() {    // zero argument constructor
	
	a = 20;
	b = 30;
}

sample1(int c, int d) { // with argument constructor
	
	a = 25;
	b = 35;
}

public void test() {
	
	int c = a+b;
	System.out.println(c);
}










}
