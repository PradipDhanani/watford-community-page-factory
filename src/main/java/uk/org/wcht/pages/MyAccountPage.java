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
public class MyAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    @FindBy(xpath = "//div[@class='panel-heading']")
    WebElement _getTextMyAccount;


    public String getMyAccountMessage() {
        Reporter.log("Getting my account message " + _getTextMyAccount.toString() + "<br>");
        log.info("Cliking my acount message " + _getTextMyAccount.toString());
        return getTextFromElement(_getTextMyAccount);
    }


}
