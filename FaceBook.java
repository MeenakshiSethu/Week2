package week2.day1;

import org.openqa.selenium.By;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Meenakshi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sethuraman");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sethu.meenakshi@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("sethu.meenakshi@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("sairam");
		
		WebElement ele4 = driver.findElement(By.xpath("//select[@aria-label='Day']"));
	    Select dropdown1 = new Select(ele4);
	    dropdown1.selectByValue("9");
	    
	    WebElement ele1 = driver.findElement(By.xpath("//select[@aria-label='Month']"));
	    Select dropdown2 = new Select(ele1);
	    dropdown2.selectByIndex(8);
	    
	    WebElement ele2 = driver.findElement(By.xpath("//select[@aria-label='Year']"));
	    Select dropdown3 = new Select(ele2);
	    dropdown3.selectByVisibleText("1989");
	    
	    driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
	    driver.findElement(By.name("websubmit")).click();
	    
		
	}

}

