package MethodConstructor;

import java.util.Scanner;

public class Scan1 {
	
	public static void  main(String[] arg) {
			
			Scanner Demo = new Scanner(System.in);  //scanner class object
			
			System.out.println("Entre integer value");
			int value = Demo.nextInt();
			System.out.println("Your entered value is "+value);
			
			System.out.println("Entre Float Value");
		    float value1 = Demo.nextFloat();
			System.out.println("Youe entered value is "+value1);
			
			System.out.println("Ente the String");
			String value2 = Demo.next();
			System.out.println("Your entered value is "+value2);
			
			Demo.close();
	}
			

}
