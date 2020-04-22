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
public class YourHomeFeaturePage extends Utility {

    private static final Logger log = LogManager.getLogger(YourHomeFeaturePage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Your home')]")
    WebElement _getYourHomeFeatureText;

    public String getYourHomeMessage(){
        Reporter.log("Getting your home feature text " + _getYourHomeFeatureText.toString()+"<br>");
        log.info("Getting your home feature text " + _getYourHomeFeatureText.toString());
        return getTextFromElement(_getYourHomeFeatureText);
    }

}
