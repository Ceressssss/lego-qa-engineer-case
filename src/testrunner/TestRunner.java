package testrunner;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.json.JSONException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.BandNamePage;
import tests.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestRunner {


    // APPIUM DRIVER FOR TEST
    AppiumDriver appiumDriver;

    // TEST CLASSES
    LandingPageTest landingPageTest;
    AgePageTest agePageTest;
    ConsentPageTest consentPageTest;
    CameraPermissionPageTest cameraPermissionPageTest;
    AvatarSelectionPageTest avatarSelectionPageTest;
    BandNamePageTest bandNamePageTest;


    @BeforeTest
    void setupDriver() throws MalformedURLException {
        // SETUP CAPABILITIES AND INITIALIZE DRIVER
        URL appiumServerUrl = new URL("http://127.0.0.1/wd/hub");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("deviceName", "TestDevice");
        desiredCapabilities.setCapability("platformVersion", "10.0");
        desiredCapabilities.setCapability("udid", "udidPlaceholder");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("noReset", true);
        desiredCapabilities.setCapability("app", "path/to/test-app");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, 4723);
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("waitForIdleTimeout", 1200);



        // SETUP DRIVER AND IMPLICIT WAIT
        appiumDriver = new AndroidDriver(appiumServerUrl,desiredCapabilities);
        appiumDriver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        // SETUP TEST CLASSES
        landingPageTest = new LandingPageTest(appiumDriver);
        agePageTest = new AgePageTest(appiumDriver);
        consentPageTest = new ConsentPageTest(appiumDriver);
        cameraPermissionPageTest = new CameraPermissionPageTest(appiumDriver);
        avatarSelectionPageTest = new AvatarSelectionPageTest(appiumDriver);
        bandNamePageTest = new BandNamePageTest(appiumDriver);

    }
    @Test
    public void testFirstTimeLaunchExperience() throws JSONException {
        landingPageTest.testLandingPageIsFirstPage();
        landingPageTest.testClickSaetIGangSendsUserToAgeSettingPage();

        agePageTest.testMoveAgeSlider();
        agePageTest.testBekraeftSendsUserToConsentPage();

        consentPageTest.testNecessaryDataCannotBeToggledOff();
        consentPageTest.testToggleOnExperienceData();
        consentPageTest.testToggleOffExperienceData();
        consentPageTest.testSaveConsentDataSettings();

        cameraPermissionPageTest.testAcceptCameraPermissions();

        avatarSelectionPageTest.selectFirstAvatarTest();
        avatarSelectionPageTest.confirmAvatarChoiceTest();

        bandNamePageTest.confirmBandNameTest();
    }

    @AfterTest
    public void tearDown() {
        appiumDriver.quit();
    }
}
