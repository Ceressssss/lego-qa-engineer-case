package tests;

import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
import pageobjects.AvatarSelectionPage;
import pageobjects.BandNamePage;

public class AvatarSelectionPageTest extends BaseTestClass{
    AvatarSelectionPage avatarSelectionPage;
    BandNamePage bandNamePage;

    public AvatarSelectionPageTest(AppiumDriver mainDriver) {
        super(mainDriver);
        this.avatarSelectionPage = new AvatarSelectionPage(driver);
        this.bandNamePage = new BandNamePage(driver);
    }

    public void selectFirstAvatarTest(){
        avatarSelectionPage.firstAvatar().click();
        Assert.assertTrue(avatarSelectionPage.firstAvatarSelected().isDisplayed());
    }

    public void confirmAvatarChoiceTest(){
        avatarSelectionPage.confirmAvatarChoiceButton().click();
        Assert.assertTrue(bandNamePage.bandNamePageContainer().isDisplayed());
    }
}
