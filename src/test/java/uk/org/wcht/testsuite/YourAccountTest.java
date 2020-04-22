package uk.org.wcht.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.org.wcht.pages.HomePage;
import uk.org.wcht.pages.MyAccountPage;
import uk.org.wcht.testbase.TestBase;

/**
 * Created by Pradip
 */
public class YourAccountTest extends TestBase {
    HomePage homePage;
    MyAccountPage myAccountPage;

    @BeforeMethod(groups = {"smoke","regression","sanity"})
    public void setUp() {
        homePage = new HomePage();
        myAccountPage = new MyAccountPage();
    }

    @Test(groups = {"sanity","regression"},priority = 0)
    public void verifyUserShouldNavigateToYourAccountPage() {
        homePage.clickOnYourAccountButton();
        String expectedResult = "My Account";
        String actualResult = myAccountPage.getMyAccountMessage();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
