package testingcheckandradiobutoons;

import java.util.List;

import javax.swing.ListCellRenderer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testinallradios {


public void radioselect(String reqcar) {
	
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://www.letskodeit.com/practice");
List<WebElement> allradios=driver.findElements(By.xpath("//input[@type='radio']"));
for(WebElement radio:allradios)
{
String cars=radio.getAttribute("Value");//
if(cars.equalsIgnoreCase(reqcar))
{
radio.click();
break;
}	
}
}
public static void main(String[] args) {
	testinallradios test=new testinallradios();
	test.radioselect("honda");
}	
}
	

