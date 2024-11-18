package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException { //it is because the thread is not working
		// TODO Auto-generated method stub
		
		String url = "https://demo.guru99.com/test/delete_customer.php";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("102992");
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		
		// alert is generated
		
		Thread.sleep(2000);  // this is not necessary, it is just to slowdown the execution 
		
		String alertText = driver.switchTo().alert().getText();
		String expectedText = "Do you really want to delete this Customer?";
		System.out.println(alertText);
		
		if(alertText.equals(expectedText))
		{
			System.out.println(" TC 01 - Pass : Text on Alert is matched");
		
		}
		else 
		{
			System.out.println(" TC 01 - Failed : Text on Alert is not matched");
		}
		
		driver.switchTo().alert().dismiss();
		// it will click on cancel button on alert 
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		
		driver.switchTo().alert().accept(); // it will click on ok button
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept(); // second confirmation alert click on Ok
		
		
		System.out.println("Alert is closed by clicking ok button");
		

	}

}
