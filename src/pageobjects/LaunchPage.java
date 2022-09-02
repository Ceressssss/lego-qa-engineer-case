package pageobjects;

import io.appium.java_client.*;
import org.openqa.selenium.WebElement;


public class LaunchPage extends BasePageObject{

    public LaunchPage(AppiumDriver mainDriver) {
        super(mainDriver);
    }

    public WebElement launchPageContainer(){
        return super.findElementByImage("pathToLaunchPageImageRef");
    }

    public WebElement getStartedButton(){
        return super.findElementByImage("pathToGetStartedImageRef");
    }
}
