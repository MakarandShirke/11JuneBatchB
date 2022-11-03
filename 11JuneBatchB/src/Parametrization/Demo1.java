package Parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		
	 FileInputStream file = new FileInputStream("D:\\Selenium Parameter\\Demo Parameterization.xlsx");
	 
	 String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
	 
	 System.out.println(data);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
