package stepDefinition;

import Steps.Loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class loginTest extends PageObject{
        private Loginpage   loginpage;



    @Given("Open anhtester login page")
        public void  openhrmspage() {
                open();
            }


    @When("I select {string}")
    public void iSelect(String Tengame) {
        WebElementFacade   btnStartPractising =
                $(By.xpath(String.format("//a[contains(text(),'%s')]", Tengame)));
        btnStartPractising.waitUntilVisible().click();

    }


    @Then("I Should see Simple Form Demo label")
    public void iShouldSeeSimpleFormDemoLabel() {
        WebElementFacade   labelSimpleFormDemo = $(By.xpath("//a[@class='list-group-item']"));
        labelSimpleFormDemo.waitUntilVisible();
    }

    @And("I click label Simple Form Demo")
    public void iClickLabelSimpleFormDemo() {
        loginpage.ClickLabel();
    }

    @And("I click close ads")
    public void iClickCloseAds() {
        WebElementFacade   iconclose = $(By.id("at-cv-lightbox-close"));
        iconclose.waitUntilVisible().click();
    }

    @And("I add message {string}")
    public void iAddMessage(String message) {
        WebElementFacade   textboxMessage = $(By.xpath("//input[@id='user-message']"));
        // textboxMessage.click();
        textboxMessage.sendKeys(message);
        WebElementFacade   btnShowMassage =$(By.xpath("//button[text()=\"Show Message\"]"));
        btnShowMassage.click();
        WebElementFacade   labelDisplay =$(By.xpath(String.format("//span[text()='%s']", message)));
        labelDisplay.waitUntilVisible();
    }
}
