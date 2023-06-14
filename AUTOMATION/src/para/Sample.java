package para;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample {
	public static void main(String[] args) throws IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\HP\\Desktop\\Exel.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("TestData");
		
		//Read string data
		String data = sh.getRow(3).getCell(1).getStringCellValue();
		System.out.println(data);
		//Read numeric data
		double data1 = sh.getRow(4).getCell(6).getNumericCellValue();
		System.out.println(data1);
		  int a=(int) data1;
		  System.out.println(a);
		  //Read boolean data
		 boolean data2 = sh.getRow(0).getCell(2).getBooleanCellValue();
		 System.out.println(data2);
		 //how many row in the sheet
		int rowsize = sh.getLastRowNum();
		System.out.println(rowsize+1);
		//how many cell or column in the sheet
		short cellsize1 = sh.getRow(2).getLastCellNum();
		System.out.println(cellsize1);
		
		//print the row
		 short cellsize=sh.getRow(3).getLastCellNum();
		 for(int i=0;i<=cellsize-1;i++) {
			
			String data4 = sh.getRow(3).getCell(i).getStringCellValue();
			System.out.print(data4 +"  ");
			 
		 }
		 //print the cell
		int row = sh.getLastRowNum();
		for(int j=0;j<=row;j++) {
			double cell = sh.getRow(j).getCell(6).getNumericCellValue();
			System.out.println(cell);
			
		}
			
		
		
	}

}
