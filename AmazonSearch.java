package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
        // open amazon page
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		// input on search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 16");
		
		// sendkeys - input  text on element 
		// driver.findElement(By.name("field-keywords"))
		
		 driver.findElement(By.id("nav-search-submit-button")).click();
		

	}

}
