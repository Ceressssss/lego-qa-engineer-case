package tests;

import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
import pageobjects.AvatarSelectionPage;
import pageobjects.CameraPermissionsPage;
import pageobjects.DataConsentPage;

public class CameraPermissionPageTest extends BaseTestClass{

    //APP PAGES
    CameraPermissionsPage cameraPermissionsPage;
    AvatarSelectionPage avatarSelectionPage;

    public CameraPermissionPageTest(AppiumDriver mainDriver) {
        super(mainDriver);
        this.cameraPermissionsPage = new CameraPermissionsPage(driver);
        this.avatarSelectionPage = new AvatarSelectionPage(driver);
    }

    public void testAcceptCameraPermissions(){
        cameraPermissionsPage.acceptCameraPermissionsButton().click();
        cameraPermissionsPage.confirmCameraAccess().click();
        Assert.assertTrue(avatarSelectionPage.avatarPageContainer().isDisplayed());
    }
}
