package utilsLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws IOException {

		// Reading the data from the ExcelSheet

		// Create object of File Class passing File path
		File f = new File("C:\\Users\\rushi\\Documents\\BugSpotter\\Student_Data.xlsx");

		// Convert File into the FileInputStream
		FileInputStream fis = new FileInputStream(f);

		// Create object of XSSFWorkbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// Select the second sheet from excel
		XSSFSheet sheet = workbook.getSheetAt(1);

		// Capturing Ram as value from Excel
		String cellValue = sheet.getRow(1).getCell(1).getStringCellValue();

		System.out.println("Name of First Student is = " + cellValue);

		// Fetch row count

		int row = workbook.getSheetAt(1).getLastRowNum();

		row = row + 1;

		System.out.println("Row Count = " + row);

		// Fetch the column count
		int col = sheet.getRow(1).getLastCellNum();

		System.out.println("Column Count = " + col);

		System.out.println("Execution Completed");

	}

}
