package study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewTest1 {
	WebDriver driver;
  @Test
  public void f() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\snand\\Downloads\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("http://uitestpractice.com/");
      driver.manage().window().maximize();
      
      driver.findElement(By.xpath("//a[@href = '/Students/Switchto']")).click();
     driver.findElement(By.id("alert")).click();
      
       WebDriverWait wait = new WebDriverWait(driver,30);
       wait.until(ExpectedConditions.alertIsPresent());
       Alert a1 = driver.switchTo().alert();
       a1.accept();
       
       driver.switchTo().frame("iframe_a");
       
       driver.findElement(By.id("name")).sendKeys("nandu");
       
       
       
       driver.findElement(By.linkText("cpens in a new window")).click();
       driver.findElement(By.linkText("Select")).click();
       driver.close();
         
	  
	  
	  
  }
}
