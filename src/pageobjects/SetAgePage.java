package pageobjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SetAgePage extends BasePageObject{

    public SetAgePage(AppiumDriver mainDriver) {
        super(mainDriver);
    }

    public WebElement ageSettingPageContainer(){
        return driver.findElementByImage("pathToAgeSettingPageImageRef");
    }

    public WebElement yearSliderText(){
        return driver.findElement(By.id("yearSliderText"));
    }

    public WebElement yearSlider(){
        return super.findElementByImage("pathToYearSliderImageRef");
    }

    public WebElement yearSliderButton(){
        return super.findElementByImage("pathToYearSliderButtonImageRef");
    }

    public WebElement confirmYearButton(){
        return super.findElementByImage("pathToConfirmYearButtonImageRef");
    }
}
