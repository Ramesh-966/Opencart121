package SampleProgrammes;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriventesting {
	public static void main(String[] args) throws Exception {
		File file = new File("./testData//employee_data.xlsx");
		FileInputStream fis=new FileInputStream(file); 
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		//System.out.println(rowcount);
		for(int i=0;i<=rowcount;i++) {
			XSSFRow row=sheet.getRow(i);
			int cellcount=row.getLastCellNum();
			//System.out.println(cellcount);
			for(int j=0;j<cellcount;j++) {
				XSSFCell cell=row.getCell(j);
				System.out.print(cell+" ");
			}
			System.out.println("");
		}
		wb.close();
	}
}
