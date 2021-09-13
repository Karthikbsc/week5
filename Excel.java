package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static String[][] excelData(String sheetName) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("D:\\Maven\\MavenProject\\Data\\CreatLead.xlsx");

		XSSFSheet sheet = wb.getSheet(sheetName);
		int lastRowNum = sheet.getLastRowNum();
		System.out.println(lastRowNum);
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(lastCellNum);
		String [][] data = new String [lastRowNum][lastCellNum]; 
		for (int i = 1; i <= lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {

				String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(cellValue);
				
				data[i-1][j] = cellValue;
				
			}
		}
		wb.close();
		return data;
	}

}
