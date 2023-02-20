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


@Test
public class Datareadxl {
	
	
public static	Map<String, String>hasMap1= new HashMap<String, String>();
	
	
	
	public void raddataxl() throws IOException {
		
		FileInputStream ip = new FileInputStream("D:\\testData\\CFTestData.xlsx");
		
		Workbook wb = new XSSFWorkbook(ip);
		
		Sheet sheet = wb.getSheet("TestData");
		
        int rowcount=sheet.getLastRowNum();
        
        System.out.println(rowcount);
        
        int columncount = sheet.getRow(0).getLastCellNum()-1;
          System.out.println(columncount);
          
          
          for (int i=1; i<=rowcount; i++) {//row count is 4
         
          for(int j=0; j<=columncount;j++) {//column count is 2
        	  
      
       Cell columheader=   sheet.getRow(0).getCell(j);
 
       String columnvalues=columheader.toString();
    
   
     Cell rowvalues= sheet.getRow(i).getCell(j);
   
     String rowvalues1=rowvalues.toString();
     
     hasMap1.put(columnvalues, rowvalues1);
     
    
        	         	  
          }
		
          System.out.println(hasMap1);
	}

	}
}
