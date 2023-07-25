package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    public ComputerPage () {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computersText;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerTab;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement desktopsLink;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]")
    WebElement notebooksLink;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[3]/a[1]")
    WebElement softwareLink;



    public String verifyComputersText() {
        log.info("verifying Computer Text:" + computersText.toString());
        return getTextFromElement(computersText);
    }

    public void clickOnComputertab(){
        log.info("clicking on  Computer Tab:" + computerTab.toString());
        clickOnElement(computerTab);

    }

    public void selectFromSublist(String subList) {
        log.info("selecting from Sublist:" );

        switch (subList) {
            case "Desktops":
                clickOnElement(desktopsLink);
                break;
            case "Notebooks":
                clickOnElement(notebooksLink);
                break;
            case "Software":
                clickOnElement(softwareLink);
                break;
            default:
                break;
        }
    }
}
