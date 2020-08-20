package StepDefinations;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;
import java.util.Map;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;




@RunWith(Cucumber.class)
public class stepDeination {
	
	WebDriver driver ;
	@Given("User is at landing page")
	public void User_is_at_landing_page()throws Throwable
	{
		
		  String path =
		  "C:\\Users\\A707182\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", path);
		  
		  System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,
		  "true"); driver = new ChromeDriver();
		  driver.get("http://newtours.demoaut.com/");
		  driver.manage().window().maximize();
		 
		
		
	}
	
	@When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
       	Thread.sleep(3000);
		//id="email"
		driver.findElement(By.name("userName")).sendKeys(strArg1);
		//id="pass"
		driver.findElement(By.name("password")).sendKeys(strArg2);
		//id="u_0_b"
		driver.findElement(By.name("login")).click();
		
	 	
	}
	
	@Then("Home page is displayed")
	public void Home_page_is_displayed()throws Throwable
	{
		String title = driver.getTitle();
		System.out.println("Home Page: " + title);
	}
	
	@And("Cards are displayed")
	public void Cards_are_displayed()throws Throwable
	{
		System.out.println("Login done! ");
		driver.quit();
	}
	
	@When("User submit following details")
	public void user_submit_following_details(DataTable data)throws Throwable
	{
	driver.findElement(By.linkText("REGISTER")).click();
	List<Map<String,String>> list = data.asMaps(String.class, String.class);
		for(int i= 0 ; i< list.size(); i++)
		{
			driver.findElement(By.name("firstName")).sendKeys(list.get(i).get("Firstname"));
			driver.findElement(By.name("lastName")).sendKeys(list.get(i).get("Lastname"));
			driver.findElement(By.name("phone")).sendKeys(list.get(i).get("PhoneNumb"));
			driver.findElement(By.name("userName")).sendKeys(list.get(i).get("MailID"));
			driver.findElement(By.name("email")).sendKeys(list.get(i).get("UserID"));
			driver.findElement(By.name("password")).sendKeys(list.get(i).get("Password"));
			driver.findElement(By.name("confirmPassword")).sendKeys(list.get(i).get("CPassword"));
			driver.findElement(By.name("register")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("REGISTER")).click();
		}
	
	}
	
	 @When("^User login with username (.+) and password (.+)$")
	    public void user_login_with_username_and_password(String username, String password) throws Throwable
	 	{
		 	driver.findElement(By.name("userName")).sendKeys(username);
		 	System.out.println(username);
			driver.findElement(By.name("password")).sendKeys(password);
			System.out.println(password);
			driver.findElement(By.name("login")).click();
	    }


	 
}
