package core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
//import java.io.IOExeption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B_SignUpPage_FunctionalValidationTNG {
	
	static WebDriver driver = new FirefoxDriver();
	static String URL = "http://learn2test.net/qa/apps/sign_up/v1/";
	
	//------------------------------------------------------------------------------------
	
	//ASSERT PAGES TITLE "SIGN UP" and "CONFIRMATION"	
	String expected_title = "Welcome to Sign Up v1";
	String expected_title_conf = "Confirmation";
	
	//POSITIVE TEST DATA
	String fname_p = "Alex"; //"Alex"
	String lname_p = "Moore"; //"Moore"
	String email_p = "alexmoore@gmail.com"; //"alexmoore@gmail.com"
	String phone_p = "415-555-1212"; //"415-555-1212"
	String gender_m = "Male";
	String terms = "Agreed";
	String state = "California";
	
	//NEGATIVE TEST DATA
	String fname = null; //"Alex111"
	String lname = null; //"Moore111"
	String email = null; //"!@gmail.com"
	String phone = null; //"415-555-1212AAA"
	
	
	//SOCIAL MEDIA ICONS Expected Pages Title
	String faceBook_eccpected = "Добро пожаловать на Фейсбук - заходите, регистрируйтесь и находите друзей.";
	String twitter_eccpected = "Добро пожаловать в Твиттер — войти или зарегистрироваться";
	String flickr_eccpected = "Flickr, a Yahoo company | Flickr Photo";
	String youtube_eccpected = "YouTube";
	
	
	//-------------------------------------------------------------------------------------------------------
	
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
	public static void beforeTest() throws IOException {
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();}
	
	@Test //PAGE TITLE
	public void test_000_Page_Title_Verification() {		 
		String actual_title = driver.getTitle();
		 Assert.assertEquals(actual_title, expected_title);
}
	@Test //FIRST NAME
	public void test_001_FirstName_FieldValidation() {	
		 driver.findElement(By.id("id_fname")).clear();
		 driver.findElement(By.id("id_fname")).sendKeys(fname_p);	
}	
	@Test //LAST NAME
	public void test_002_LastName_FieldValidation() {
		 driver.findElement(By.id("id_lname")).clear();
		 driver.findElement(By.id("id_lname")).sendKeys(lname_p);
}
	@Test //EMAIL
	public void test_003_Email_FieldValidation() {	
		 driver.findElement(By.id("id_email")).clear();
		 driver.findElement(By.id("id_email")).sendKeys(email_p);
}
	@Test //PHONE NUMBER
	public void test_004_PhoneNumber_FieldValidation() {
		 driver.findElement(By.id("id_phone")).clear();
		 driver.findElement(By.id("id_phone")).sendKeys(phone_p);
}
	
	@Test //RADIO BUTTON	
	public void test_005_RadioButton_Validation_Male() {
		 driver.findElement(By.id("id_g_radio_01")).click();
}
	
	@Test //STATE DROPDOWN MENU
	public void test_006_PhoneNumber_FieldValidation() {		
		 driver.findElement(By.id("id_state")).sendKeys("CA");
}		 
		 
    @Test //AGREE TO TERMS	
    public void test_007_RadioButton_Validation_Male() {	
		 driver.findElement(By.id("id_checkbox")).click();
		
	 
}
	
	@Test
	public void test_008_FaceBook_Link_Varification() {
	driver.findElement(By.id("id_img_facebook")).click();	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	ArrayList<String> allTabs = new ArrayList<String>(driver.getWindowHandles());
	//String tab = driver.getWindowHandle();
	//WindowHandle: da1f1168-b29b-4de0-ba7c-3fd319ef8721
	driver.switchTo().window(allTabs.get(1));
	String title_facebook_actual = driver.getTitle();
	driver.close();
	driver.switchTo().window(allTabs.get(0));
	
	//ASSERT 
	Assert.assertEquals(title_facebook_actual, faceBook_eccpected);
	}
	
	@Test
	public void test_009_Twitter_Link_Varification() {
	driver.findElement(By.id("id_img_twitter")).click();	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	ArrayList<String> allTabs = new ArrayList<String>(driver.getWindowHandles());
	//String tab = driver.getWindowHandle();
	//WindowHandle: da1f1168-b29b-4de0-ba7c-3fd319ef8721
	driver.switchTo().window(allTabs.get(1));
	String title_twitter_actual = driver.getTitle();
	driver.close();
	driver.switchTo().window(allTabs.get(0));
	
	//ASSERT
	Assert.assertEquals(title_twitter_actual, twitter_eccpected);
	}
	
	@Test
	public void test_010_flickr_Link_Varification() {
	driver.findElement(By.id("id_img_flickr")).click();	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	//BROWSER WINDOWS MANAGE
	ArrayList<String> allTabs = new ArrayList<String>(driver.getWindowHandles());
	//String tab = driver.getWindowHandle();
	//WindowHandle: da1f1168-b29b-4de0-ba7c-3fd319ef8721
	driver.switchTo().window(allTabs.get(1));
	String title_flickr_actual = driver.getTitle();
	driver.close();
	driver.switchTo().window(allTabs.get(0));
	
	//ASSERT
	Assert.assertEquals(title_flickr_actual, flickr_eccpected);
	}
	
	@Test
	public void test_011_YouTube_Link_Varification() {
	driver.findElement(By.id("id_img_youtube")).click();	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	ArrayList<String> allTabs = new ArrayList<String>(driver.getWindowHandles());
	//String tab = driver.getWindowHandle();
	//WindowHandle: da1f1168-b29b-4de0-ba7c-3fd319ef8721
	driver.switchTo().window(allTabs.get(1));
	String title_youtube_actual = driver.getTitle();
	driver.close();
	driver.switchTo().window(allTabs.get(0));
	
	//ASSERT
	Assert.assertEquals(title_youtube_actual, youtube_eccpected);
	}
	
	@Test
	public void test_012_Submit_Button() {		
		 driver.findElement(By.id("id_submit_button")).submit();
    }

//CONFIRMATION PAGE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
	@Test
	public void test_013_Confirmation_Confirmation_Page() {		
		 String actual_title = driver.getTitle();
		 Assert.assertEquals(actual_title, expected_title_conf);
    }
	@Test
	public void test_014_Confirmation_FName() {		
		String fname_conf =  driver.findElement(By.id("id_fname_conf")).getText();
		Assert.assertEquals(fname_conf, fname_p);
	}
	@Test
	public void test_015_Confirmation_LName() {		
		String lname_conf =  driver.findElement(By.id("id_lname_conf")).getText();
		Assert.assertEquals(lname_conf, lname_p);
	}
	@Test
	public void test_016_Confirmation_Email() {		
		String email_conf =  driver.findElement(By.id("id_email_conf")).getText();
		Assert.assertEquals(email_conf, email_p);
	}
	@Test
	public void test_017_Confirmation_Phone() {		
		String phone_conf =  driver.findElement(By.id("id_phone_conf")).getText();
		Assert.assertEquals(phone_conf, phone_p);
	}
	@Test
	public void test_018_Confirmation_Gender() {		
		String gender_conf =  driver.findElement(By.id("id_gender_conf")).getText();
		Assert.assertEquals(gender_conf, gender_m);
	}
	
	@Test
	public void test_019_Confirmation_Terms() {		
		String terms_conf =  driver.findElement(By.id("id_terms_conf")).getText();
		Assert.assertEquals(terms_conf, terms);
	}
	
	@Test
	public void test_020_Confirmation_State() {		
		String state_conf =  driver.findElement(By.id("id_state_conf")).getText();
		Assert.assertEquals(state_conf, state);
	}
	
	@Test
	public void test_021_Confirmation_Back_Button() {		
		driver.findElement(By.id("id_back_button")).click();

	}
	
	@Test
	public void test_022_Confirmation_SignUpPage_Title() {		
		 String actual_title = driver.getTitle();
		 Assert.assertEquals(actual_title, expected_title);
    }
}
//END