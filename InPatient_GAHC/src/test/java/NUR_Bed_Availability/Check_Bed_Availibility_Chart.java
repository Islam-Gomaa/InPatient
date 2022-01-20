package NUR_Bed_Availability;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Check_Bed_Availibility_Chart {
	public void View_Bed_Availability(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Navigating to Ward Occupancy
		WebElement Ward_occupancy = driver.findElement(By.id("sd6"));
		Ward_occupancy.click();

		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		// driver.switchTo().frame(2);
		driver.switchTo().frame("content");
		driver.switchTo().frame("criteria");

		WebElement nursing_unit = driver.findElement(By.name("fr_nursing_unit_desc"));
		nursing_unit.sendKeys("A2IM");

		WebElement search = driver.findElement(By.name("search"));
		search.click();
		if (search.isEnabled()) {
			System.out.println("search button is enabled and functional");
		}
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		// driver.switchTo().frame(2);
		driver.switchTo().frame("content");
		driver.switchTo().frame("result");
		WebElement result = driver.findElement(By.xpath("//table/tbody/tr[2]/td"));

		if (result.isDisplayed()) {
			System.out.println("results are displayed");
		}

	}
}
