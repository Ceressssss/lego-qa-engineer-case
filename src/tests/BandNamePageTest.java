package tests;

import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
import pageobjects.BandNamePage;
import pageobjects.TutorialVideoPage;

public class BandNamePageTest extends BaseTestClass{

    //APP PAGES
    private final BandNamePage bandNamePage;
    private final TutorialVideoPage tutorialVideoPage;

    public BandNamePageTest(AppiumDriver mainDriver){
        super(mainDriver);
        this.bandNamePage = new BandNamePage(driver);
        this.tutorialVideoPage = new TutorialVideoPage(driver);
    }

    public void confirmBandNameTest(){
        bandNamePage.acceptGeneratedNameButton().click();

        // Wait for up to 20 seconds for the first page of the tutorial video
        super.waitForElement(tutorialVideoPage.firstPageOfTutorialVideoContainer());

        Assert.assertTrue(tutorialVideoPage.firstPageOfTutorialContinueButton().isDisplayed());
    }
}
