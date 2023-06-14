package parametarazation;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample5 {
	public static void main(String[] args) throws IOException {
		FileInputStream file =new FileInputStream("C:\\Users\\HP\\Desktop\\Exel.xlsx");
	  Sheet sh = WorkbookFactory.create(file).getSheet("TestData");
	     CellType ct = sh.getRow(0).getCell(3).getCellType();
	     System.out.println(ct);
	     
	     
	     //celltype
	  
	  
	  
	  
	  
	  
	}

}
