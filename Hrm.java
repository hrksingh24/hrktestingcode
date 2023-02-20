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

public class Hrm {
	
	Map<String, String> haMap = new HashMap<String, String>();
	
	@Test
	public void hrmdata() throws IOException {
		
		
		
		FileInputStream fis = new FileInputStream("D:\\testData\\floKs.xlsx");
		
		Workbook workbook = new XSSFWorkbook(fis);
		
		Sheet sheet = workbook.getSheet("Hrm");
		
        int rowcounts=sheet.getLastRowNum();

        System.out.println(rowcounts);
        
        int columncout=sheet.getRow(0).getLastCellNum()-1;
        
        System.out.println(columncout);
        
        //OUTER FOR LOOP ROW INCREMENT
        for(int i=1; i<=rowcounts; i++) {
        	
        	//INNER FOR LOOP COLOUMN INCREMENT
        	for (int j=0; j<=columncout; j++) {
        	
        		
        		
       Cell rowkey= sheet.getRow(0).getCell(j);
     //J IS 0 AND 0<=2 AND IT TAKES USERNAME
		//J IS 1 AND 1<=2 AND IT TAKES PASSWORD
       //J IS 2 AND 2<=2 LOOP BREAK
   
        String rowk=  rowkey.toString();
        
      //  System.out.println(rowk);
        
        
 Cell columnvalue=sheet.getRow(i).getCell(j);
 
 //1 ROW >> 
 
 
 String colval=columnvalue.toString();
 
// System.out.println(colval);
 
       haMap.put(rowk, colval);
 
      
        	}
        	System.out.println(haMap);
        }
        
    
        
		
    
    
    
	}
	

}
