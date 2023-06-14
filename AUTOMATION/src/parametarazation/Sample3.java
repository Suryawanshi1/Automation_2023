package parametarazation;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample3 {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\Desktop\\Exel.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("TestData");
		     int rowSize = sh.getLastRowNum();
		   //  System.out.println(rowSize);
		     for(int i=0;i<=rowSize;i++) {
		    	double data = sh.getRow(i).getCell(6).getNumericCellValue();
		    	System.out.println(data);
		    	 
		     }
	}

}
//print column 