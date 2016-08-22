package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C_SignUpPage_ErrorHandlingTNG {

	static WebDriver driver = new FirefoxDriver();
	static String URL = "http://learn2test.net/qa/apps/sign_up/v1/";
	
	//NEGATIVE TEST DATA
	String fname = "Alex1";
	String lname = "Moore1";
	String email = "alexmoore@gmail.com";
	String phone = "415-555-1212";
	
	//ERRORS
	String f_name_expected_error = "Invalid First Name: [a-zA-Z,.'-]{3,30}";
	String l_name_expected_error = "Invalid Last Name: [a-zA-Z,.'-]{3,30}";
	String email_expected_error = "Invalid Email Address: xx[min2]@x[min1].xx[2-6]";
	String phone_expected_error = "Invalid Phone Number: should be 10 digits";
	
	@BeforeClass
	public static void beforeClass(){ //throws Exeption() {
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void afterClass() { //throws Exeption() 
		driver.quit();
	}
	
	@BeforeTest
	public static void beforeTest(){
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();		
    //driver.findElement(By.id("id_reset_button")).click();
	
	}
	
	@Test //FIRST NAME ERROR HANDLING
	public void test_101_FirstName_FieldValidation() {		 
		 driver.findElement(By.id("id_fname")).sendKeys(fname);
	}
		 
	@Test //SUBMIT BUTTON 
	public void test_102_Submit_Button() {		
	     driver.findElement(By.id("id_submit_button")).submit();
	  
    }
	@Test
	public void test_103_fn_Error_Assertion() {		
	
		String actual_error = driver.findElement(By.id("ErrorLine")).getText();
		Assert.assertEquals(actual_error, f_name_expected_error); 
	}
	@Test //SUBMIT BUTTON 
	public void test_104_Reset_Button() {		
	     driver.findElement(By.id("id_reset_button")).click();
  }
	//=========================================================================
	
	@Test //FIRST NAME ERROR HANDLING
	public void test_105_firstName_FieldValidation() {		 
		 driver.findElement(By.id("id_fname")).sendKeys("Alex");
	}
	
	@Test //LAST NAME ERROR HANDLING
	public void test_106_LastName_FieldValidation() {			 
		 driver.findElement(By.id("id_lname")).sendKeys(lname);
	}
		 
	@Test //SUBMIT BUTTON 
	public void test_107_Submit_Button() {		
	     driver.findElement(By.id("id_submit_button")).submit();
	  
    }
	@Test
	public void test_108_ln_Error_Assertion() {		
	
		String actual_error = driver.findElement(By.id("ErrorLine")).getText();
		Assert.assertEquals(actual_error, l_name_expected_error); 
	}
}