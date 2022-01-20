package TestCases;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import DOC_Cancel_Initiate_discharge.Cancel_Initiate_discharge;
import DOC_Cancel_Order.cancel_order;
import DOC_Change_Password.*;
import DOC_Discharge_Summary.*;
import DOC_IPD_OPConsultation.*;
import DOC_IPD_Refer_to_Admission.*;
import DOC_Initiate_discharge.*;
import DOC_Operation_Note.*;
import DOC_Pages.*;
import DOC_Place_Lab_Order.*;
import DOC_Place_Order.Place_Order;
import DOC_Place_Rad_Order.SelectForm;
import DOC_Place_panel_order.*;
import DOC_Prescribe_Medications.*;
import DOC_Progress_Notes.Progress_Notes;
import DOC_Save_as_draft_and_Submit_Discharge_summary.*;
import DOC_Save_as_draft_and_Submit_Progress_Notes.*;
import DOC_Save_as_draft_and_Submit_Progress_Notes.Submit_after_save_as_draft;
import DOC_Save_as_draft_and_Submit_operation_note.*;
import DOC_View_Clinical_Profile.Clinical_Profile;
import DOC_View_Medications.medications;
import DOC_View_Patient_list.View_Patient_list;
import DOC_View_Reports.View_Reports;
import DOC_View_Visit_Summary.Visit_Summary;
import Utilities.*;

public class GroupHP {
	WebDriver driver;

	// IP_TC_001_725_726_727_728_729_730_755

	@Test(dataProvider = "test_data", priority = 1)
	public void navigate_to_OP_consultation_form(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_SelectPatientIP select_patient = new DOC_SelectPatientIP();
		select_patient.selectpatientIP(driver, Patient_ID);

		SelectForm Form = new SelectForm();
		Form.select_form(driver);

		OP_consultation_form form = new OP_consultation_form();
		form.Physicians_consultation_Edge(driver);

		driver.quit();

	}

	// IP_TC_409_790_877_790

	@Test(dataProvider = "test_data", priority = 2)
	public void navigate_to_Place_panel_order(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_SelectPatientIP select_patient = new DOC_SelectPatientIP();
		select_patient.selectpatientIP(driver, Patient_ID);

		SelectForm Form = new SelectForm();
		Form.select_form(driver);

		Place_panel_order order = new Place_panel_order();
		order.Physicians_order_Edge(driver);

		driver.quit();
	}

	// IP_TC_693

	@Test(dataProvider = "test_data", priority = 3)
	public void navigate_to_Place_Lab_Order(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_SelectPatientIP select_patient = new DOC_SelectPatientIP();
		select_patient.selectpatientIP(driver, Patient_ID);

		SelectForm Form = new SelectForm();
		Form.select_form(driver);

		Place_Lab_Order order = new Place_Lab_Order();
		order.Physicians_order_Edge(driver);

		driver.quit();

	}

	// IP_TC_694

	@Test(dataProvider = "test_data", priority = 4)
	public void navigate_to_Place_Rad_Order(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_SelectPatientIP select_patient = new DOC_SelectPatientIP();
		select_patient.selectpatientIP(driver, Patient_ID);

		SelectForm Form = new SelectForm();
		Form.select_form(driver);

		Place_Lab_Order order = new Place_Lab_Order();
		order.Physicians_order_Edge(driver);

		driver.quit();

	}

	// IP_TC_697

	@Test(dataProvider = "test_data", priority = 5)
	public void navigate_to_Doctor_View_Reports(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_SelectPatientIP select_patient = new DOC_SelectPatientIP();
		select_patient.selectpatientIP(driver, Patient_ID);

		View_Reports view = new View_Reports();
		view.view(driver);

		driver.quit();

	}

	// IP_TC_714

	@Test(dataProvider = "test_data", priority = 6)
	public void navigate_to_Prescribe_Medications(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_SelectPatientIP select_patient = new DOC_SelectPatientIP();
		select_patient.selectpatientIP(driver, Patient_ID);

		SelectForm Form = new SelectForm();
		Form.select_form(driver);

		Prescribe_Medications order = new Prescribe_Medications();
		order.Physicians_Prescribe_Medications_Edge(driver);

		driver.quit();

	}

	// IP_TC_715

	@Test(priority = 7)
	public void navigate_to_login() {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		System.out.println("Doctor logged in on successfully and home page is displayed");

		driver.quit();
	}

	// IP_TC_721

	@Test(dataProvider = "test_data", priority = 8)
	public void navigate_to_Submit_Progress_Notes(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_SelectPatientIP select_patient = new DOC_SelectPatientIP();
		select_patient.selectpatientIP(driver, Patient_ID);

		SelectForm Form = new SelectForm();
		Form.select_form(driver);

		Progress_Notes note = new Progress_Notes();
		note.Physicians_progress_note_Edge(driver);

		driver.quit();

	}

	// IP_TC_722_723

	@Test(dataProvider = "test_data", priority = 9)
	public void navigate_to_Submit_after_save_as_draft_Progress_Notes(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_SelectPatientIP select_patient = new DOC_SelectPatientIP();
		select_patient.selectpatientIP(driver, Patient_ID);

		SelectForm Form = new SelectForm();
		Form.select_form(driver);

		Save_as_draft_Progress_Notes note = new Save_as_draft_Progress_Notes();
		note.Physicians_progress_note_Edge(driver);

		Submit_after_save_as_draft submit = new Submit_after_save_as_draft();
		submit.select_form(driver);

		driver.quit();

	}

	// IP_TC_733

	@Test(dataProvider = "test_data", priority = 10)
	public void navigate_to_submit_operation_note(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_SelectPatientIP select_patient = new DOC_SelectPatientIP();
		select_patient.selectpatientIP(driver, Patient_ID);

		SelectForm Form = new SelectForm();
		Form.select_form(driver);

		operation_note note = new operation_note();
		note.Physicians_operation_note_Edge(driver);

		driver.quit();
	}

	// IP_TC_734_735_736_737

	@Test(dataProvider = "test_data", priority = 11)
	public void navigate_to_Submit_after_save_as_draft_operation_note(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_SelectPatientIP select_patient = new DOC_SelectPatientIP();
		select_patient.selectpatientIP(driver, Patient_ID);

		SelectForm Form = new SelectForm();
		Form.select_form(driver);

		Save_as_draft_operation_note note = new Save_as_draft_operation_note();
		note.Physicians_operation_note_Edge(driver);

		Submit_after_save_as_draft submit = new Submit_after_save_as_draft();
		submit.select_form(driver);

		driver.quit();
	}

	// IP_TC_756_762_765

	@Test(dataProvider = "test_data", priority = 12)
	public void navigate_to_Refer_to_Admission(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_SelectPatientIP select_patient = new DOC_SelectPatientIP();
		select_patient.selectpatientIP(driver, Patient_ID);

		SelectForm Form = new SelectForm();
		Form.select_form(driver);

		Refer_to_Admission refer = new Refer_to_Admission();
		refer.Physicians_Refer_to_Admission_Edge(driver);

		driver.quit();
	}

	// IP_TC_766

	@Test(dataProvider = "test_data", priority = 13)
	public void navigate_to_Initiate_discharge(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		Initiate_discharge in = new Initiate_discharge();
		in.Initiate(driver, Patient_ID);

		driver.quit();
	}

	// IP_TC_767

	@Test(dataProvider = "test_data", priority = 14)
	public void navigate_to_Cancel_Initiate_discharge(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		Cancel_Initiate_discharge cancel = new Cancel_Initiate_discharge();
		cancel.cancel_initiate(driver, Patient_ID);

		driver.quit();
	}

	// IP_TC_770

	@Test(dataProvider = "test_data", priority = 15)
	public void navigate_to_Discharge_Summary(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_SelectPatientIP select_patient = new DOC_SelectPatientIP();
		select_patient.selectpatientIP(driver, Patient_ID);

		SelectForm Form = new SelectForm();
		Form.select_form(driver);

		Discharge_Summary summary = new Discharge_Summary();
		summary.Physicians_Discharge_Summary_Edge(driver);

		driver.quit();
	}

	// IP_TC_772_773

	@Test(dataProvider = "test_data", priority = 16)
	public void navigate_to_Submit_after_save_as_draft_Discharge_summary(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_SelectPatientIP select_patient = new DOC_SelectPatientIP();
		select_patient.selectpatientIP(driver, Patient_ID);

		SelectForm Form = new SelectForm();
		Form.select_form(driver);

		Save_as_draft_Discharge_summary note = new Save_as_draft_Discharge_summary();
		note.Physicians_Discharge_Summary_Edge(driver);

		Submit_after_save_as_draft submit = new Submit_after_save_as_draft();
		submit.select_form(driver);

		driver.quit();
	}

	// IP_TC_779_780

	@Test(priority = 17)
	public void navigate_to_Change_Password() {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		Login1_HP Login1 = new Login1_HP();
		Login1.login_Edge(driver);

		Change_Password Change = new Change_Password();
		Change.Change_Edge(driver);

		Logout_HP Logout = new Logout_HP();
		Logout.logout_Edge(driver);

		Login2_HP Login2 = new Login2_HP();
		Login2.login_Edge(driver);

		Rechange_Password rechange = new Rechange_Password();
		rechange.Change_Edge(driver);

		driver.quit();

	}

	// IP_TC_788

	@Test(dataProvider = "test_data", priority = 18)
	public void navigate_to_Place_Order(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_SelectPatientIP select_patient = new DOC_SelectPatientIP();
		select_patient.selectpatientIP(driver, Patient_ID);

		SelectForm Form = new SelectForm();
		Form.select_form(driver);

		Place_Order order = new Place_Order();
		order.Physicians_order_Edge(driver);

		driver.quit();
	}

	// IP_TC_789

	@Test(dataProvider = "test_data", priority = 19)
	public void navigate_to_cancel_order(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_SelectPatientIP select_patient = new DOC_SelectPatientIP();
		select_patient.selectpatientIP(driver, Patient_ID);

		cancel_order cancel = new cancel_order();
		cancel.cancel(driver);

		driver.quit();
	}

	// IP_TC_791_792

	@Test(dataProvider = "test_data", priority = 20)
	public void navigate_to_view_Clinical_Profile(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_SelectPatientIP select_patient = new DOC_SelectPatientIP();
		select_patient.selectpatientIP(driver, Patient_ID);

		Clinical_Profile view = new Clinical_Profile();
		view.select_form(driver);

		driver.quit();
	}

	// IP_TC_793

	@Test(dataProvider = "test_data", priority = 21)
	public void navigate_to_View_Reports(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_SelectPatientIP select_patient = new DOC_SelectPatientIP();
		select_patient.selectpatientIP(driver, Patient_ID);

		View_Reports view = new View_Reports();
		view.view(driver);

		driver.quit();
	}

	// IP_TC_794

	@Test(dataProvider = "test_data", priority = 22)
	public void navigate_to_view_medications(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_SelectPatientIP select_patient = new DOC_SelectPatientIP();
		select_patient.selectpatientIP(driver, Patient_ID);

		medications view = new medications();
		view.select_form(driver);

		driver.quit();
	}

	// IP_TC_795

	@Test(dataProvider = "test_data", priority = 23)
	public void navigate_to_View_Visit_Summary(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_SelectPatientIP select_patient = new DOC_SelectPatientIP();
		select_patient.selectpatientIP(driver, Patient_ID);

		Visit_Summary view = new Visit_Summary();
		view.select_form(driver);

		driver.quit();

	}

	// IP_TC_796

	@Test(dataProvider = "test_data", priority = 24)
	public void navigate_to_View_Patient_list(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		View_Patient_list list = new View_Patient_list();
		list.list(driver);

		driver.quit();

	}

	@AfterTest
	public void close_browser() {
//		driver.close();
	}

	@DataProvider
	public String[][] test_data() throws InvalidFormatException, IOException {

		read_excel_data_HP obj = new read_excel_data_HP();
		return obj.read_sheet();
	}

}
