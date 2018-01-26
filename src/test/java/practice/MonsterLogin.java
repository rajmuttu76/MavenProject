package practice;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MonsterLogin {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.monsterindia.com/");
		String parent=driver.getWindowHandle();
		
		Set<String> allwh=driver.getWindowHandles();
		allwh.remove(parent);
		for(String s:allwh)
		{
			driver.switchTo().window(s);
			driver.close();
		}
		
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[.='Sign In']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='username_login']")));
		
		driver.findElement(By.xpath("//input[@id='username_login']")).sendKeys("mutturajgowd1025@gmail.com");
		
	driver.findElement(By.xpath("//input[@id='passwd_temp']")).sendKeys("ckmr1025");
	driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		
	driver.navigate().refresh();
	
	
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='http://my.monsterindia.com/view_resume.html#u_resume']")));
	driver.findElement(By.xpath("//a[@href='http://my.monsterindia.com/view_resume.html#u_resume']")).click();
	
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='#edit_resume']")));
		driver.findElement(By.xpath("//a[@href='#edit_resume']")).click();
		driver.findElement(By.xpath("//input[@type='file']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("wordresume")));
		WebElement choose=driver.findElement(By.id("wordresume"));
		
choose.click();

		Runtime.getRuntime().exec("C:\\Users\\muttu\\Desktop\\monster.exe");
		
	
		Thread.sleep(3000);
		
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='submit'])[2]")));


		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();		
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='mnuser_avatar']")));
	Thread.sleep(3000);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,-500)");
	
	driver=(WebDriver) js;
	
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//img[contains(@src,'user_upload')])[1]")));
//	WebElement logout=driver.findElement(By.xpath("(//img[contains(@src,'user_upload')])[1]"));				
//	Actions act=new Actions(driver);
//	
//	act.moveToElement(logout).perform();
//	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[.='Logout']")));
driver.findElement(By.xpath("//a[.='Logout']")).click();
		driver.close();
		
	}

}
