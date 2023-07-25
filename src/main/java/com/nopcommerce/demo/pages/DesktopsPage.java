package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    public DesktopsPage () {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopsText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortByDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement sortByDisplayDropDown;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement productList;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputer;

    public String verifyDesktopsText() {
        log.info("verifying Desktops Text:" + desktopsText.toString());
        return getTextFromElement(desktopsText);
    }

    public void selectBySortBySortByDropDown(String sortBy) {
        log.info("Selecting By SortBy SortBy Dropdown:" + sortBy.toString());
        selectByVisibleTextFromDropDown(sortByDropDown, sortBy);
    }

    public void selectByDisplayDropDown(String displayBy) {
        log.info("Selecting By Display Dropdown:" + sortByDisplayDropDown.toString());
        selectByVisibleTextFromDropDown(sortByDisplayDropDown, displayBy);
    }

    public void selectByProductList() {
        log.info("Selecting product By ProductList:" + productList.toString());
        clickOnElement(productList);
    }

    public void clickOnBuildYourOwnComputer() {
        log.info("Clicking  On Build Your Own Computer tab:" + buildYourOwnComputer.toString());
        clickOnElement(buildYourOwnComputer);
    }
}
