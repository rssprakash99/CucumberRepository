package stepDefinations;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HooksStepDefination {
	
	@Before
	public void doLogin() {
		System.out.println("User enters into login page with id and password");
	}
	
	@After
	public void tearDown() {
		System.out.println("User quits the browser");
	}
	
	
	@Given("^User is on Deals page$")
	public void user_is_on_Deals_page()  {
	    System.out.println("User is on Deal page");
	}

	@Then("^User creates deals as per his data$")
	public void user_creates_deals_as_per_his_data()  {
	   System.out.println("User is creates deals as per his data");
	}

	@Then("^User saves the data$")
	public void user_saves_the_data()  {
	    System.out.println("User saves the data");
	}
	
	@Given("^user is on contacts page$")
	public void user_is_on_contacts_page()  {
	    System.out.println("User is on contacts page");
	}

	@Then("^user enters the contact details$")
	public void user_enters_the_contact_details()  {
	    System.out.println("User enters the contact details");
	}


}
