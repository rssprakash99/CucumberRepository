package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

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
    public void beforeFirstScenario() {
        System.out.println("Before hook for @First");
    }

    @Before("@Second")
    public void beforeSecondScenario() {
        System.out.println("Before hook for @Second");
    }

    @Before("@Third")
    public void beforeThirdScenario() {
        System.out.println("Before hook for @Third");
    }

    @Given("^This is first test$")
    public void this_is_first_test() {
        System.out.println("1st STEP..................");
    }

    @Given("^This is frist test$")
    public void this_is_frist_test() {

        WebDriver driver = Hooks.driver;

        System.out.println("Opening Google in BrowserStack...");

        // 🔥 This will trigger BrowserStack session
        driver.get("https://www.google.com");
        Assert.assertEquals("Prakash","Suresh");
    }

    @When("^This is second test$")
    public void this_is_second_test() {
        System.out.println("2nd STEP......................");
    }

    @Then("^This is third test$")
    public void this_is_third_test() {
        System.out.println("3rd STEP......................");
    }

    @Given("^This is first step$")
    public void this_is_first_step() {
        System.out.println("1st step..........");
    }
}