package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerSteps {
    @When("I click on computer tab {string}")
    public void iClickOnComputerTab(String topMenu) {
        new HomePage().selectTopMenu(topMenu);
    }

    @Then("I should be able to Verify  text")
    public void iShouldBeAbleToVerifyText() {
        Assert.assertEquals(new ComputerPage().verifyComputersText(),"Computer","Computer text is not visible");

    }

    @And("I click on Desktop link {string}")
    public void iClickOnDesktopLink(String subList) {
        new ComputerPage().selectFromSublist(subList);
    }

    @Then("I should be able to verify Desktop text")
    public void iShouldBeAbleToVerifyDesktopText() {
        Assert.assertEquals(new DesktopsPage().verifyDesktopsText(),"Desktop","Desktop text is not available");
    }

    @And("I click on product name build your own computer")
    public void iClickOnProductNameBuildYourOwnComputer() {
        new DesktopsPage().clickOnBuildYourOwnComputer();
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processer) {
        new BuildYourComputerPage().selectProcessorFromDropDown(processer);
    }


    @And("I select RAM {string}")
    public void iSelectRAM(String ram) {
        new BuildYourComputerPage().selectRamFromDropDown(ram);
    }

    @And("I select HDD {string}")
    public void iSelectHDD(String hddRadio) {
        new BuildYourComputerPage().selectHDDRadios(hddRadio);
    }

    @And("I select OS {string}")
    public void iSelectOS(String osRadio) {
        new BuildYourComputerPage().selectOSRadioButton(osRadio);
    }

    @And("I select Software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourComputerPage().selectSoftwareType(software);
    }

    @And("I click on  Button")
    public void iClickOnButton() {
    }

    @Then("I verify  the message")
    public void iVerifyTheMessage() {
    }
}
