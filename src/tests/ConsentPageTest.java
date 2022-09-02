package tests;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageobjects.CameraPermissionsPage;
import pageobjects.DataConsentPage;

public class ConsentPageTest extends BaseTestClass{
    DataConsentPage dataConsentPage;
    CameraPermissionsPage cameraPermissionsPage;

    public ConsentPageTest(AppiumDriver mainDriver) {
        super(mainDriver);
        this.dataConsentPage = new DataConsentPage(driver);
        this.cameraPermissionsPage = new CameraPermissionsPage(driver);
    }

    public void testNecessaryDataCannotBeToggledOff(){
        dataConsentPage.necessaryDataToggledOn().click();
        Assert.assertTrue(dataConsentPage.necessaryDataToggledOn().isDisplayed());
    }

    public void testToggleOnExperienceData(){
        dataConsentPage.experienceDataToggledOff().click();
        Assert.assertTrue(dataConsentPage.experienceDataToggledOn().isDisplayed());
    }

    public void testToggleOffExperienceData(){
        dataConsentPage.experienceDataToggledOn().click();
        Assert.assertTrue(dataConsentPage.experienceDataToggledOff().isDisplayed());
    }

    public void testSaveConsentDataSettings(){
        dataConsentPage.saveSettingsButton().click();

        // Wait for up to 20 seconds for camera permissions page
        super.waitForElement(cameraPermissionsPage.cameraPermissionsPageContainer());

        Assert.assertTrue(cameraPermissionsPage.cameraPermissionsPageContainer().isDisplayed());
    }
}
