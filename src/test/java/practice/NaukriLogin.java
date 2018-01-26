package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class NaukriLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--start-maximized");
//		WebDriver driver=new ChromeDriver(options);
//		WebDriverWait wait=new WebDriverWait(driver,10);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
		WebDriver driver=new FirefoxDriver();	
		driver.get("https://www.naukri.com/");
		String wh=driver.getWindowHandle();
		Set<String> allwh=driver.getWindowHandles();
		allwh.remove(wh);
		
		for(String s:allwh)
		{
		
				driver.switchTo().window(s);
				driver.close();
	    }
		driver.switchTo().window(wh);
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='mTxt' and .='Login']")));
			driver.findElement(By.xpath("//div[@class='mTxt' and .='Login']")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='email']")));
		
		WebElement un=driver.findElement(By.xpath("//input[@name='email']"));
		un.sendKeys("mutturajgowd1025@gmail.com");
		
		
		driver.findElement(By.xpath("//input[@id='pLogin']")).sendKeys("ckmr1025");
	    driver.findElement(By.xpath("//button[@type='submit' and @value='Login']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//b[.='View and Update Profile']")));
		
		
		driver.findElement(By.xpath("//b[.='View and Update Profile']")).click();
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[.='Upload New Resume']")));
		driver.findElement(By.xpath("//a[.='Upload New Resume']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='attachCV']")));
		
		driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("C:\\Users\\muttu\\Desktop\\mutturaj_testing.docx");
		
    Thread.sleep(2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//b[.='Save'])[1]")));
		
		driver.findElement(By.xpath("(//b[.='Save'])[1]")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='topIcon user']")));
		
		WebElement mynaukri=driver.findElement(By.xpath("//div[@class='topIcon user']"));
		
Actions act=new Actions(driver);
		
		act.moveToElement(mynaukri).perform();
		
		driver.findElement(By.xpath("//a[.='Log Out']")).click();
		
		
		
		driver.close();
	
	}

}
