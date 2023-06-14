package parametarazation;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample4 {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\Desktop\\Exel.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("TestData");
		     int rowSize = sh.getLastRowNum();
		   //  System.out.println(rowSize);
		     for(int i=2;i<=rowSize;i++) {
		    	double data = sh.getRow(i).getCell(7).getNumericCellValue();
		    	System.out.println(data);
		    	 
	}

}
}