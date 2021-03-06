package TestCases;

import NUR_Place_Order.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DOC_Approve_Order.*;

public class IP_TC_633_751_752_753 {

	WebDriver driver;

	@BeforeTest
	public void setup() {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();
	}

	@Test
	public void navigate_to_login() {

		NUR_Login_HP NUR_Login = new NUR_Login_HP();
		NUR_Login.login_Edge(driver);

		NUR_SelectPatientIP patient = new NUR_SelectPatientIP();
		patient.selectpatientIP_Edge(driver);

		NUR_SelectForm Form = new NUR_SelectForm();
		Form.select_form(driver);

		NUR_Place_Order Nur_order = new NUR_Place_Order();
		Nur_order.Nurse_order_Edge(driver);

		NUR_Logout_HP logout = new NUR_Logout_HP();
		logout.logout_Edge(driver);

		DOC_Login_HP DOC_Login = new DOC_Login_HP();
		DOC_Login.login_Edge(driver);

		DOC_approve_Order approve = new DOC_approve_Order();
		approve.Physicians_approve_Edge(driver);
	}

//	@AfterTest
//	public void close() {
//		
//	}
}
