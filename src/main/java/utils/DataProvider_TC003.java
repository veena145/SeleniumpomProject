package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProvider_TC003 {
	//@Test
@DataProvider(name="testcase3")
	public static String[][] getData() throws IOException{
		FileInputStream fis = new FileInputStream("./TestData/TC003.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rc = sheet.getLastRowNum();
		int cc = sheet.getRow(0).getLastCellNum();
		String[][] testdata = new String[rc][cc];

		for (int i = 1; i <= rc; i++) {
			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < cc; j++) {
				String data = row.getCell(j).getStringCellValue();
				testdata[i-1][j] = data;
				System.out.println("Row = "+(i-1)+" column = "+j+" data = "+data);
		
			}
		}
		
return testdata;
	}

}
