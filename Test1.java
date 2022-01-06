package Testing;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp-pc\\Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.arisglobal.com/";
		
		//Navigating to url
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.xpath("//h1[text()='Intelligent Cloud Software for Life Sciences R&D']")).getText());
		//driver.findElement(By.cssSelector("a.request-demo-btn")).click();
		//driver.findElement(By.xpath("//a[@href='https://www.arisglobal.com/demo-request']")).click();
		driver.findElement(By.xpath("//*[@href='https://www.arisglobal.com/demo-request']")).click();
		driver.navigate().back();
		JavascriptExecutor js = (JavascriptExecutor) driver;   
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.id("home-hero-cta")).click();
		driver.close();
		
	}

}
