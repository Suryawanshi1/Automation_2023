package parametarazation;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample1 {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\Exel.xlsx");
		   Sheet sh = WorkbookFactory.create(file).getSheet("TestData");
		   //String read
		 String data1 = sh.getRow(0).getCell(0).getStringCellValue();
		 System.out.println(data1);
		  String data2 = sh.getRow(0).getCell(4).getStringCellValue();
		  System.out.println(data2);
		  String data3 = sh.getRow(2).getCell(5).getStringCellValue();
		 System.out.println(data3);
		String data = sh.getRow(0).getCell(3).getStringCellValue();
		System.out.println(data);
		 //numeric value read
		 double data4 = sh.getRow(0).getCell(1).getNumericCellValue();
				 System.out.println(data4);
				 int i=(int)data4;//convert double to int
				 System.out.println(i);
				 //boolean value read
				 boolean data5 = sh.getRow(0).getCell(2).getBooleanCellValue();
				 System.out.println(data5);
				 //number of rows present in the sheet
				 int rowsize = sh.getLastRowNum();
				 System.out.println(rowsize+1);
				 //column read
				 short cellsize = sh.getRow(0).getLastCellNum();
				 System.out.println(cellsize);
		 
		 
	}  

}
