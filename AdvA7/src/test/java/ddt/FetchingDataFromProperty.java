package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromProperty {

	public static void main(String[] args) throws IOException {
		
		//1)Create a FileInputStream obj
		FileInputStream fis= new FileInputStream("./src/test/resources/prop.properties");
		
		//2)Create a property file obj
		Properties p= new Properties();
		
		//3)load file
		p.load(fis);
		
		//4)fetch the data
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("usn"));
		System.out.println(p.getProperty("pwsd"));
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
//		String Url = p.getProperty("url");
//		driver.get(Url);
		driver.get(p.getProperty("url"));
	}
}
