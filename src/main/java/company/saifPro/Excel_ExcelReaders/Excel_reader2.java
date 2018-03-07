package company.saifPro.Excel_ExcelReaders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.ReporterConfig.Property;

public class Excel_reader2 {
	
	public static final Logger logger = Logger.getLogger(Excel_reader2.class.getName());

	
	
	private void getExcelData(String excellocation, String sheetName) throws IOException {	
		
		PropertyConfigurator.configure("log4j.properties");
		
		logger.info("Staring Excel Reader2 file"+excellocation);
		
		FileInputStream fis = new FileInputStream(new File(excellocation));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(sheetName);
		int row_num = sh.getLastRowNum();
		int col_num = sh.getRow(0).getLastCellNum();
		
		logger.info("No. of row  "+row_num +"and No. of Col " +col_num);
		
		String[][] data = new String[row_num][col_num];
		
		Iterator<Row> itr = sh.rowIterator();
		
		int i =0;
		int k=0;
		
		while(itr.hasNext())
		{
			

			Row row1 = itr.next();
			
			if(i++!=0)
			{
			Iterator<Cell> itc = row1.cellIterator();

			int l=0;
			
			while(itc.hasNext())
			{
				
				
				Cell cell1 = itc.next();
				
				data[k][l++]=cell1.getStringCellValue();
				
				System.out.print(cell1 +" ");
				
			}
		
			k++;
			System.out.println();
		}
		}
		
		System.out.println("Readind data from Array");
		
		for(int m=0;m<data.length;m++)
		{
			
			for(int n=0;n<data[m].length;n++)
			{
				
				System.out.print(data[m][n]+ " ");;
				
				new BigDecimal(0);
			}
			
			System.out.println();
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		String excellocation = System.getProperty("user.dir")+"/src/main/java/company/saifPro/TestData/TestData.xlsx";
		String sheetName = "LoginTestData";
		Excel_reader2 excel = new Excel_reader2();
		excel.getExcelData(excellocation, sheetName);

	}

	
}
