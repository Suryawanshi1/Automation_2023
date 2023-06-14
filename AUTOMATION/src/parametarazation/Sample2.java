package parametarazation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample2 {
  public static void main(String[] args) throws IOException {
	  FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\Exel.xlsx");
	   Sheet sh = WorkbookFactory.create(file).getSheet("TestData");
	   // print row data
	    short cellsize = sh.getRow(3).getLastCellNum();
	    for (int i = 0;i<=cellsize-1;i++) {
	    	String data = sh.getRow(3).getCell(i).getStringCellValue();
	    	System.out.println(data);
	    	
	    	
	    }
	
}
}
