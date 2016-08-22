package core;
 
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class A_SignUpPage_ElementValidationTNG {
	
	static WebDriver driver = new FirefoxDriver();
	static String URL = "http://learn2test.net/qa/apps/sign_up/v1/";
	
	@BeforeClass
	public static void beforeClass(){ //throws Exeption() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void afterClass() { //throws Exeption() 
		driver.quit();
	}
	
	@Test
  public void test_01_Dynamic_text_quote() {
		 driver.get(URL);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 //TEST ID
		 System.out.println("SIGN UP PAGE");
		 System.out.println(">>> TEST 01 Dynamic text (Quote) >>>");
		 
		// IS PRESENT
		 boolean QuoteisPresent = driver.findElements(By.id("id_quotes")).size() > 0;
		 System.out.println("isPresent? " + QuoteisPresent);
		 
		// IS VISIBLE
		 boolean  QuoteisDisplayed =  driver.findElement(By.id("id_quotes")).isDisplayed();
		 System.out.println("isDisplayed? " + QuoteisDisplayed);
		 
		 // IS ENABLED
		 boolean  QuoteisEnabled =  driver.findElement(By.id("id_quotes")).isEnabled();
		 System.out.println("isEnabled? " + QuoteisEnabled);
		 
		// LOCATION
		 org.openqa.selenium.Point QuoteLocation = driver.findElement(By.id("id_quotes")).getLocation();
		 System.out.println("Location X: " + QuoteLocation.getX());
		 System.out.println("Location Y: " + QuoteLocation.getY());
		 
		// SIZE
		 org.openqa.selenium.Dimension QuoteSize = driver.findElement(By.id("id_quotes")).getSize();
		 System.out.println("Size Width: " + QuoteSize.getWidth());
		 System.out.println("Size Height: " + QuoteSize.getHeight());
	
  }
	@Test
  public void test_02_Page_Title_SignUp() {
			 
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 02 Page Title (SignUp) >>>");
			 
			 // IS PRESENT
			 boolean SignUpisPresent = driver.findElements(By.id("id_f_title")).size() > 0;
			 System.out.println("isPresent? " + SignUpisPresent);
			 
			 // IS VISIBLE
			 Boolean SignUpisVisable = driver.findElement(By.id("id_f_title")).isDisplayed();
			 System.out.println("isDisplayed? " + SignUpisVisable);
			 
			 // IS ENABLED
			 Boolean SignUpisEnabled = driver.findElement(By.id("id_f_title")).isEnabled();
			 System.out.println("isEnabled? " + SignUpisEnabled);
			 
			 // LOCATION
			 org.openqa.selenium.Point SignUpLocation = driver.findElement(By.id("id_f_title")).getLocation();
			 System.out.println("Location X: " + SignUpLocation.getX());
			 System.out.println("Location Y: " + SignUpLocation.getY());
			 
			 // SIZE
			 org.openqa.selenium.Dimension SignUpSize = driver.findElement(By.id("id_f_title")).getSize();
			 System.out.println("Size Width: " + SignUpSize.getWidth());
			 System.out.println("Size Height: " + SignUpSize.getHeight());
	  }
	@Test
  public void test_03_Dynamic_Text_Current_Location() {
		 
		 //TEST ID
		 System.out.println(" ");
		 System.out.println(">>> TEST 03 Dynamic Text (Current Location) >>>");
			
			 
			 // IS PRESENT
			 boolean DynamicTextisPresent = driver.findElements(By.id("id_current_location")).size() > 0;
			 System.out.println("isPresent? " + DynamicTextisPresent);
			 
			 // IS VISIBLE
			 Boolean DynamicTextisVisable = driver.findElement(By.id("id_current_location")).isDisplayed();
			 System.out.println("isDisplayed? " + DynamicTextisVisable);
			 
			 // IS ENABLED
			 Boolean DynamicTextisEnabled = driver.findElement(By.id("id_current_location")).isEnabled();
			 System.out.println("isEnabled? " + DynamicTextisEnabled);
			 
			 // LOCATION
			 org.openqa.selenium.Point DynamicTextLocation = driver.findElement(By.id("id_current_location")).getLocation();
			 System.out.println("Location X: " + DynamicTextLocation.getX());
			 System.out.println("Location Y: " + DynamicTextLocation.getY());
			 
			 // SIZE
			 org.openqa.selenium.Dimension DynamicTextSize = driver.findElement(By.id("id_current_location")).getSize();
			 System.out.println("Size Width: " + DynamicTextSize.getWidth());
			 System.out.println("Size Height: " + DynamicTextSize.getHeight());
			 
   }
	@Test
  public void test_04_Image_Weather_Icon() {
			 
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 04 Image (Weather icon) >>>");
				
				 
				 // IS PRESENT
				 boolean ImageWeatherisPresent = driver.findElements(By.id("id_weather_icon")).size() > 0;
				 System.out.println("isPresent? " + ImageWeatherisPresent);
				 
				 // IS VISIBLE
				 Boolean ImageWeatherisVisable = driver.findElement(By.id("id_weather_icon")).isDisplayed();
				 System.out.println("isDisplayed? " + ImageWeatherisVisable);
				 
				 // IS ENABLED
				 Boolean ImageWeatherisEnabled = driver.findElement(By.id("id_weather_icon")).isEnabled();
				 System.out.println("isEnabled? " + ImageWeatherisEnabled);
				 
				 // LOCATION
				 org.openqa.selenium.Point ImageWeatherLocation = driver.findElement(By.id("id_weather_icon")).getLocation();
				 System.out.println("Location X: " + ImageWeatherLocation.getX());
				 System.out.println("Location Y: " + ImageWeatherLocation.getY());
				 
				 // SIZE
				 org.openqa.selenium.Dimension ImageWeatherSize = driver.findElement(By.id("id_weather_icon")).getSize();
				 System.out.println("Size Width: " + ImageWeatherSize.getWidth());
				 System.out.println("Size Height: " + ImageWeatherSize.getHeight());
				 
	}
	@Test
  public void test_05_Dynamic_Text_Temperature() {
			 
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 05 Dynamic Text (Temperature) >>>");
				
				 
				 // IS PRESENT
				 boolean DynamicTextisPresent = driver.findElements(By.id("id_temperature")).size() > 0;
				 System.out.println("isPresent? " + DynamicTextisPresent);
				 
				 // IS VISIBLE
				 Boolean DynamicTextisVisable = driver.findElement(By.id("id_temperature")).isDisplayed();
				 System.out.println("isDisplayed? " + DynamicTextisVisable);
				 
				 // IS ENABLED
				 Boolean DynamicTexisEnabled = driver.findElement(By.id("id_temperature")).isEnabled();
				 System.out.println("isEnabled? " + DynamicTexisEnabled);
				 
				 // LOCATION
				 org.openqa.selenium.Point DynamicTexLocation = driver.findElement(By.id("id_temperature")).getLocation();
				 System.out.println("Location X: " + DynamicTexLocation.getX());
				 System.out.println("Location Y: " + DynamicTexLocation.getY());
				 
				 // SIZE
				 org.openqa.selenium.Dimension DynamicTexSize = driver.findElement(By.id("id_temperature")).getSize();
				 System.out.println("Size Width: " + DynamicTexSize.getWidth());
				 System.out.println("Size Height: " + DynamicTexSize.getHeight());
				
	}
	@Test
  public void test_06_Label_First_Name() {
			 
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 06 Label (First Name) >>>");
				
				 
				 // IS PRESENT
				 boolean LabelFirstNameisPresent = driver.findElements(By.id("id_f_label_fn")).size() > 0;
				 System.out.println("isPresent? " + LabelFirstNameisPresent);
				 
				 // IS VISIBLE
				 Boolean LabelFirstNameisVisable = driver.findElement(By.id("id_f_label_fn")).isDisplayed();
				 System.out.println("isDisplayed? " + LabelFirstNameisVisable);
				 
				 // IS ENABLED
				 Boolean LabelFirstNameisEnabled = driver.findElement(By.id("id_f_label_fn")).isEnabled();
				 System.out.println("isEnabled? " + LabelFirstNameisEnabled);
				 
				 // LOCATION
				 org.openqa.selenium.Point LabelFirstNameLocation = driver.findElement(By.id("id_f_label_fn")).getLocation();
				 System.out.println("Location X: " + LabelFirstNameLocation.getX());
				 System.out.println("Location Y: " + LabelFirstNameLocation.getY());
				 
				 // SIZE
				 org.openqa.selenium.Dimension LabelFirstNameSize = driver.findElement(By.id("id_f_label_fn")).getSize();
				 System.out.println("Size Width: " + LabelFirstNameSize.getWidth());
				 System.out.println("Size Height: " + LabelFirstNameSize.getHeight());
	}
	@Test
  public void test_07_Field_First_Name() {
			 
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 07 Field (First Name) >>>");
				
				 
				 // IS PRESENT
				 boolean FieldFirstNameisPresent = driver.findElements(By.id("id_fname")).size() > 0;
				 System.out.println("isPresent? " + FieldFirstNameisPresent);
				 
				 // IS VISIBLE
				 Boolean FieldFirstNameisVisable = driver.findElement(By.id("id_fname")).isDisplayed();
				 System.out.println("isDisplayed? " + FieldFirstNameisVisable);
				 
				 // IS ENABLED
				 Boolean FieldFirstNameisEnabled = driver.findElement(By.id("id_fname")).isEnabled();
				 System.out.println("isEnabled? " + FieldFirstNameisEnabled);
				 
				 // LOCATION
				 org.openqa.selenium.Point FieldFirstNameLocation = driver.findElement(By.id("id_fname")).getLocation();
				 System.out.println("Location X: " + FieldFirstNameLocation.getX());
				 System.out.println("Location Y: " + FieldFirstNameLocation.getY());
				 
				 // SIZE
				 org.openqa.selenium.Dimension FieldFirstNameSize = driver.findElement(By.id("id_fname")).getSize();
				 System.out.println("Size Width: " + FieldFirstNameSize.getWidth());
				 System.out.println("Size Height: " + FieldFirstNameSize.getHeight());
	    }
	@Test
  public void test_08_Label_Last_Name() {
			 
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 08 Label (Last Name) >>>");
				
				 
				 // IS PRESENT
				 boolean LabelLastNameisPresent = driver.findElements(By.id("id_f_label_ln")).size() > 0;
				 System.out.println("isPresent? " + LabelLastNameisPresent);
				 
				 // IS VISIBLE
				 Boolean LabelLastNameisVisable = driver.findElement(By.id("id_f_label_ln")).isDisplayed();
				 System.out.println("isDisplayed? " + LabelLastNameisVisable);
				 
				 // IS ENABLED
				 Boolean LabelLastNameisEnabled = driver.findElement(By.id("id_f_label_ln")).isEnabled();
				 System.out.println("isEnabled? " + LabelLastNameisEnabled);
				 
				 // LOCATION
				 org.openqa.selenium.Point LabelLastNameLocation = driver.findElement(By.id("id_f_label_ln")).getLocation();
				 System.out.println("Location X: " + LabelLastNameLocation.getX());
				 System.out.println("Location Y: " + LabelLastNameLocation.getY());
				 
				 // SIZE
				 org.openqa.selenium.Dimension LabelLastNameSize = driver.findElement(By.id("id_f_label_ln")).getSize();
				 System.out.println("Size Width: " + LabelLastNameSize.getWidth());
				 System.out.println("Size Height: " + LabelLastNameSize.getHeight());
				 
	    }
	@Test
  public void test_09_Field_Last_Name() {
				 
				 //TEST ID
				 System.out.println(" ");
				 System.out.println(">>> TEST 09 Field (Last Name) >>>");
					
					 
					 // IS PRESENT
					 boolean FieldLastNameisPresent = driver.findElements(By.id("id_lname")).size() > 0;
					 System.out.println("isPresent? " + FieldLastNameisPresent);
					 
					 // IS VISIBLE
					 Boolean FieldLastNameisVisable = driver.findElement(By.id("id_lname")).isDisplayed();
					 System.out.println("isDisplayed? " + FieldLastNameisVisable);
					 
					 // IS ENABLED
					 Boolean FieldLastNameisEnabled = driver.findElement(By.id("id_lname")).isEnabled();
					 System.out.println("isEnabled? " + FieldLastNameisEnabled);
					 
					 // LOCATION
					 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("id_lname")).getLocation();
					 System.out.println("Location X: " + FieldLastNameLocation.getX());
					 System.out.println("Location Y: " + FieldLastNameLocation.getY());
					 
					 // SIZE
					 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("id_lname")).getSize();
					 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
					 System.out.println("Size Height: " + FieldLastNameSize.getHeight());
	 }
	@Test
  public void test_10_Label_Email_Address() {
					 
					 //TEST ID
					 System.out.println(" ");
					 System.out.println(">>> TEST 10 Label (Email Address) >>>");
						
						 
						 // IS PRESENT
						 boolean FieldLastNameisPresent = driver.findElements(By.id("id_f_label_ea")).size() > 0;
						 System.out.println("isPresent? " + FieldLastNameisPresent);
						 
						 // IS VISIBLE
						 Boolean FieldLastNameisVisable = driver.findElement(By.id("id_f_label_ea")).isDisplayed();
						 System.out.println("isDisplayed? " + FieldLastNameisVisable);
						 
						 // IS ENABLED
						 Boolean FieldLastNameisEnabled = driver.findElement(By.id("id_f_label_ea")).isEnabled();
						 System.out.println("isEnabled? " + FieldLastNameisEnabled);
						 
						 // LOCATION
						 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("id_f_label_ea")).getLocation();
						 System.out.println("Location X: " + FieldLastNameLocation.getX());
						 System.out.println("Location Y: " + FieldLastNameLocation.getY());
						 
						 // SIZE
						 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("id_f_label_ea")).getSize();
						 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
						 System.out.println("Size Height: " + FieldLastNameSize.getHeight());
						
		 }
	@Test
  public void test_11_Field_Email_Address() {
					 
					 //TEST ID
					 System.out.println(" ");
					 System.out.println(">>> TEST 11 Field (Email Address) >>>");
						
						 
						 // IS PRESENT
						 boolean FieldLastNameisPresent = driver.findElements(By.id("id_email")).size() > 0;
						 System.out.println("isPresent? " + FieldLastNameisPresent);
						 
						 // IS VISIBLE
						 Boolean FieldLastNameisVisable = driver.findElement(By.id("id_email")).isDisplayed();
						 System.out.println("isDisplayed? " + FieldLastNameisVisable);
						 
						 // IS ENABLED
						 Boolean FieldLastNameisEnabled = driver.findElement(By.id("id_email")).isEnabled();
						 System.out.println("isEnabled? " + FieldLastNameisEnabled);
						 
						 // LOCATION
						 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("id_email")).getLocation();
						 System.out.println("Location X: " + FieldLastNameLocation.getX());
						 System.out.println("Location Y: " + FieldLastNameLocation.getY());
						 
						 // SIZE
						 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("id_email")).getSize();
						 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
						 System.out.println("Size Height: " + FieldLastNameSize.getHeight());
						
		 }
	@Test
  public void test_12_Label_Phone_Number() {
					 
					 //TEST ID
					 System.out.println(" ");
					 System.out.println(">>> TEST 12 Label (Phone Number) >>>");
						
						 
						 // IS PRESENT
						 boolean FieldLastNameisPresent = driver.findElements(By.id("id_f_label_pn")).size() > 0;
						 System.out.println("isPresent? " + FieldLastNameisPresent);
						 
						 // IS VISIBLE
						 Boolean FieldLastNameisVisable = driver.findElement(By.id("id_f_label_pn")).isDisplayed();
						 System.out.println("isDisplayed? " + FieldLastNameisVisable);
						 
						 // IS ENABLED
						 Boolean FieldLastNameisEnabled = driver.findElement(By.id("id_f_label_pn")).isEnabled();
						 System.out.println("isEnabled? " + FieldLastNameisEnabled);
						 
						 // LOCATION
						 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("id_f_label_pn")).getLocation();
						 System.out.println("Location X: " + FieldLastNameLocation.getX());
						 System.out.println("Location Y: " + FieldLastNameLocation.getY());
						 
						 // SIZE
						 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("id_f_label_pn")).getSize();
						 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
						 System.out.println("Size Height: " + FieldLastNameSize.getHeight());
						 System.out.println(" ");
		 }
	@Test
  public void test_13_Field_Phone_Number() {
						 
						 //TEST ID
						 System.out.println(" ");
						 System.out.println(">>> TEST 13 Field (Phone Number) >>>");
							
							 
							 // IS PRESENT
							 boolean FieldLastNameisPresent = driver.findElements(By.id("id_phone")).size() > 0;
							 System.out.println("isPresent? " + FieldLastNameisPresent);
							 
							 // IS VISIBLE
							 Boolean FieldLastNameisVisable = driver.findElement(By.id("id_phone")).isDisplayed();
							 System.out.println("isDisplayed? " + FieldLastNameisVisable);
							 
							 // IS ENABLED
							 Boolean FieldLastNameisEnabled = driver.findElement(By.id("id_phone")).isEnabled();
							 System.out.println("isEnabled? " + FieldLastNameisEnabled);
							 
							 // LOCATION
							 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("id_phone")).getLocation();
							 System.out.println("Location X: " + FieldLastNameLocation.getX());
							 System.out.println("Location Y: " + FieldLastNameLocation.getY());
							 
							 // SIZE
							 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("id_phone")).getSize();
							 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
							 System.out.println("Size Height: " + FieldLastNameSize.getHeight());
							 System.out.println(" ");
			 }
	@Test
  public void test_14_Label_Radio_Male() {
							 
							 //TEST ID
							 System.out.println(" ");
							 System.out.println(">>> TEST 14 Field (Radio Male) >>>");
								
								 
								 // IS PRESENT
								 boolean FieldLastNameisPresent = driver.findElements(By.id("id_r_label_m")).size() > 0;
								 System.out.println("isPresent? " + FieldLastNameisPresent);
								 
								 // IS VISIBLE
								 Boolean FieldLastNameisVisable = driver.findElement(By.id("id_r_label_m")).isDisplayed();
								 System.out.println("isDisplayed? " + FieldLastNameisVisable);
								 
								 // IS ENABLED
								 Boolean FieldLastNameisEnabled = driver.findElement(By.id("id_r_label_m")).isEnabled();
								 System.out.println("isEnabled? " + FieldLastNameisEnabled);
								 
								 // LOCATION
								 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("id_r_label_m")).getLocation();
								 System.out.println("Location X: " + FieldLastNameLocation.getX());
								 System.out.println("Location Y: " + FieldLastNameLocation.getY());
								 
								 // SIZE
								 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("id_r_label_m")).getSize();
								 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
								 System.out.println("Size Height: " + FieldLastNameSize.getHeight());
				 }
   @Test
  public void test_15_Radio_Button() {
							 
							 //TEST ID
							 System.out.println(" ");
							 System.out.println(">>> TEST 15 Radio Button (Male) >>>");
								
								 
								 // IS PRESENT
								 boolean FieldLastNameisPresent = driver.findElements(By.id("id_g_radio_01")).size() > 0;
								 System.out.println("isPresent? " + FieldLastNameisPresent);
								 
								 // IS VISIBLE
								 Boolean FieldLastNameisVisable = driver.findElement(By.id("id_g_radio_01")).isDisplayed();
								 System.out.println("isDisplayed? " + FieldLastNameisVisable);
								 
								 // IS ENABLED
								 Boolean FieldLastNameisEnabled = driver.findElement(By.id("id_g_radio_01")).isEnabled();
								 System.out.println("isEnabled? " + FieldLastNameisEnabled);
								 
								 // LOCATION
								 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("id_g_radio_01")).getLocation();
								 System.out.println("Location X: " + FieldLastNameLocation.getX());
								 System.out.println("Location Y: " + FieldLastNameLocation.getY());
								 
								 // SIZE
								 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("id_g_radio_01")).getSize();
								 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
								 System.out.println("Size Height: " + FieldLastNameSize.getHeight());
   }
  @Test
  public void test_16_Label_Radio_Female() {
							 
							 //TEST ID
							 System.out.println(" ");
							 System.out.println(">>> TEST 16 Label Radio (Female) >>>");
								
								 
								 // IS PRESENT
								 boolean FieldLastNameisPresent = driver.findElements(By.id("id_r_label_f")).size() > 0;
								 System.out.println("isPresent? " + FieldLastNameisPresent);
								 
								 // IS VISIBLE
								 Boolean FieldLastNameisVisable = driver.findElement(By.id("id_r_label_f")).isDisplayed();
								 System.out.println("isDisplayed? " + FieldLastNameisVisable);
								 
								 // IS ENABLED
								 Boolean FieldLastNameisEnabled = driver.findElement(By.id("id_r_label_f")).isEnabled();
								 System.out.println("isEnabled? " + FieldLastNameisEnabled);
								 
								 // LOCATION
								 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("id_r_label_f")).getLocation();
								 System.out.println("Location X: " + FieldLastNameLocation.getX());
								 System.out.println("Location Y: " + FieldLastNameLocation.getY());
								 
								 // SIZE
								 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("id_r_label_f")).getSize();
								 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
								 System.out.println("Size Height: " + FieldLastNameSize.getHeight());
								 System.out.println(" ");

     }
  @Test
  public void test_17_Radio_Button_Female() {
							 
							 //TEST ID
							 System.out.println(" ");
							 System.out.println(">>> TEST 17 Radio Button (Female) >>>");
								
								 
								 // IS PRESENT
								 boolean FieldLastNameisPresent = driver.findElements(By.id("id_g_radio_02")).size() > 0;
								 System.out.println("isPresent? " + FieldLastNameisPresent);
								 
								 // IS VISIBLE
								 Boolean FieldLastNameisVisable = driver.findElement(By.id("id_g_radio_02")).isDisplayed();
								 System.out.println("isDisplayed? " + FieldLastNameisVisable);
								 
								 // IS ENABLED
								 Boolean FieldLastNameisEnabled = driver.findElement(By.id("id_g_radio_02")).isEnabled();
								 System.out.println("isEnabled? " + FieldLastNameisEnabled);
								 
								 // LOCATION
								 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("id_g_radio_02")).getLocation();
								 System.out.println("Location X: " + FieldLastNameLocation.getX());
								 System.out.println("Location Y: " + FieldLastNameLocation.getY());
								 
								 // SIZE
								 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("id_g_radio_02")).getSize();
								 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
								 System.out.println("Size Height: " + FieldLastNameSize.getHeight());

     }
  @Test
  public void test_18_Label_State() {
		 
		 //TEST ID
		 System.out.println(" ");
		 System.out.println(">>> TEST 18 Radio Button (Female) >>>");
			
			 
			 // IS PRESENT
			 boolean FieldLastNameisPresent = driver.findElements(By.id("id_f_label_s")).size() > 0;
			 System.out.println("isPresent? " + FieldLastNameisPresent);
			 
			 // IS VISIBLE
			 Boolean FieldLastNameisVisable = driver.findElement(By.id("id_f_label_s")).isDisplayed();
			 System.out.println("isDisplayed? " + FieldLastNameisVisable);
			 
			 // IS ENABLED
			 Boolean FieldLastNameisEnabled = driver.findElement(By.id("id_f_label_s")).isEnabled();
			 System.out.println("isEnabled? " + FieldLastNameisEnabled);
			 
			 // LOCATION
			 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("id_f_label_s")).getLocation();
			 System.out.println("Location X: " + FieldLastNameLocation.getX());
			 System.out.println("Location Y: " + FieldLastNameLocation.getY());
			 
			 // SIZE
			 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("id_f_label_s")).getSize();
			 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
			 System.out.println("Size Height: " + FieldLastNameSize.getHeight());

     }
  @Test
  public void test_19_DropDownList_State() {
		 
		 //TEST ID
		 System.out.println(" ");
		 System.out.println(">>> TEST 19 Drop-down List (Stste) >>>");
			
			 
			 // IS PRESENT
			 boolean FieldLastNameisPresent = driver.findElements(By.id("id_state")).size() > 0;
			 System.out.println("isPresent? " + FieldLastNameisPresent);
			 
			 // IS VISIBLE
			 Boolean FieldLastNameisVisable = driver.findElement(By.id("id_state")).isDisplayed();
			 System.out.println("isDisplayed? " + FieldLastNameisVisable);
			 
			 // IS ENABLED
			 Boolean FieldLastNameisEnabled = driver.findElement(By.id("id_state")).isEnabled();
			 System.out.println("isEnabled? " + FieldLastNameisEnabled);
			 
			 // LOCATION
			 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("id_state")).getLocation();
			 System.out.println("Location X: " + FieldLastNameLocation.getX());
			 System.out.println("Location Y: " + FieldLastNameLocation.getY());
			 
			 // SIZE
			 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("id_state")).getSize();
			 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
			 System.out.println("Size Height: " + FieldLastNameSize.getHeight());

     }
  @Test
  public void test_20_Label_I_agreeToTheTerms() {
		 
		 //TEST ID
		 System.out.println(" ");
		 System.out.println(">>> TEST 20 Label (I agree to the Terms) >>>");
			
			 
			 // IS PRESENT
			 boolean FieldLastNameisPresent = driver.findElements(By.id("id_cb_label")).size() > 0;
			 System.out.println("isPresent? " + FieldLastNameisPresent);
			 
			 // IS VISIBLE
			 Boolean FieldLastNameisVisable = driver.findElement(By.id("id_cb_label")).isDisplayed();
			 System.out.println("isDisplayed? " + FieldLastNameisVisable);
			 
			 // IS ENABLED
			 Boolean FieldLastNameisEnabled = driver.findElement(By.id("id_cb_label")).isEnabled();
			 System.out.println("isEnabled? " + FieldLastNameisEnabled);
			 
			 // LOCATION
			 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("id_cb_label")).getLocation();
			 System.out.println("Location X: " + FieldLastNameLocation.getX());
			 System.out.println("Location Y: " + FieldLastNameLocation.getY());
			 
			 // SIZE
			 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("id_cb_label")).getSize();
			 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
			 System.out.println("Size Height: " + FieldLastNameSize.getHeight());
			 System.out.println(" ");

     }
  @Test
  public void test_21_Checkbox_Terms() {
		 
		 //TEST ID
		 System.out.println(" ");
		 System.out.println(">>> TEST 21 Checkbox (Terms) >>>");
			
			 
			 // IS PRESENT
			 boolean FieldLastNameisPresent = driver.findElements(By.id("id_checkbox")).size() > 0;
			 System.out.println("isPresent? " + FieldLastNameisPresent);
			 
			 // IS VISIBLE
			 Boolean FieldLastNameisVisable = driver.findElement(By.id("id_checkbox")).isDisplayed();
			 System.out.println("isDisplayed? " + FieldLastNameisVisable);
			 
			 // IS ENABLED
			 Boolean FieldLastNameisEnabled = driver.findElement(By.id("id_checkbox")).isEnabled();
			 System.out.println("isEnabled? " + FieldLastNameisEnabled);
			 
			 // LOCATION
			 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("id_checkbox")).getLocation();
			 System.out.println("Location X: " + FieldLastNameLocation.getX());
			 System.out.println("Location Y: " + FieldLastNameLocation.getY());
			 
			 // SIZE
			 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("id_checkbox")).getSize();
			 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
			 System.out.println("Size Height: " + FieldLastNameSize.getHeight());

     }
  @Test
  public void test_22_Image_Facebook() {
		 
		 //TEST ID
		 System.out.println(" ");
		 System.out.println(">>> TEST 22 Image (Facebook) >>>");
			
			 
			 // IS PRESENT
			 boolean FieldLastNameisPresent = driver.findElements(By.id("id_img_facebook")).size() > 0;
			 System.out.println("isPresent? " + FieldLastNameisPresent);
			 
			 // IS VISIBLE
			 Boolean FieldLastNameisVisable = driver.findElement(By.id("id_img_facebook")).isDisplayed();
			 System.out.println("isDisplayed? " + FieldLastNameisVisable);
			 
			 // IS ENABLED
			 Boolean FieldLastNameisEnabled = driver.findElement(By.id("id_img_facebook")).isEnabled();
			 System.out.println("isEnabled? " + FieldLastNameisEnabled);
			 
			 // LOCATION
			 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("id_img_facebook")).getLocation();
			 System.out.println("Location X: " + FieldLastNameLocation.getX());
			 System.out.println("Location Y: " + FieldLastNameLocation.getY());
			 
			 // SIZE
			 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("id_img_facebook")).getSize();
			 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
			 System.out.println("Size Height: " + FieldLastNameSize.getHeight());
     }
  @Test
  public void test_23_Image_Twitter() {
		 
		 //TEST ID
		 System.out.println(" ");
		 System.out.println(">>> TEST 23 Image (Twitter) >>>");
			
			 
			 // IS PRESENT
			 boolean FieldLastNameisPresent = driver.findElements(By.id("id_img_twitter")).size() > 0;
			 System.out.println("isPresent? " + FieldLastNameisPresent);
			 
			 // IS VISIBLE
			 Boolean FieldLastNameisVisable = driver.findElement(By.id("id_img_twitter")).isDisplayed();
			 System.out.println("isDisplayed? " + FieldLastNameisVisable);
			 
			 // IS ENABLED
			 Boolean FieldLastNameisEnabled = driver.findElement(By.id("id_img_twitter")).isEnabled();
			 System.out.println("isEnabled? " + FieldLastNameisEnabled);
			 
			 // LOCATION
			 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("id_img_twitter")).getLocation();
			 System.out.println("Location X: " + FieldLastNameLocation.getX());
			 System.out.println("Location Y: " + FieldLastNameLocation.getY());
			 
			 // SIZE
			 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("id_img_twitter")).getSize();
			 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
			 System.out.println("Size Height: " + FieldLastNameSize.getHeight());

     }
  @Test
  public void test_24_Image_Flickr() {
		 
		 //TEST ID
		 System.out.println(" ");
		 System.out.println(">>> TEST 24 Image (Twitter) >>>");
			
			 
			 // IS PRESENT
			 boolean FieldLastNameisPresent = driver.findElements(By.id("id_img_flickr")).size() > 0;
			 System.out.println("isPresent? " + FieldLastNameisPresent);
			 
			 // IS VISIBLE
			 Boolean FieldLastNameisVisable = driver.findElement(By.id("id_img_flickr")).isDisplayed();
			 System.out.println("isDisplayed? " + FieldLastNameisVisable);
			 
			 // IS ENABLED
			 Boolean FieldLastNameisEnabled = driver.findElement(By.id("id_img_flickr")).isEnabled();
			 System.out.println("isEnabled? " + FieldLastNameisEnabled);
			 
			 // LOCATION
			 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("id_img_flickr")).getLocation();
			 System.out.println("Location X: " + FieldLastNameLocation.getX());
			 System.out.println("Location Y: " + FieldLastNameLocation.getY());
			 
			 // SIZE
			 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("id_img_flickr")).getSize();
			 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
			 System.out.println("Size Height: " + FieldLastNameSize.getHeight());

     }
  @Test
  public void test_25_Image_YouTube() {
		 
		 //TEST ID
		 System.out.println(" ");
		 System.out.println(">>> TEST 25 Image (YouTube) >>>");
			
			 
			 // IS PRESENT
			 boolean FieldLastNameisPresent = driver.findElements(By.id("id_img_youtube")).size() > 0;
			 System.out.println("isPresent? " + FieldLastNameisPresent);
			 
			 // IS VISIBLE
			 Boolean FieldLastNameisVisable = driver.findElement(By.id("id_img_youtube")).isDisplayed();
			 System.out.println("isDisplayed? " + FieldLastNameisVisable);
			 
			 // IS ENABLED
			 Boolean FieldLastNameisEnabled = driver.findElement(By.id("id_img_youtube")).isEnabled();
			 System.out.println("isEnabled? " + FieldLastNameisEnabled);
			 
			 // LOCATION
			 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("id_img_youtube")).getLocation();
			 System.out.println("Location X: " + FieldLastNameLocation.getX());
			 System.out.println("Location Y: " + FieldLastNameLocation.getY());
			 
			 // SIZE
			 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("id_img_youtube")).getSize();
			 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
			 System.out.println("Size Height: " + FieldLastNameSize.getHeight());

     }
  @Test
  public void test_26_Button_Reset() {
		 
		 //TEST ID
		 System.out.println(" ");
		 System.out.println(">>> TEST 26 Button (Reset) >>>");
			
			 
			 // IS PRESENT
			 boolean FieldLastNameisPresent = driver.findElements(By.id("id_reset_button")).size() > 0;
			 System.out.println("isPresent? " + FieldLastNameisPresent);
			 
			 // IS VISIBLE
			 Boolean FieldLastNameisVisable = driver.findElement(By.id("id_reset_button")).isDisplayed();
			 System.out.println("isDisplayed? " + FieldLastNameisVisable);
			 
			 // IS ENABLED
			 Boolean FieldLastNameisEnabled = driver.findElement(By.id("id_reset_button")).isEnabled();
			 System.out.println("isEnabled? " + FieldLastNameisEnabled);
			 
			 // LOCATION
			 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("id_reset_button")).getLocation();
			 System.out.println("Location X: " + FieldLastNameLocation.getX());
			 System.out.println("Location Y: " + FieldLastNameLocation.getY());
			 
			 // SIZE
			 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("id_reset_button")).getSize();
			 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
			 System.out.println("Size Height: " + FieldLastNameSize.getHeight());

     }
  
  @Test
  public void test_27_Button_Submit() {
		 
		 //TEST ID
		 System.out.println(" ");
		 System.out.println(">>> TEST 27 Button (Submit) >>>");
			
			 
			 // IS PRESENT
			 boolean FieldLastNameisPresent = driver.findElements(By.id("id_reset_button")).size() > 0;
			 System.out.println("isPresent? " + FieldLastNameisPresent);
			 
			 // IS VISIBLE
			 Boolean FieldLastNameisVisable = driver.findElement(By.id("id_reset_button")).isDisplayed();
			 System.out.println("isDisplayed? " + FieldLastNameisVisable);
			 
			 // IS ENABLED
			 Boolean FieldLastNameisEnabled = driver.findElement(By.id("id_reset_button")).isEnabled();
			 System.out.println("isEnabled? " + FieldLastNameisEnabled);
			 
			 // LOCATION
			 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("id_reset_button")).getLocation();
			 System.out.println("Location X: " + FieldLastNameLocation.getX());
			 System.out.println("Location Y: " + FieldLastNameLocation.getY());
			 
			 // SIZE
			 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("id_reset_button")).getSize();
			 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
			 System.out.println("Size Height: " + FieldLastNameSize.getHeight());

     }
  @Test
  public void test_28_Dynamic_Text_TodayDate() {
		 
		 //TEST ID
		 System.out.println(" ");
		 System.out.println(">>> TEST 28 Dynamic (Today's Date) >>>");
			
			 
			 // IS PRESENT
			 boolean FieldLastNameisPresent = driver.findElements(By.id("timestamp")).size() > 0;
			 System.out.println("isPresent? " + FieldLastNameisPresent);
			 
			 // IS VISIBLE
			 Boolean FieldLastNameisVisable = driver.findElement(By.id("timestamp")).isDisplayed();
			 System.out.println("isDisplayed? " + FieldLastNameisVisable);
			 
			 // IS ENABLED
			 Boolean FieldLastNameisEnabled = driver.findElement(By.id("timestamp")).isEnabled();
			 System.out.println("isEnabled? " + FieldLastNameisEnabled);
			 
			 // LOCATION
			 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("timestamp")).getLocation();
			 System.out.println("Location X: " + FieldLastNameLocation.getX());
			 System.out.println("Location Y: " + FieldLastNameLocation.getY());
			 
			 // SIZE
			 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("timestamp")).getSize();
			 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
			 System.out.println("Size Height: " + FieldLastNameSize.getHeight());

     }
  @Test
  public void test_29_Dynamic_Text_Copyright() {
		 
		 //TEST ID
		 System.out.println(" ");
		 System.out.println(">>> TEST 29 Dynamic (Copyright) >>>");
			
			 
			 // IS PRESENT
			 boolean FieldLastNameisPresent = driver.findElements(By.id("copyright")).size() > 0;
			 System.out.println("isPresent? " + FieldLastNameisPresent);
			 
			 // IS VISIBLE
			 Boolean FieldLastNameisVisable = driver.findElement(By.id("copyright")).isDisplayed();
			 System.out.println("isDisplayed? " + FieldLastNameisVisable);
			 
			 // IS ENABLED
			 Boolean FieldLastNameisEnabled = driver.findElement(By.id("copyright")).isEnabled();
			 System.out.println("isEnabled? " + FieldLastNameisEnabled);
			 
			 // LOCATION
			 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("copyright")).getLocation();
			 System.out.println("Location X: " + FieldLastNameLocation.getX());
			 System.out.println("Location Y: " + FieldLastNameLocation.getY());
			 
			 // SIZE
			 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("copyright")).getSize();
			 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
			 System.out.println("Size Height: " + FieldLastNameSize.getHeight());

     }
  @Test
  public void test_30_Dynamic_Text_OSbrowser() {
		 
		 //TEST ID
		 System.out.println(" ");
		 System.out.println(">>> TEST 30 Dynamic Text (OS & Browser) >>>");
			
			 
			 // IS PRESENT
			 boolean FieldLastNameisPresent = driver.findElements(By.id("os_browser")).size() > 0;
			 System.out.println("isPresent? " + FieldLastNameisPresent);
			 
			 // IS VISIBLE
			 Boolean FieldLastNameisVisable = driver.findElement(By.id("os_browser")).isDisplayed();
			 System.out.println("isDisplayed? " + FieldLastNameisVisable);
			 
			 // IS ENABLED
			 Boolean FieldLastNameisEnabled = driver.findElement(By.id("os_browser")).isEnabled();
			 System.out.println("isEnabled? " + FieldLastNameisEnabled);
			 
			 // LOCATION
			 org.openqa.selenium.Point FieldLastNameLocation = driver.findElement(By.id("os_browser")).getLocation();
			 System.out.println("Location X: " + FieldLastNameLocation.getX());
			 System.out.println("Location Y: " + FieldLastNameLocation.getY());
			 
			 // SIZE
			 org.openqa.selenium.Dimension FieldLastNameSize = driver.findElement(By.id("os_browser")).getSize();
			 System.out.println("Size Width: " + FieldLastNameSize.getWidth());
			 System.out.println("Size Height: " + FieldLastNameSize.getHeight());
			 System.out.println(" ");
			 System.out.println("SIGN UP PAGE");
			 driver.quit();
  }
}
