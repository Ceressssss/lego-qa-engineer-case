package tests;

import cucumber.api.java.cs.A;
import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
import pageobjects.LaunchPage;
import pageobjects.SetAgePage;

public class LandingPageTest extends BaseTestClass{

    //APP PAGES
    private final LaunchPage launchPage;
    private final SetAgePage setAgePage;

    public LandingPageTest(AppiumDriver mainDriver){
        super(mainDriver);
        this.launchPage = new LaunchPage(driver);
        this.setAgePage = new SetAgePage(driver);
    }

    public void testLandingPageIsFirstPage(){
        // Should be run as first test right after launch
        Assert.assertTrue(launchPage.launchPageContainer().isDisplayed());
    }

    public void testClickSaetIGangSendsUserToAgeSettingPage(){
        launchPage.getStartedButton().click();
        Assert.assertTrue(setAgePage.ageSettingPageContainer().isDisplayed());
    }

}
