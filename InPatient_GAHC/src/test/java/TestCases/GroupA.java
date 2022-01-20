package TestCases;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;
import CMO_AssignBed_MarkPatientArrival.*;
import CMO_Cancel_Admission.*;
import CMO_Pages.*;
import NUR_Bed_Availability.*;
import NUR_Block_Bed.*;
import NUR_Intra_Ward_Patient_Transfer.*;
import NUR_Newborn_Registration_For_Patient.*;
import NUR_Pages.*;
import NUR_Release_Blocked.*;
import NUR_Transfer_Bulk_practitioner.*;
import NUR_Transfer_Patient_In.*;
import NUR_Transfer_Patient_Out.*;
import NUR_Transfer_Practitioner.*;
import Utilities.*;

public class GroupA {
	WebDriver driver;

	// IP_TC_188_197_218

	@Test(dataProvider = "test_data", priority = 2)
	public void navigate_to_Verify_Assign_Bed_UI(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		CMO_Login_EM login = new CMO_Login_EM();
		login.login(driver);

		CMO_Select_Form form = new CMO_Select_Form();
		form.select_form(driver);

		Assign_Bed_Verify_Encounter_ID_hyperlink_is_working bed = new Assign_Bed_Verify_Encounter_ID_hyperlink_is_working();
		bed.assign_bed(driver, Patient_ID);

	}

	// IP_TC_270

	@Test(dataProvider = "test_data", priority = 3)
	public void navigate_to_Assign_Bed_Mark_Patient_Arrival(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		CMO_Login_EM login = new CMO_Login_EM();
		login.login(driver);

		CMO_Select_Form form = new CMO_Select_Form();
		form.select_form(driver);

		Assign_Bed_Mark_Patient_Arrival bed = new Assign_Bed_Mark_Patient_Arrival();
		bed.assign_bed(driver, Patient_ID);

//		driver.close();

	}

	// IP_TC_577

	@Test(dataProvider = "test_data", priority = 4)
	public void navigate_to_Nurse_Check_Intra_Ward_Patient_Transfer_UI(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Check_Intra_Ward_Patient_Transfer_UI UI = new Nurse_Check_Intra_Ward_Patient_Transfer_UI();
		UI.transfer(driver, Patient_ID);

//		driver.close();

	}

	// IP_TC_578

	@Test(priority = 5)
	public void navigate_to_Nurse_Search_Intra_Ward_Patient_Transfer_by_Nursing_Unit() {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Search_Intra_Ward_Patient_Transfer_by_Nursing_Unit search = new Nurse_Search_Intra_Ward_Patient_Transfer_by_Nursing_Unit();
		search.transfer(driver);

		driver.close();

	}

	// IP_TC_579

	@Test(priority = 6)
	public void navigate_to_Nurse_Search_Intra_Ward_Patient_Transfer_by_Patient_ID(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Search_Intra_Ward_Patient_Transfer_by_Patient_ID search = new Nurse_Search_Intra_Ward_Patient_Transfer_by_Patient_ID();
		search.transfer(driver, Patient_ID);

		driver.close();

	}

	// IP_TC_580

	@Test(priority = 7)
	public void navigate_to_Nurse_Search_Intra_Ward_Patient_Transfer_by_Specialty() {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Search_Intra_Ward_Patient_Transfer_by_Specialty search = new Nurse_Search_Intra_Ward_Patient_Transfer_by_Specialty();
		search.transfer(driver);

//		driver.close();

	}

	// IP_TC_581

	@Test(priority = 8)
	public void navigate_to_Nurse_Search_Intra_Ward_Patient_Transfer_by_Encounter_ID() {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Search_Intra_Ward_Patient_Transfer_by_Encounter_ID search = new Nurse_Search_Intra_Ward_Patient_Transfer_by_Encounter_ID();
		search.transfer(driver);

		driver.close();

	}

	// IP_TC_582

	@Test(priority = 9)
	public void navigate_to_Nurse_Search_Intra_Ward_Patient_Transfer_by_Admission_Date() {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Search_Intra_Ward_Patient_Transfer_by_Admission_Date search = new Nurse_Search_Intra_Ward_Patient_Transfer_by_Admission_Date();
		search.transfer(driver);

		driver.close();

	}

	// IP_TC_583

	@Test(priority = 10)
	public void navigate_to_Nurse_Search_Intra_Ward_Patient_Transfer_by_Practitioner() {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Search_Intra_Ward_Patient_Transfer_by_Practitioner search = new Nurse_Search_Intra_Ward_Patient_Transfer_by_Practitioner();
		search.transfer(driver);

		driver.close();

	}

	// IP_TC_584

	@Test(dataProvider = "test_data", priority = 11)
	public void navigate_to_Transfer_patients_within_the_same_nursing_unit(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Transfer_patients_within_the_same_nursing_unit trans = new Nurse_Transfer_patients_within_the_same_nursing_unit();
		trans.transfer(driver, Patient_ID);

//		driver.close();

	}

	// IP_TC_591

	@Test(dataProvider = "test_data", priority = 12)
	public void navigate_to_Nurse_Check_Transfer_Patient_Out_UI(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Check_Transfer_Patient_Out_UI UI = new Nurse_Check_Transfer_Patient_Out_UI();
		UI.transfer(driver, Patient_ID);

		driver.close();

	}

	// IP_TC_598

	@Test(dataProvider = "test_data", priority = 13)
	public void navigate_to_Nurse_Transfer_patients_to_another_nursing_unit(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Transfer_patients_to_another_nursing_unit trans = new Nurse_Transfer_patients_to_another_nursing_unit();
		trans.transfer(driver, Patient_ID);

		driver.close();

	}

	// IP_TC_847

	@Test(dataProvider = "test_data", priority = 14)
	public void navigate_to_Nurse_Receive_Patient_from_another_Nursing_Unit(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Receive_Patient_from_another_Nursing_Unit trans = new Nurse_Receive_Patient_from_another_Nursing_Unit();
		trans.transfer(driver, Patient_ID);

		driver.close();

	}

	// IP_TC_664

//	@Test(priority = 15)
//	public void navigate_to_Nurse_Newborn_Registration_for_inpatient_UI() {
//
//		// System Property for IE Driver
//		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
//		System.setProperty("webdriver.ie.driver", InterExploPath);
//
//		// Initialize InternetExplorer
//		driver = new InternetExplorerDriver();
//		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
//		driver.manage().window().maximize();
//
//		NUR_Login_EM login = new NUR_Login_EM();
//		login.login(driver);
//
//		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
//		form.select_form(driver);
//
//		Nurse_Newborn_Registration_for_inpatient_UI UI = new Nurse_Newborn_Registration_for_inpatient_UI();
//		UI.newborn_registration(driver);
//
//		driver.close();
//
//	}
//
//	// IP_TC_671
//
//	@Test(dataProvider = "test_data", priority = 16)
//	public void navigate_to_Nurse_Newborn_Registration_for_inpatient_form_UI(String Patient_ID) {
//
//		// System Property for IE Driver
//		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
//		System.setProperty("webdriver.ie.driver", InterExploPath);
//
//		// Initialize InternetExplorer
//		driver = new InternetExplorerDriver();
//		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
//		driver.manage().window().maximize();
//
//		NUR_Login_EM login = new NUR_Login_EM();
//		login.login(driver);
//
//		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
//		form.select_form(driver);
//
//		Nurse_Newborn_Registration_for_inpatient_form_UI UI = new Nurse_Newborn_Registration_for_inpatient_form_UI();
//		UI.newborn_registration(driver, Patient_ID);
//
//		driver.close();
//
//	}
//
//	// IP_TC_884
//
//	@Test(dataProvider = "test_data", priority = 17)
//	public void navigate_to_Nurse_Register_New_Born_to_Admitted_Mother(String Patient_ID) {
//
//		// System Property for IE Driver
//		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
//		System.setProperty("webdriver.ie.driver", InterExploPath);
//
//		// Initialize InternetExplorer
//		driver = new InternetExplorerDriver();
//		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
//		driver.manage().window().maximize();
//
//		NUR_Login_EM login = new NUR_Login_EM();
//		login.login(driver);
//
//		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
//		form.select_form(driver);
//
//		Nurse_Register_New_Born_to_Admitted_Mother registr = new Nurse_Register_New_Born_to_Admitted_Mother();
//		registr.newborn_registration(driver, Patient_ID);
//
//		driver.close();
//
//	}
//
//	// IP_TC_634
//
//	@Test(dataProvider = "test_data", priority = 18)
//	public void navigate_to_Nurse_Transfer_practitioner(String Patient_ID) {
//
//		// System Property for IE Driver
//		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
//		System.setProperty("webdriver.ie.driver", InterExploPath);
//
//		// Initialize InternetExplorer
//		driver = new InternetExplorerDriver();
//		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
//		driver.manage().window().maximize();
//
//		NUR_Login_EM login = new NUR_Login_EM();
//		login.login(driver);
//
//		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
//		form.select_form(driver);
//
//		Nurse_Transfer_practitioner trans = new Nurse_Transfer_practitioner();
//		trans.Transfer(driver, Patient_ID);
//
//		driver.close();
//
//	}
//
//	// IP_TC_635
//
//	@Test(priority = 19)
//	public void Nurse_Transfer_Bulk_practitioner() {
//
//		// System Property for IE Driver
//		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
//		System.setProperty("webdriver.ie.driver", InterExploPath);
//
//		// Initialize InternetExplorer
//		driver = new InternetExplorerDriver();
//		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
//		driver.manage().window().maximize();
//
//		NUR_Login_EM login = new NUR_Login_EM();
//		login.login(driver);
//
//		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
//		form.select_form(driver);
//
//		Nurse_Transfer_Bulk_practitioner trans = new Nurse_Transfer_Bulk_practitioner();
//		trans.Transfer(driver);
//
//		driver.close();
//
//	}
//
//	// IP_TC_883
//
//	@Test(priority = 20)
//	public void navigate_to_Check_Bed_Availibility_Chart() {
//
//		// System Property for IE Driver
//		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
//		System.setProperty("webdriver.ie.driver", InterExploPath);
//
//		// Initialize InternetExplorer
//		driver = new InternetExplorerDriver();
//		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
//		driver.manage().window().maximize();
//
//		NUR_Login_EM login = new NUR_Login_EM();
//		login.login(driver);
//
//		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
//		form.select_form(driver);
//
//		Check_Bed_Availibility_Chart Bed = new Check_Bed_Availibility_Chart();
//		Bed.View_Bed_Availability(driver);
//
//		driver.close();
//
//	}
//
//	// IP_TC_605
//
//	@Test(priority = 21)
//	public void navigate_to_Nurse_Check_Block_Bed_UI() {
//
//		// System Property for IE Driver
//		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
//		System.setProperty("webdriver.ie.driver", InterExploPath);
//
//		// Initialize InternetExplorer
//		driver = new InternetExplorerDriver();
//		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
//		driver.manage().window().maximize();
//
//		NUR_Login_EM login = new NUR_Login_EM();
//		login.login(driver);
//
//		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
//		form.select_form(driver);
//
//		Nurse_Check_Block_Bed_UI UI = new Nurse_Check_Block_Bed_UI();
//		UI.bed(driver);
//
//		driver.close();
//
//	}
//
//	// IP_TC_606
//
//	@Test(priority = 22)
//	public void navigate_to_Nurse_Check_Block_Bed_with_all_data_required() {
//
//		// System Property for IE Driver
//		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
//		System.setProperty("webdriver.ie.driver", InterExploPath);
//
//		// Initialize InternetExplorer
//		driver = new InternetExplorerDriver();
//		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
//		driver.manage().window().maximize();
//
//		NUR_Login_EM login = new NUR_Login_EM();
//		login.login(driver);
//
//		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
//		form.select_form(driver);
//
//		Nurse_Check_Block_Bed_with_all_data_required bed = new Nurse_Check_Block_Bed_with_all_data_required();
//		bed.bed(driver);
//
//		driver.close();
//
//	}
//
//	// IP_TC_615
//
//	@Test(priority = 23)
//	public void navigate_to_Nurse_Check_Unblock_Bed_UI() {
//
//		// System Property for IE Driver
//		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
//		System.setProperty("webdriver.ie.driver", InterExploPath);
//
//		// Initialize InternetExplorer
//		driver = new InternetExplorerDriver();
//		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
//		driver.manage().window().maximize();
//
//		NUR_Login_EM login = new NUR_Login_EM();
//		login.login(driver);
//
//		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
//		form.select_form(driver);
//
//		Nurse_Check_Unblock_Bed_UI UI = new Nurse_Check_Unblock_Bed_UI();
//		UI.bed(driver);
//
//		driver.close();
//
//	}
//
//	// IP_TC_616
//
//	@Test(priority = 24)
//	public void navigate_to_Nurse_Release_Blocked_Bed() {
//
//		// System Property for IE Driver
//		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
//		System.setProperty("webdriver.ie.driver", InterExploPath);
//
//		// Initialize InternetExplorer
//		driver = new InternetExplorerDriver();
//		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
//		driver.manage().window().maximize();
//
//		NUR_Login_EM login = new NUR_Login_EM();
//		login.login(driver);
//
//		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
//		form.select_form(driver);
//
//		Nurse_Release_Blocked_Bed bed = new Nurse_Release_Blocked_Bed();
//		bed.bed(driver);
//
//		driver.close();
//
//	}
//
//	// IP_TC_141_149_153_156_172_187_270
//
//	@Test(dataProvider = "test_data", priority = 25)
//	public void navigate_to_Cancel_Admission(String Patient_ID) {
//
//		// System Property for IE Driver
//		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
//		System.setProperty("webdriver.ie.driver", InterExploPath);
//
//		// Initialize InternetExplorer
//		driver = new InternetExplorerDriver();
//		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
//		driver.manage().window().maximize();
//
//		CMO_Login_EM login = new CMO_Login_EM();
//		login.login(driver);
//
//		CMO_Select_Form form = new CMO_Select_Form();
//		form.select_form(driver);
//
//		Cancel_Admission admission = new Cancel_Admission();
//		admission.cancel(driver, Patient_ID);
//
//		driver.close();
//
//	}

	@AfterTest
	public void close_browser() {
//		driver.close();
	}

	@DataProvider
	public String[][] test_data() throws InvalidFormatException, IOException {

		read_excel_data_EM_GroupA obj = new read_excel_data_EM_GroupA();
		return obj.read_sheet();
	}

}
