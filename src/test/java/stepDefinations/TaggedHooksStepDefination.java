package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooksStepDefination {
	@Before()
	public void iamFirst() {
		System.out.println("Iam always first.....");
	}
	@After()
	public void iamLast() {
		System.out.println("Iam always Last.......");
	}
	
	@Before("@First")
	@Given("^This is first test$")
	public void this_is_first_test()  {
		System.out.println("1st STEP..................");
	}

	@When("^This is second test$")
	public void this_is_second_test()  {
	 System.out.println("2nd STEP......................");   
	}

	@Then("^This is third test$")
	public void this_is_third_test()  {
	   System.out.println("3rd STEP......................");
	}
    @Before("@Second")
	@Given("^This is frist test$")
	public void this_is_frist_test() throws Throwable {
	    System.out.println("1st step................");
	}
    @Before("@Third")
	@Given("^This is first step$")
	public void this_is_first_step() throws Throwable {
	   System.out.println("1st step..........");
	}



}
