package Demo;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchURL {


public static void main (String [] args) {

WebDriver driver = new ChromeDriver();

driver.get("https://www.google.com/");

String expectedTitle = "Google";

String actualTitle = driver.getTitle();

if (actualTitle.equals(expectedTitle))

{

System.out.println ("TC is passed - Title is matched");

}

else

{

System.out.println("Title is not matched");

}

}

}
