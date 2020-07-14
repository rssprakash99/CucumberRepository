package stepDefinations;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MapsStepDefinations {
	public static WebDriver driver;
	public static String url = "https://ui.freecrm.com/";
	
	@Given("^When user is on Free CRM login page$")
	public void when_user_is_on_Free_CRM_login_page() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get(url);
		 Thread.sleep(2000);
	}

	@When("^user enters userid and password$")
	public void user_enters_userid_and_password(DataTable one)throws InterruptedException  {
		
		for(Map<String, String> data : one.asMaps(String.class, String.class)) {
			driver.findElement(By.name("email")).sendKeys(data.get("userid"));
			Thread.sleep(2000);
		    driver.findElement(By.name("password")).sendKeys(data.get("password"));
		    Thread.sleep(2000);
		}
	    
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException  {
	    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	    Thread.sleep(2000);
	}

	@Then("^user navigated to home page$")
	public void user_navigated_to_home_page()  {
		String homepageTitle = driver.getTitle();
		System.out.println("Home page title is =====>"+ homepageTitle);
	}

	@Then("^user clicks on deals button and clicks New button$")
	public void user_clicks_on_deals_button_and_clicks_New_button() throws InterruptedException  {
	    driver.findElement(By.xpath("//span[text() = 'Deals']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[text()='New']")).click();
	    Thread.sleep(2000);
	}

	@Then("^user entered into new deal page$")
	public void user_entered_into_new_deal_page() {
	String dealPageTitle = 	driver.getTitle();
	System.out.println("Title of the deal page is ======>"+dealPageTitle);	  
	}

	@Then("^user gives deal details$")
	public void user_gives_deal_details(DataTable dealData) throws InterruptedException  {
		
		for(Map<String, String> data : dealData.asMaps(String.class, String.class)) {
	    
		
		driver.findElement(By.name("title")).sendKeys(data.get("title"));
		Thread.sleep(2000);
		driver.findElement(By.name("probability")).sendKeys(data.get("probability"));
		Thread.sleep(2000);
		driver.findElement(By.name("amount")).sendKeys(data.get("amount"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text() = 'Deals']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[text()='New']")).click();
	    Thread.sleep(2000);
		}
		
	}

	@Then("^close the browser$")
	public void close_the_browser() throws InterruptedException  {
	    Thread.sleep(4000);
	    driver.quit();
	    
	}
  
  
  
  

}
