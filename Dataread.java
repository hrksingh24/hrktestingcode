package apachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Dataread {
	
public static	Map<String, String> hasMap= new HashMap<String, String>();


//Cell rowvalue=	sheet.getRow(0).getCell(i);
//String rowdata=rowvalue.toString();
//System.out.println(rowdata);
	
	
	
	@Test
	public void read() throws IOException {
		
		FileInputStream ip = new  FileInputStream("D:\\testData\\floKs.xlsx");
		
		Workbook wb = new XSSFWorkbook(ip);
		
	    Sheet sheet=	wb.getSheet("Guys");
	    
	    
	//for loop 1st iteration we should take row count along with that we know how many rows ther
	int rowcount= sheet.getLastRowNum();
	System.out.println(rowcount);
	
	
	
	// for 2nd loop for iteration we need this also to know how many header columns availble
int columtcount=sheet.getRow(0).getLastCellNum()-1;
System.out.println(columtcount);

for(int i=1; i<=rowcount; i++) {

	
for (int j=0; j<=columtcount; j++)	{
	
	
Cell keycell=sheet.getRow(0).getCell(j);//====>>>>> key==> header objects
String keycell1=keycell.toString();



Cell cellvalues=sheet.getRow(i).getCell(j);
String cellvalu2=cellvalues.toString();
	
hasMap.put(keycell1, cellvalu2);


	
}
	
System.out.println(hasMap);

}


	}

}
