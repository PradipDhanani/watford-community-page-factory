package uk.org.wcht.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.org.wcht.Utility.Utility;

/**
 * Created by Pradip
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//a[@class='header__nav-area-title'][contains(text(),'Your home')]")
    WebElement _yourHomeFeature;
    @FindBy(xpath = "//div[contains(text(),'Your account')]")
    WebElement _clickOnYourAccount;

    public void clickOnYourHomeFeature(){
        Reporter.log("Clicking on your home feature " + _yourHomeFeature.toString()+"<br>");
        log.info("Clicking on your home feature " + _yourHomeFeature.toString());
        clickOnElement(_yourHomeFeature);
    }
    public void clickOnYourAccountButton(){
     Reporter.log("Clicking on your account feature " +  _clickOnYourAccount.toString()+"<br>");
     log.info("Clicking on your account feature " + _clickOnYourAccount.toString());
        clickOnElement(_clickOnYourAccount);
    }


}
