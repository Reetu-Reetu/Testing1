package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.SQLOutput;

public class GitDemo {
    @Given("user is on login Page")
    public void userIsOnLoginPage() {
        System.out.println("hI");
        System.out.println("user is on logon page");
        System.out.println("git usage learning");
    }

    @When("user enter valid username and password")
    public void userEnterValidUsernameAndPassword() {
        System.out.println("ghj");
    }

    @And("Clicks on login button")
    public void clicksOnLoginButton() {
        System.out.println("hjhj");
    }

    @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
        System.out.println("ghjk");
    }

    @When("user enter invalid username and password")
    public void userEnterInvalidUsernameAndPassword() {
        System.out.println("fghjkl");
    }

    @Then("error message is displayed-Invalid Credentials")
    public void errorMessageIsDisplayedInvalidCredentials() {
        System.out.println("sdfghjkl");
    }
}
