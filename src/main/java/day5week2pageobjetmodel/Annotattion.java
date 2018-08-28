package day5week2pageobjetmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class Annotattion extends SeMethods {
	public String excelFileName,testName,testDesc,category,author,moduleName;
	
@BeforeSuite
public void startSuite() {
	beginResult();
}

@BeforeClass
public void startTest() {
	createTestCase(testName, testDesc);
	
}


//@BeforeMethod
/*public void testnode() {
	testNode(moduleName,author,category);
}  */
@Parameters({"url","username","password"})
@BeforeMethod(groups= {"smoke","sanity"})
	public  void login(String url,String username,String password  ) throws InterruptedException, IOException {
		testNode(moduleName, author, category);
		startApp("chrome", url);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, username);
		WebElement elePassword = locateElement("id","password");
		type(elePassword,password);
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		Thread.sleep(1000);
		WebElement elecrm = locateElement("linktext","CRM/SFA");
		click(elecrm);
		
	}

@AfterMethod
	public void close() {
		//closeAllBrowsers();
	
	}
@AfterSuite
public void stopSuite() {
	endResult();
}

@DataProvider(name="fetchdata")
public Object[][] getData() throws IOException {

	ReadExcel excel = new ReadExcel();
	return excel.readExcel(excelFileName);

	
} 

	

}


