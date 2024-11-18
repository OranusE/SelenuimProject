package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String url = "https://www.orangehrm.com/en/contact-sales";
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement NumberofEmployees = driver.findElement(By.id("Form_getForm_NoOfEmployees"));
		
		Select dropdownNumberofEmployees = new Select(NumberofEmployees);
		
		dropdownNumberofEmployees.selectByValue("0 - 10");
		
		
			
		

	}

}
