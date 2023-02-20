package apachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = ".\\xlfolder\\testdata.xlsx";
		
		FileInputStream inputstream = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		
	XSSFSheet sheet=	workbook.getSheet("Sheet1");
	
int lastrow=	sheet.getLastRowNum();

System.out.println("print the rows"+lastrow);
		
		
		
		

	}

}
