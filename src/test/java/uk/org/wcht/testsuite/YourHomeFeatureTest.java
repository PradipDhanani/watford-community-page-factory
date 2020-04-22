package uk.org.wcht.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.org.wcht.pages.HomePage;
import uk.org.wcht.pages.YourHomeFeaturePage;
import uk.org.wcht.testbase.TestBase;

/**
 * Created by Pradip
 */
public class YourHomeFeatureTest extends TestBase {
    HomePage homePage;
    YourHomeFeaturePage yourHomeFeaturePage;

    @BeforeMethod(groups = {"smoke","regression","sanity"})
    public void setUp() {
        homePage = new HomePage();
        yourHomeFeaturePage = new YourHomeFeaturePage();
    }

    @Test(groups = {"smoke","regression"},priority = 1)
    public void verifyUserShouldNavigateToYourHomeFeature() {
        homePage.clickOnYourHomeFeature();
        String expectedResult = "Your home";
        String actualResult = yourHomeFeaturePage.getYourHomeMessage();
        Assert.assertEquals(expectedResult,actualResult);


    }
}
