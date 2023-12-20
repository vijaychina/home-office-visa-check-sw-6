package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectNationalityPage extends Utility {
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueAfterNationality;


    public void selectNationality(String nationality) {
        log.info(" Select nation from drop down list : " + nationalityDropDownList.toString());
        selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);

    }

    public void clickNextStepButton() {
        log.info("Click on Continue after selecting nationality" + continueAfterNationality.toString());
        clickOnElement(continueAfterNationality);

    }
}