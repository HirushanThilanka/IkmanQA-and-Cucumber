package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ikmanTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ikman.lk/");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div/div[1]/div[2]/a/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/form/div/div[3]/div/ul/li/ul[1]/li/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/form/div/div[4]/div/ul/li/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/form/div/div[6]/a/span")).click();
		driver.findElement(By.id("filters[0][minimum]")).sendKeys("5000000");
		driver.findElement(By.id("filters[0][maximum]")).sendKeys("7500000");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/form/div/div[6]/div/div[2]/div/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/form/div/div[8]/a/span")).click();
		driver.findElement(By.id("filters2values-3")).click();
		
		String adCount = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/form/div/div[8]/div/ul/li[3]/a/span")).getText();
		System.out.println("No of Ads Found " + adCount);
		
		List<WebElement> elements = driver.findElements(By.cssSelector("item-content < item-info"));
		for (WebElement element : elements) {
		   System.out.println(element.getText());  
		 }
	}

}
