package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//1)fileInputStream object
		FileInputStream fis= new FileInputStream("./src/test/resources/exceldata.xlsx");
		
		//2)workbook object
		Workbook wb= WorkbookFactory.create(fis);
		
		//3)fetching values
	//	System.out.println(wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue());
		//System.out.println(wb.getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue());
	//	System.out.println(wb.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue());
	//	System.out.println(wb.getSheet("Sheet1").getRow(3).getCell(3).getBooleanCellValue());
		
		Cell cell1 = wb.getSheet("Sheet1").getRow(0).getCell(0);
		Cell cell2 = wb.getSheet("Sheet1").getRow(2).getCell(1);
		Cell cell3 = wb.getSheet("Sheet1").getRow(3).getCell(3);
	//	Cell cell4 = wb.getSheet("Sheet1").getRow(5).getCell(1);
		DataFormatter data= new DataFormatter();
		System.out.println(data.formatCellValue(cell1));
		System.out.println(data.formatCellValue(cell2));
		System.out.println(data.formatCellValue(cell3));
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		String url = wb.getSheet("Sheet1").getRow(5).getCell(1).getStringCellValue();
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		String email = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.id("Email")).sendKeys(email);
		
	}
}
