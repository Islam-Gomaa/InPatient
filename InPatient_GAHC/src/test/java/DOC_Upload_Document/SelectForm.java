package DOC_Upload_Document;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectForm {
	public void select_form(WebDriver driver) {

		try {

			Thread.sleep(4000);

			// Click on Action
			By Action = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/div/div/div[2]/div/div[6]");
			driver.findElement(Action).click();
			
			Thread.sleep(10000);
			
			// Select Upload_Document
			By Upload_Document = By.xpath("//*[@id=\"popover-content\"]/div/p");
			driver.findElement(Upload_Document).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(SelectForm.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
