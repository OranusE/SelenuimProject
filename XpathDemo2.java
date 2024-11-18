package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "https://www.orangehrm.com/en/book-a-free-demo";
		
    	WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='Form_getForm_FullName']")).sendKeys("Oranus");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("oran@wtm.com");
		driver.findElement(By.xpath("//*[@name='CompanyName']")).sendKeys("WMAHS");

	}

}
