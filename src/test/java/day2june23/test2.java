package day2june23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dista.ai");
		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Thread.sleep(2000l);
		

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,1500);", "");

		Thread.sleep(3000l);

		WebElement ele = driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-23052056 elementor-widget elementor-widget-counter']//div/span[2]"));
		WebElement ele1 = driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-23052056 elementor-widget elementor-widget-counter']//div/span[3]"));
		
		
		System.out.println("1st text: "+ele.getText() + ele1.getText());

		driver.quit();
		}
	}




