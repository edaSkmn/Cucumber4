package StepDefinitions;

import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_CountrySteps {
    LeftNav ln=new LeftNav();
    @And("Navigate to country page")
    public void navigateToCountryPage() {
        ln.findAndClick("setUpOne");
        ln.findAndClick("parameters");
        ln.findAndClick("countries");

    }

    @When("Create a country")
    public void createACountry() {
        //TODO: createCountry

    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        //TODO: successMessageShouldBeDisplayed

    }
}
