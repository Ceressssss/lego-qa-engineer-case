package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Point;
import org.testng.Assert;
import pageobjects.DataConsentPage;
import pageobjects.LaunchPage;
import pageobjects.SetAgePage;

import java.awt.*;
import java.time.Duration;

public class AgePageTest extends BaseTestClass{

    // APPIUM DRIVER
    AppiumDriver driver;

    // TOUCH ACTIONS
    private final TouchAction<?> swipe;

    //APP PAGES
    private final SetAgePage setAgePage;
    private final DataConsentPage dataConsentPage;

    public AgePageTest(AppiumDriver mainDriver){
        super(mainDriver);
        this.swipe = new TouchAction<>(driver);
        this.setAgePage = new SetAgePage(driver);
        this.dataConsentPage = new DataConsentPage(driver);
    }

    public void testMoveAgeSlider(){
        Point yearSliderButtonPosition = setAgePage.yearSliderButton().getLocation();

        // Grab initial slider position
        Point yearSliderInitialPosition = setAgePage.yearSliderButton().getLocation();

        // Move slider button
        moveAgeSlider(yearSliderButtonPosition.x, yearSliderButtonPosition.y, yearSliderButtonPosition.x-100,yearSliderButtonPosition.y);

        // Grab end slider position
        Point yearSliderEndingPosition = setAgePage.yearSlider().getLocation();

        Assert.assertNotEquals(yearSliderInitialPosition,yearSliderEndingPosition);
    }

    public void testBekraeftSendsUserToConsentPage(){
        setAgePage.confirmYearButton().click();
        Assert.assertTrue(dataConsentPage.dataConsentPageContainer().isDisplayed());
    }

    public void moveAgeSlider(int xStart, int yStart, int xEnd, int yEnd) {
        swipe.press(PointOption.point(xStart,yStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)))
                .moveTo(PointOption.point(xEnd, yEnd))
                .release()
                .perform();
    }

}
